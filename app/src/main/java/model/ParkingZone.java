package model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Vishal on 4/28/2017.
 */

public class ParkingZone {

    private String regionId;
    private String lotId;
    private PermitGroup permitGroup;
    private ParkingType parkingType;
    public LatLng[] locationCoordinates;

    public ParkingZone(){

    }

    public ParkingZone(String regionId, String lotId, PermitGroup permitGroup, ParkingType parkingType){
        this.regionId = regionId;
        this.lotId = lotId;
        this.permitGroup = permitGroup;
        this.parkingType = parkingType;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public PermitGroup getPermitGroup() {
        return permitGroup;
    }

    public void setPermitGroup(PermitGroup permitGroup) {
        this.permitGroup = permitGroup;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

    public LatLng[] getLocationCoordinates() {
        return locationCoordinates;
    }

    public void setLocationCoordinates(LatLng[] locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParkingZone that = (ParkingZone) o;

        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null)
            return false;
        if (lotId != null ? !lotId.equals(that.lotId) : that.lotId != null) return false;
        if (permitGroup != that.permitGroup) return false;
        return parkingType == that.parkingType;
    }

    @Override
    public int hashCode() {
        int result = regionId != null ? regionId.hashCode() : 0;
        result = 31 * result + (lotId != null ? lotId.hashCode() : 0);
        result = 31 * result + (permitGroup != null ? permitGroup.hashCode() : 0);
        result = 31 * result + (parkingType != null ? parkingType.hashCode() : 0);
        return result;
    }
}
