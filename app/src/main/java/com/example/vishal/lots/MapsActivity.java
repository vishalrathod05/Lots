package com.example.vishal.lots;

import android.content.Intent;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import model.ParkingAvailability;
import model.ParkingType;
import model.ParkingZone;
import model.PermitGroup;
import model.User;

import static android.R.attr.data;

public class MapsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;

    private RelativeLayout mButtonA, mButtonB, mButtonC, mButtonD;
    private Button innerBtnA, innerBtnB, innerBtnC, innerBtnD;
    Map<PermitGroup, List<ParkingZone>> mapData;
    SharedPrefManager prefManager;
    private static final int MY_PERMISSIONS_REQUEST_ACCESS_LOCATION = 847;
    private CoordinatorLayout mCoordinatorLayout;
    ParkingMapBuilder mapBuilder;
    String currentlySelectedZone = null;
    GoogleApiClient mGoogleApiClient;
    Location mLastLocation;
    private NavigationView mNavigationView;
    private String userEmailId;
    private String permitType;
    DrawerLayout drawer;
    private DatabaseReference mydb;
    private DatabaseReference mydbchildusers;
    private Button answer0, answer1, answer2, answer3;
    private BottomSheetBehavior mBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mydb = FirebaseDatabase.getInstance().getReference();
        mydbchildusers = mydb.child("User");

        Intent i = getIntent();
        if(i!=null){
            userEmailId = i.getStringExtra("userEmailId");
            userEmailId = encodeString(userEmailId);
            permitType = i.getStringExtra("permitType");
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
        prefManager = new SharedPrefManager();
        mapBuilder = new ParkingMapBuilder();
        mapData = mapBuilder.parkingZoneMapData();

        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);

        //setup BottomSheet
        View bottomSheet = mCoordinatorLayout.findViewById(R.id.bottom_sheet);
        mBehavior = BottomSheetBehavior.from(bottomSheet);
        mBehavior.setHideable(true);
        mBehavior.setBottomSheetCallback(bottomSheetCallback);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        // Set the drawer toggle as the DrawerListener
        drawer.addDrawerListener(toggle);

        mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        initializeUI();
    }

    @Override
    public void onSupportActionModeStarted(@NonNull ActionMode mode) {
        super.onSupportActionModeStarted(mode);
    }

    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {
        @Override
        public void onStateChanged(@NonNull View bottomSheet, int newState) {
            switch (newState) {
                case BottomSheetBehavior.STATE_HIDDEN:
                    break;

                case BottomSheetBehavior.STATE_EXPANDED:
//                    for (int i = 0; i < mCharts.length; i++) {
//                        mCharts[i].animate();
//                    }
                    break;

                default:

                    break;
            }
        }

        @Override
        public void onSlide(@NonNull View bottomSheet, float slideOffset) {

        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        ValueEventListener eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                if(user!=null){
                    permitType = user.getPermitZone();
                    Log.d("Fetched User Name: ", user.getUserName());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        mydbchildusers.child(userEmailId).addValueEventListener(eventListener);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);  // OPEN DRAWER
                return true;
                }
        return super.onOptionsItemSelected(item);

    }

    private void initializeUI() {
        mButtonA = (RelativeLayout) findViewById(R.id.input1btn);
        mButtonB = (RelativeLayout) findViewById(R.id.input2btn);
        mButtonC = (RelativeLayout) findViewById(R.id.input3btn);
        mButtonD = (RelativeLayout) findViewById(R.id.input4btn);

        mButtonA.setOnClickListener(this);
        mButtonB.setOnClickListener(this);
        mButtonC.setOnClickListener(this);
        mButtonD.setOnClickListener(this);

        innerBtnA = (Button) findViewById(R.id.inner1btn);
        innerBtnB = (Button) findViewById(R.id.inner2btn);
        innerBtnC = (Button) findViewById(R.id.inner3btn);
        innerBtnD = (Button) findViewById(R.id.inner4btn);

        innerBtnA.setOnClickListener(this);
        innerBtnB.setOnClickListener(this);
        innerBtnC.setOnClickListener(this);
        innerBtnD.setOnClickListener(this);

        //Check which preference was set by user
        if (prefManager.getLastSavedPermit() != null)

            if(permitType!=null){
                switch (permitType){
                    case "A":
                            prefManager.savePermit(PermitGroup.A);
                            setAppropriateButton(prefManager.getLastSavedPermit());
                            break;

                    case "B":
                            prefManager.savePermit(PermitGroup.B);
                            setAppropriateButton(prefManager.getLastSavedPermit());
                            break;

                    case "C":
                            prefManager.savePermit(PermitGroup.C);
                            setAppropriateButton(prefManager.getLastSavedPermit());
                            break;
                    case "D":
                            prefManager.savePermit(PermitGroup.D);
                            setAppropriateButton(prefManager.getLastSavedPermit());
                            break;
                }
            } else{
                setAppropriateButton(prefManager.getLastSavedPermit());
            }

        answer0 = (Button) findViewById(R.id.btn_0);
        answer1 = (Button) findViewById(R.id.btn_1);
        answer2 = (Button) findViewById(R.id.btn_2);
        answer3 = (Button) findViewById(R.id.btn_3);

        answer0.setOnClickListener(this);
        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
    }

    private void setAppropriateButton(PermitGroup lastSavedPermit) {
        if (lastSavedPermit.equals(PermitGroup.A)) {
            toggleButtonA();
        } else if (lastSavedPermit.equals(PermitGroup.B)) {
            toggleButtonB();
        } else if (lastSavedPermit.equals(PermitGroup.C)) {
            toggleButtonC();

        } else if (lastSavedPermit.equals(PermitGroup.D)) {
            toggleButtonD();
        }
//        else if (lastSavedPermit.equals(PermitGroup.E)) {
//            toggleButtonD();
//        }
    }

    public void toggleButtonA() {
        innerBtnA.setBackground(getResources().getDrawable(R.drawable.roundbtna));
        innerBtnB.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnC.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnD.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));

        if (mMap != null)
            plotZones(PermitGroup.A, mapData.get(PermitGroup.A));
    }

    public void plotZones(PermitGroup permit, List<ParkingZone> zones) {
        mMap.clear();
        int color = getColorForPermit(permit);

        if (zones != null && !zones.isEmpty()){
            for (ParkingZone zone : zones) {
                if (zone.getParkingType() == ParkingType.LOT) {
                    Polygon polygon = mMap.addPolygon(new PolygonOptions()

                            .addAll(Arrays.asList(zone.getLocationCoordinates()))
                            .zIndex(10)
                            .strokeWidth(5)
                            .strokeColor(color)

                            .fillColor(color));

                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(getPolygonCenterPoint(polygon.getPoints()));

                markerOptions.icon(BitmapDescriptorFactory.fromResource(getBitmapForAvailability(zone.availability)));

                    markerOptions.snippet(zone.getRegionId());
//                markerOptions.title(getSnippetForAvailability(zone.availability));

                    Marker marker = mMap.addMarker(markerOptions);
                    marker.setTag(zone);


                } else {
                    Polyline polyline = mMap.addPolyline(new PolylineOptions()
                            .addAll(Arrays.asList(zone.getLocationCoordinates()))
                            .width(24)
                            .color(color));
                    int count = polyline.getPoints().size();
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(polyline.getPoints().get(count / 2));
                markerOptions.icon(BitmapDescriptorFactory.fromResource(getBitmapForAvailability(zone.availability)));
//                markerOptions.title(getSnippetForAvailability(zone.availability));

                    Marker marker = mMap.addMarker(markerOptions);
                    marker.setTag(zone);

                }
            }
        }

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                ParkingZone zone = (ParkingZone) marker.getTag();
                currentlySelectedZone = zone.getLotId();
                mBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                return false;
            }
        });

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
            }
        });
    }

    private int getBitmapForAvailability(ParkingAvailability availability) {
        switch (availability) {
            case FULL: {
                return R.drawable.marker0;
            }
            case LESS_THAN_FIVE: {
                return R.drawable.marker1;
            }
            case FIVE_TO_TEN: {
                return R.drawable.marker2;
            }
            case GREATER_THAN_TEN: {
                return R.drawable.marker3;
            }

        }
        return 0;
    }

    private int getColorForPermit(PermitGroup parkingPermit) {
        if (parkingPermit == PermitGroup.A)
            return getColor(R.color.colorAWithAlpha);
        if (parkingPermit == PermitGroup.B)
            return getColor(R.color.colorBWithAlpha);
        if (parkingPermit == PermitGroup.C)
            return getColor(R.color.colorCWithAlpha);
        if (parkingPermit == PermitGroup.D)
            return getColor(R.color.colorDWithAlpha);

        else return R.color.colorPrimary;
    }

    private LatLng getPolygonCenterPoint(List<LatLng> polygonPointsList) {
        LatLng centerLatLng = null;
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (int i = 0; i < polygonPointsList.size(); i++) {
            builder.include(polygonPointsList.get(i));
        }
        LatLngBounds bounds = builder.build();
        centerLatLng = bounds.getCenter();

        return centerLatLng;
    }

    public void toggleButtonB() {
        innerBtnA.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnB.setBackground(getResources().getDrawable(R.drawable.roundbtnb));
        innerBtnC.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnD.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        if (mMap != null)
            plotZones(PermitGroup.B, mapData.get(PermitGroup.B));
    }

    public void toggleButtonC() {
        innerBtnA.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnB.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnC.setBackground(getResources().getDrawable(R.drawable.roundbtnc));
        innerBtnD.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        if (mMap != null)
            plotZones(PermitGroup.C, mapData.get(PermitGroup.C));
    }

    public void toggleButtonD() {
        innerBtnA.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnB.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnC.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnD.setBackground(getResources().getDrawable(R.drawable.roundbtnd));
        if (mMap != null)
            plotZones(PermitGroup.D, mapData.get(PermitGroup.D));
    }

 /*   public void toggleButtonE() {
        innerBtnA.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnB.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnC.setBackground(getResources().getDrawable(R.drawable.roundbtn_unselected));
        innerBtnD.setBackground(getResources().getDrawable(R.drawable.roundbtnd));
        if (mMap != null)
            plotZones(PermitGroup.E, mapData.get(PermitGroup.E));
    }
*/


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
         mMap = googleMap;

        mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.style_json));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

//        checkPermission();
//        mMap.setMyLocationEnabled(true);

        mMap.getUiSettings().setAllGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);

        // Zoom to UMBC
        LatLngBounds umbcBounds = new LatLngBounds(new LatLng(39.250842, -76.724043), new LatLng(39.262102, -76.700987));
        mMap.setLatLngBoundsForCameraTarget(umbcBounds);
        LatLng umbcCentre = new LatLng(39.255928, -76.711093);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(umbcCentre, 15));
        mMap.setLatLngBoundsForCameraTarget(umbcBounds);


        // Get last accessed permit
        PermitGroup lastSavedPermit = new SharedPrefManager().getLastSavedPermit();

        // Plot parking zones
        List<ParkingZone> zones = mapData.get(lastSavedPermit);
        plotZones(lastSavedPermit, zones);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            // launch new intent instead of loading fragment
//            startActivity(new Intent(MapsActivity.this, AboutUsActivity.class));
//            drawer.closeDrawers();
//            return true;
        } else if (id == R.id.nav_account) {
//            startActivity(new Intent(MapsActivity.this, AccountDetailsActivity.class));
//            drawer.closeDrawers();
//            return true;
        } else if (id == R.id.nav_favorites) {
//            startActivity(new Intent(MapsActivity.this, FavoritesActivity.class));
//            drawer.closeDrawers();
//            return true;
        } else if (id == R.id.nav_parked) {
//            startActivity(new Intent(MapsActivity.this, ParkedInfoActivity.class));
//            drawer.closeDrawers();
//            return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.input1btn:
                toggleButtonA();
                break;

            case R.id.input2btn:
                toggleButtonB();
                break;

            case R.id.input3btn:
                toggleButtonC();
                break;

            case R.id.input4btn:
                toggleButtonD();
                break;

            case R.id.inner1btn:
                toggleButtonA();
                break;

            case R.id.inner2btn:
                toggleButtonB();
                break;

            case R.id.inner3btn:
                toggleButtonC();
                break;

            case R.id.inner4btn:
                toggleButtonD();
                break;

            // answer buttons

            case R.id.btn_0:
                mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                Snackbar.make(mCoordinatorLayout, "Thank you for your feedback.", Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.btn_1:
                mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                Snackbar.make(mCoordinatorLayout, "Thank you for your feedback.", Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.btn_2:
                mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                Snackbar.make(mCoordinatorLayout, "Thank you for your feedback.", Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.btn_3:
                mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                Snackbar.make(mCoordinatorLayout, "Thank you for your feedback.", Snackbar.LENGTH_SHORT).show();
                break;
        }
    }

    public static String encodeString(String email) {
        if(email!=null){
            return email.replace(".", ",");
        }
        return null;
    }

}
