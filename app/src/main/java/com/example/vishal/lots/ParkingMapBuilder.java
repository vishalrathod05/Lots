package com.example.vishal.lots;

import com.google.android.gms.maps.model.LatLng;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.Permission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.ParkingType;
import model.ParkingZone;
import model.PermitGroup;

/**
 * Created by Vishal on 4/28/2017.
 */

public class ParkingMapBuilder {

    private Map<PermitGroup, List<ParkingZone>> parkingZoneMap;

    public ParkingMapBuilder(){
        buildParkingMap();
    }

    public Map<PermitGroup, List<ParkingZone>> parkingZoneMapData() {
        return parkingZoneMap;
    }

    public void buildParkingMap(){
        List<ParkingZone> zoneAList = new ArrayList<ParkingZone>();
        List<ParkingZone> zoneBList = new ArrayList<ParkingZone>();
        List<ParkingZone> zoneCList = new ArrayList<ParkingZone>();
        List<ParkingZone> zoneDList = new ArrayList<ParkingZone>();
//        List<ParkingZone> zoneEList = new ArrayList<ParkingZone>();

        parkingZoneMap = new HashMap<PermitGroup, List<ParkingZone>>();
        createZoneAMap(zoneAList);
        parkingZoneMap.put(PermitGroup.A, zoneAList);
        createZoneBMap(zoneBList);
        parkingZoneMap.put(PermitGroup.B, zoneBList);
        createZoneCMap(zoneCList);
        parkingZoneMap.put(PermitGroup.C, zoneCList);
        createZoneDMap(zoneDList);
        parkingZoneMap.put(PermitGroup.D, zoneDList);
//        createZoneEMap(zoneEList);
//        parkingZoneMap.put(PermitGroup.E, zoneEList);
    }

    public void createZoneAMap(List<ParkingZone> zoneAList){

        ParkingZone zone = new ParkingZone("A1", "LOT 25", PermitGroup.A, ParkingType.LOT);
        LatLng[] locationCoordinates  = new LatLng[]{
                new LatLng(39.254944, -76.703395),
                new LatLng(39.254284, -76.702899),
                new LatLng(39.254442, -76.702556),
                new LatLng(39.255140, -76.702964)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A1", "LOT 23", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.255143, -76.705419),
                new LatLng(39.254653, -76.705676),
                new LatLng(39.254429, -76.705086),
                new LatLng(39.254923, -76.704780)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A3", "STADIUM LOT", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.254225, -76.705784),
                new LatLng(39.253993, -76.705140),
                new LatLng(39.253262, -76.705886),
                new LatLng(39.253581, -76.706460)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A4", "STADIUM LOT", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.253374, -76.706669),
                new LatLng(39.253070, -76.706175),
                new LatLng(39.252638, -76.706599),
                new LatLng(39.252746, -76.707291)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A5", "LOT 27", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.252333, -76.706388),
                new LatLng(39.252319, -76.706085),
                new LatLng(39.252182, -76.706093),
                new LatLng(39.252198, -76.706388)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A6", "LOT 3", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.254748, -76.707412),
                new LatLng(39.254437, -76.706754),
                new LatLng(39.254179, -76.706950),
                new LatLng(39.254464, -76.707573)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A7", "LOT 3", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.254391, -76.707661),
                new LatLng(39.254003, -76.707055),
                new LatLng(39.253551, -76.707548),
                new LatLng(39.253763, -76.707873),
                new LatLng(39.253935, -76.707712),
                new LatLng(39.254162, -76.708066)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A8", "LOT 1", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.253960, -76.708383),
                new LatLng(39.253580, -76.707782),
                new LatLng(39.253263, -76.708152),
                new LatLng(39.253472, -76.708367),
                new LatLng(39.253566, -76.708291),
                new LatLng(39.253730, -76.708570)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A9", "LOT 4", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.255050, -76.708476),
                new LatLng(39.254796, -76.708642),
                new LatLng(39.254605, -76.708149),
                new LatLng(39.254861, -76.707990)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A10", "LOT 22", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.256802, -76.716947),
                new LatLng(39.257675, -76.719109),
                new LatLng(39.258215, -76.718591),
                new LatLng(39.257089, -76.716684)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

        zone = new ParkingZone("A22", "COMMONS GARAGE", PermitGroup.A, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.253749, -76.710311),
                new LatLng(39.253093, -76.709806),
                new LatLng(39.253234, -76.709420),
                new LatLng(39.253932, -76.709903)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneAList.add(zone);

//        zone = new ParkingZone("A29", "LOT 29", PermitGroup.A, ParkingType.LOT);
//        locationCoordinates = new LatLng[]{
//                new LatLng(39.253749, -76.710311),
//                new LatLng(39.253093, -76.709806),
//                new LatLng(39.253234, -76.709420),
//                new LatLng(39.253932, -76.709903)
//        };
//        zone.setLocationCoordinates(locationCoordinates);
//        zoneAList.add(zone);

        // Curved paths
        JSONObject obj = null;
        JSONArray arr = null;
        try {

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.25278872374389, \"longitude\": -76.702774520587525 }, \"originalIndex\": 0, \"placeId\": \"ChIJrRCa6bMdyIkRpNOcWE4zVGM\" }, { \"location\": { \"latitude\": 39.2536903, \"longitude\": -76.7042335 }, \"placeId\": \"ChIJrRCa6bMdyIkRpNOcWE4zVGM\" }, { \"location\": { \"latitude\": 39.2536903, \"longitude\": -76.7042335 }, \"placeId\": \"ChIJ4X6fjLMdyIkRW1EN2LiCJwQ\" }, { \"location\": { \"latitude\": 39.253782186596609, \"longitude\": -76.704383221283138 }, \"originalIndex\": 1, \"placeId\": \"ChIJ4X6fjLMdyIkRW1EN2LiCJwQ\" } ] }");

                  zone = new ParkingZone("A11", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);


            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.25450945886292, \"longitude\": -76.706257773472913 }, \"originalIndex\": 0, \"placeId\": \"ChIJ_6UxR7QdyIkRBeYgWDquhos\" }, { \"location\": { \"latitude\": 39.2541632, \"longitude\": -76.7065428 }, \"placeId\": \"ChIJ_6UxR7QdyIkRBeYgWDquhos\" }, { \"location\": { \"latitude\": 39.2538799, \"longitude\": -76.706819799999991 }, \"placeId\": \"ChIJ_6UxR7QdyIkRBeYgWDquhos\" }, { \"location\": { \"latitude\": 39.2536967, \"longitude\": -76.7070339 }, \"placeId\": \"ChIJ_6UxR7QdyIkRBeYgWDquhos\" }, { \"location\": { \"latitude\": 39.2536967, \"longitude\": -76.7070339 }, \"placeId\": \"ChIJo6qO1LUdyIkRNh8UAnXa1-Q\" }, { \"location\": { \"latitude\": 39.25362, \"longitude\": -76.7071235 }, \"placeId\": \"ChIJo6qO1LUdyIkRNh8UAnXa1-Q\" }, { \"location\": { \"latitude\": 39.2532867, \"longitude\": -76.707546 }, \"placeId\": \"ChIJo6qO1LUdyIkRNh8UAnXa1-Q\" }, { \"location\": { \"latitude\": 39.2529138, \"longitude\": -76.7080489 }, \"placeId\": \"ChIJo6qO1LUdyIkRNh8UAnXa1-Q\" }, { \"location\": { \"latitude\": 39.252618226530252, \"longitude\": -76.708484858893655 }, \"originalIndex\": 1, \"placeId\": \"ChIJo6qO1LUdyIkRNh8UAnXa1-Q\" } ] }");

            zone = new ParkingZone("A12", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.25253613931897, \"longitude\": -76.708330467826528 }, \"originalIndex\": 0, \"placeId\": \"ChIJjbeccLYdyIkRJCEhAP4GYTs\" }, { \"location\": { \"latitude\": 39.2525488, \"longitude\": -76.70831179999999 }, \"placeId\": \"ChIJjbeccLYdyIkRJCEhAP4GYTs\" }, { \"location\": { \"latitude\": 39.2525488, \"longitude\": -76.70831179999999 }, \"placeId\": \"ChIJUehDK7QdyIkR8lvQoFxNC_A\" }, { \"location\": { \"latitude\": 39.2528133, \"longitude\": -76.707922 }, \"placeId\": \"ChIJUehDK7QdyIkR8lvQoFxNC_A\" }, { \"location\": { \"latitude\": 39.2531721, \"longitude\": -76.7074528 }, \"placeId\": \"ChIJUehDK7QdyIkR8lvQoFxNC_A\" }, { \"location\": { \"latitude\": 39.2535368, \"longitude\": -76.7069865 }, \"placeId\": \"ChIJUehDK7QdyIkR8lvQoFxNC_A\" }, { \"location\": { \"latitude\": 39.2536168, \"longitude\": -76.7068965 }, \"placeId\": \"ChIJUehDK7QdyIkR8lvQoFxNC_A\" }, { \"location\": { \"latitude\": 39.2536168, \"longitude\": -76.7068965 }, \"placeId\": \"ChIJIUM9OrQdyIkRfhI_2NkDyww\" }, { \"location\": { \"latitude\": 39.2536853, \"longitude\": -76.7068343 }, \"placeId\": \"ChIJIUM9OrQdyIkRfhI_2NkDyww\" }, { \"location\": { \"latitude\": 39.2536853, \"longitude\": -76.7068343 }, \"placeId\": \"ChIJ_XzuQLQdyIkRoMwNCWL-OZ8\" }, { \"location\": { \"latitude\": 39.253903, \"longitude\": -76.7066206 }, \"placeId\": \"ChIJ_XzuQLQdyIkRoMwNCWL-OZ8\" }, { \"location\": { \"latitude\": 39.254174, \"longitude\": -76.7063616 }, \"placeId\": \"ChIJ_XzuQLQdyIkRoMwNCWL-OZ8\" }, { \"location\": { \"latitude\": 39.254327892219763, \"longitude\": -76.706230376056268 }, \"originalIndex\": 1, \"placeId\": \"ChIJ_XzuQLQdyIkRoMwNCWL-OZ8\" } ] }");

            zone = new ParkingZone("A13", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.252411809924418, \"longitude\": -76.7088119082374 }, \"originalIndex\": 0, \"placeId\": \"ChIJ-btjbbYdyIkRa38xFRXUP-Q\" }, { \"location\": { \"latitude\": 39.2523603, \"longitude\": -76.708899000000017 }, \"placeId\": \"ChIJ-btjbbYdyIkRa38xFRXUP-Q\" }, { \"location\": { \"latitude\": 39.2522194, \"longitude\": -76.7091974 }, \"placeId\": \"ChIJ-btjbbYdyIkRa38xFRXUP-Q\" }, { \"location\": { \"latitude\": 39.2521445, \"longitude\": -76.7093653 }, \"placeId\": \"ChIJ-btjbbYdyIkRa38xFRXUP-Q\" }, { \"location\": { \"latitude\": 39.2521445, \"longitude\": -76.7093653 }, \"placeId\": \"ChIJhYBa2ckdyIkRiU_7DByxV08\" }, { \"location\": { \"latitude\": 39.25207799999999, \"longitude\": -76.7095089 }, \"placeId\": \"ChIJhYBa2ckdyIkRiU_7DByxV08\" }, { \"location\": { \"latitude\": 39.251773299999996, \"longitude\": -76.7102692 }, \"placeId\": \"ChIJhYBa2ckdyIkRiU_7DByxV08\" }, { \"location\": { \"latitude\": 39.2515515, \"longitude\": -76.710931 }, \"placeId\": \"ChIJhYBa2ckdyIkRiU_7DByxV08\" }, { \"location\": { \"latitude\": 39.2515515, \"longitude\": -76.710931 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2515083, \"longitude\": -76.7110251 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2514851, \"longitude\": -76.711092999999991 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.251463399999992, \"longitude\": -76.7111674 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2514375, \"longitude\": -76.7112912 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2514032, \"longitude\": -76.71147599999999 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2513864, \"longitude\": -76.7116176 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2513721, \"longitude\": -76.7118191 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.251369800000006, \"longitude\": -76.7119846 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2513722, \"longitude\": -76.7121863 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2513788, \"longitude\": -76.7123122 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2514002, \"longitude\": -76.7125143 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2514463, \"longitude\": -76.71275 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2514702, \"longitude\": -76.7128506 }, \"placeId\": \"ChIJqbTGx8kdyIkR1oK6O_DA6mQ\" }, { \"location\": { \"latitude\": 39.2514702, \"longitude\": -76.7128506 }, \"placeId\": \"ChIJszYdCMkdyIkRGCiiiD5ChfU\" }, { \"location\": { \"latitude\": 39.251668999999993, \"longitude\": -76.7136111 }, \"placeId\": \"ChIJszYdCMkdyIkRGCiiiD5ChfU\" }, { \"location\": { \"latitude\": 39.251718134100528, \"longitude\": -76.713810356209819 }, \"originalIndex\": 1, \"placeId\": \"ChIJszYdCMkdyIkRGCiiiD5ChfU\" } ], \"warningMessage\": \"Input path is too sparse. You should provide a path where consecutive points are closer to each other. Refer to the 'path' parameter in Google Roads API documentation.\" }");
            zone = new ParkingZone("A14", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.251415961259966, \"longitude\": -76.713004908550573 }, \"originalIndex\": 0, \"placeId\": \"ChIJNcDQsMkdyIkRytzcqXDD6-I\" }, { \"location\": { \"latitude\": 39.2514068, \"longitude\": -76.7129684 }, \"placeId\": \"ChIJNcDQsMkdyIkRytzcqXDD6-I\" }, { \"location\": { \"latitude\": 39.2513693, \"longitude\": -76.7127576 }, \"placeId\": \"ChIJNcDQsMkdyIkRytzcqXDD6-I\" }, { \"location\": { \"latitude\": 39.2513289, \"longitude\": -76.7125085 }, \"placeId\": \"ChIJNcDQsMkdyIkRytzcqXDD6-I\" }, { \"location\": { \"latitude\": 39.251297099999995, \"longitude\": -76.712157699999992 }, \"placeId\": \"ChIJNcDQsMkdyIkRytzcqXDD6-I\" }, { \"location\": { \"latitude\": 39.2512925, \"longitude\": -76.7119809 }, \"placeId\": \"ChIJNcDQsMkdyIkRytzcqXDD6-I\" }, { \"location\": { \"latitude\": 39.251294599999994, \"longitude\": -76.711848199999991 }, \"placeId\": \"ChIJNcDQsMkdyIkRytzcqXDD6-I\" }, { \"location\": { \"latitude\": 39.251294599999994, \"longitude\": -76.711848199999991 }, \"placeId\": \"ChIJy1lLz8kdyIkR5MNtN9K3_eM\" }, { \"location\": { \"latitude\": 39.2513325, \"longitude\": -76.7114399 }, \"placeId\": \"ChIJy1lLz8kdyIkR5MNtN9K3_eM\" }, { \"location\": { \"latitude\": 39.2513325, \"longitude\": -76.7114399 }, \"placeId\": \"ChIJEeWt2skdyIkR6vTuhAIgBaQ\" }, { \"location\": { \"latitude\": 39.2513547, \"longitude\": -76.7113101 }, \"placeId\": \"ChIJEeWt2skdyIkR6vTuhAIgBaQ\" }, { \"location\": { \"latitude\": 39.251401799999989, \"longitude\": -76.7110893 }, \"placeId\": \"ChIJEeWt2skdyIkR6vTuhAIgBaQ\" }, { \"location\": { \"latitude\": 39.251401799999989, \"longitude\": -76.7110893 }, \"placeId\": \"ChIJA54x2skdyIkRyEJZhFbTupY\" }, { \"location\": { \"latitude\": 39.2514642, \"longitude\": -76.7108714 }, \"placeId\": \"ChIJA54x2skdyIkRyEJZhFbTupY\" }, { \"location\": { \"latitude\": 39.2514642, \"longitude\": -76.7108714 }, \"placeId\": \"ChIJecly2ckdyIkRwJLNK1Yyanc\" }, { \"location\": { \"latitude\": 39.2515712, \"longitude\": -76.7104858 }, \"placeId\": \"ChIJecly2ckdyIkRwJLNK1Yyanc\" }, { \"location\": { \"latitude\": 39.2516987, \"longitude\": -76.71012549999999 }, \"placeId\": \"ChIJecly2ckdyIkRwJLNK1Yyanc\" }, { \"location\": { \"latitude\": 39.2518125, \"longitude\": -76.7098451 }, \"placeId\": \"ChIJecly2ckdyIkRwJLNK1Yyanc\" }, { \"location\": { \"latitude\": 39.251838899999989, \"longitude\": -76.7097758 }, \"placeId\": \"ChIJecly2ckdyIkRwJLNK1Yyanc\" }, { \"location\": { \"latitude\": 39.251838899999989, \"longitude\": -76.7097758 }, \"placeId\": \"ChIJL1VgFrYdyIkRlGPyO9XQfqw\" }, { \"location\": { \"latitude\": 39.252003099999996, \"longitude\": -76.709344 }, \"placeId\": \"ChIJL1VgFrYdyIkRlGPyO9XQfqw\" }, { \"location\": { \"latitude\": 39.252003099999996, \"longitude\": -76.709344 }, \"placeId\": \"ChIJ0w9hE7YdyIkRX50hPrng8qo\" }, { \"location\": { \"latitude\": 39.252123999999988, \"longitude\": -76.709105999999991 }, \"placeId\": \"ChIJ0w9hE7YdyIkRX50hPrng8qo\" }, { \"location\": { \"latitude\": 39.252123999999988, \"longitude\": -76.709105999999991 }, \"placeId\": \"ChIJ8bEDbrYdyIkRJZPuWw7u0uk\" }, { \"location\": { \"latitude\": 39.252195, \"longitude\": -76.7089372 }, \"placeId\": \"ChIJ8bEDbrYdyIkRJZPuWw7u0uk\" }, { \"location\": { \"latitude\": 39.252306062502626, \"longitude\": -76.708719303148825 }, \"originalIndex\": 1, \"placeId\": \"ChIJ8bEDbrYdyIkRJZPuWw7u0uk\" } ] }");
            zone = new ParkingZone("A15", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.255929138835441, \"longitude\": -76.716629592389125 }, \"originalIndex\": 0, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.2558933, \"longitude\": -76.7166387 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.255824, \"longitude\": -76.7166495 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.255726700000004, \"longitude\": -76.716658999999993 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.2556319, \"longitude\": -76.7166556 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.2554985, \"longitude\": -76.716647 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.255378199999996, \"longitude\": -76.716619999999992 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.255286199999993, \"longitude\": -76.7165898 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.2551264, \"longitude\": -76.716516599999991 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.2550332, \"longitude\": -76.7164633 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.254855899999995, \"longitude\": -76.7163417 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.254795099999996, \"longitude\": -76.71629639999999 }, \"placeId\": \"ChIJLdiRdswdyIkRX1Un47Fqc50\" }, { \"location\": { \"latitude\": 39.254795099999996, \"longitude\": -76.71629639999999 }, \"placeId\": \"ChIJV48F98sdyIkRCTXzVMVHQUE\" }, { \"location\": { \"latitude\": 39.2545741, \"longitude\": -76.716135299999991 }, \"placeId\": \"ChIJV48F98sdyIkRCTXzVMVHQUE\" }, { \"location\": { \"latitude\": 39.254339, \"longitude\": -76.715946199999991 }, \"placeId\": \"ChIJV48F98sdyIkRCTXzVMVHQUE\" }, { \"location\": { \"latitude\": 39.254339, \"longitude\": -76.715946199999991 }, \"placeId\": \"ChIJi5Kj-8sdyIkR8X0IwkFZNRw\" }, { \"location\": { \"latitude\": 39.254033, \"longitude\": -76.715720699999991 }, \"placeId\": \"ChIJi5Kj-8sdyIkR8X0IwkFZNRw\" }, { \"location\": { \"latitude\": 39.254033, \"longitude\": -76.715720699999991 }, \"placeId\": \"ChIJKS8gWckdyIkR6otbrdtBp1I\" }, { \"location\": { \"latitude\": 39.253156297518764, \"longitude\": -76.715078351767374 }, \"originalIndex\": 1, \"placeId\": \"ChIJKS8gWckdyIkR6otbrdtBp1I\" } ] }");
            zone = new ParkingZone("A16", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.256647397130827, \"longitude\": -76.716024498444384 }, \"originalIndex\": 0, \"placeId\": \"ChIJaSDaessdyIkRwHjdpJsoahk\" }, { \"location\": { \"latitude\": 39.257532399999995, \"longitude\": -76.7151825 }, \"placeId\": \"ChIJaSDaessdyIkRwHjdpJsoahk\" }, { \"location\": { \"latitude\": 39.257532399999995, \"longitude\": -76.7151825 }, \"placeId\": \"ChIJTW7dQcsdyIkRSM_EG7Hbvl0\" }, { \"location\": { \"latitude\": 39.2575795, \"longitude\": -76.715137 }, \"placeId\": \"ChIJTW7dQcsdyIkRSM_EG7Hbvl0\" }, { \"location\": { \"latitude\": 39.2575795, \"longitude\": -76.715137 }, \"placeId\": \"ChIJneD1OMsdyIkRWwrniSWFrFI\" }, { \"location\": { \"latitude\": 39.2579108, \"longitude\": -76.714817099999991 }, \"placeId\": \"ChIJneD1OMsdyIkRWwrniSWFrFI\" }, { \"location\": { \"latitude\": 39.2579576, \"longitude\": -76.714778299999992 }, \"placeId\": \"ChIJneD1OMsdyIkRWwrniSWFrFI\" }, { \"location\": { \"latitude\": 39.2583269, \"longitude\": -76.714426100000011 }, \"placeId\": \"ChIJneD1OMsdyIkRWwrniSWFrFI\" }, { \"location\": { \"latitude\": 39.2583269, \"longitude\": -76.714426100000011 }, \"placeId\": \"ChIJxS48MssdyIkRsOTaGUgamf4\" }, { \"location\": { \"latitude\": 39.2583644, \"longitude\": -76.7143855 }, \"placeId\": \"ChIJxS48MssdyIkRsOTaGUgamf4\" }, { \"location\": { \"latitude\": 39.2585608, \"longitude\": -76.7141966 }, \"placeId\": \"ChIJxS48MssdyIkRsOTaGUgamf4\" }, { \"location\": { \"latitude\": 39.2586531, \"longitude\": -76.7140995 }, \"placeId\": \"ChIJxS48MssdyIkRsOTaGUgamf4\" }, { \"location\": { \"latitude\": 39.258718300000005, \"longitude\": -76.7140187 }, \"placeId\": \"ChIJxS48MssdyIkRsOTaGUgamf4\" }, { \"location\": { \"latitude\": 39.258734764639691, \"longitude\": -76.713997291188065 }, \"originalIndex\": 1, \"placeId\": \"ChIJxS48MssdyIkRsOTaGUgamf4\" } ] }");
            zone = new ParkingZone("A17", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.258115902982148, \"longitude\": -76.714778056194064 }, \"originalIndex\": 0, \"placeId\": \"ChIJjyB6R8sdyIkRwPVFZFBT98w\" }, { \"location\": { \"latitude\": 39.257632900000004, \"longitude\": -76.7152363 }, \"placeId\": \"ChIJjyB6R8sdyIkRwPVFZFBT98w\" }, { \"location\": { \"latitude\": 39.257632900000004, \"longitude\": -76.7152363 }, \"placeId\": \"ChIJjfofQssdyIkRH3GAdL-Pzr0\" }, { \"location\": { \"latitude\": 39.2575911, \"longitude\": -76.7152758 }, \"placeId\": \"ChIJjfofQssdyIkRH3GAdL-Pzr0\" }, { \"location\": { \"latitude\": 39.2575911, \"longitude\": -76.7152758 }, \"placeId\": \"ChIJnXq8aMsdyIkRXpbMrc9rWI4\" }, { \"location\": { \"latitude\": 39.256897699999996, \"longitude\": -76.715922999999989 }, \"placeId\": \"ChIJnXq8aMsdyIkRXpbMrc9rWI4\" }, { \"location\": { \"latitude\": 39.256897699999996, \"longitude\": -76.715922999999989 }, \"placeId\": \"ChIJ38CJfMsdyIkRONNRM6hPNMQ\" }, { \"location\": { \"latitude\": 39.25671284937539, \"longitude\": -76.716099296731684 }, \"originalIndex\": 1, \"placeId\": \"ChIJ38CJfMsdyIkRONNRM6hPNMQ\" } ] }");
            zone = new ParkingZone("A18", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.259176592805417, \"longitude\": -76.71328021441272 }, \"originalIndex\": 0, \"placeId\": \"ChIJ0-gq1jQcyIkR3QwVKQPX_9g\" }, { \"location\": { \"latitude\": 39.259197999999991, \"longitude\": -76.713237499999991 }, \"placeId\": \"ChIJ0-gq1jQcyIkR3QwVKQPX_9g\" }, { \"location\": { \"latitude\": 39.259197999999991, \"longitude\": -76.713237499999991 }, \"placeId\": \"ChIJT8EIJjUcyIkRcquTEl8RJHI\" }, { \"location\": { \"latitude\": 39.2593091, \"longitude\": -76.7129897 }, \"placeId\": \"ChIJT8EIJjUcyIkRcquTEl8RJHI\" }, { \"location\": { \"latitude\": 39.2593091, \"longitude\": -76.7129897 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259332199999996, \"longitude\": -76.7129363 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259422699999995, \"longitude\": -76.7126988 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2594944, \"longitude\": -76.7124722 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259601400000008, \"longitude\": -76.7119888 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2596525, \"longitude\": -76.7115227 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259667500000006, \"longitude\": -76.7111364 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259650199999996, \"longitude\": -76.7106922 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2596263, \"longitude\": -76.7104647 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259601400000008, \"longitude\": -76.7103049 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259553099999991, \"longitude\": -76.7100648 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259514800000005, \"longitude\": -76.7098914 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2594175, \"longitude\": -76.7095264 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259320399999993, \"longitude\": -76.7092594 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259168699999989, \"longitude\": -76.7089367 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259037800000009, \"longitude\": -76.7086762 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.258972700000008, \"longitude\": -76.70857199999999 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.258786469088541, \"longitude\": -76.708298807670545 }, \"originalIndex\": 1, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" } ], \"warningMessage\": \"Input path is too sparse. You should provide a path where consecutive points are closer to each other. Refer to the 'path' parameter in Google Roads API documentation.\" }");
            zone = new ParkingZone("A19", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.258777027508181, \"longitude\": -76.70806375988812 }, \"originalIndex\": 0, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259049999999995, \"longitude\": -76.7084206 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2591943, \"longitude\": -76.708663500000014 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2592953, \"longitude\": -76.708869499999992 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2594128, \"longitude\": -76.7091399 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2594993, \"longitude\": -76.7093775 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259633199999996, \"longitude\": -76.7098583 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259705099999991, \"longitude\": -76.710179 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259756599999996, \"longitude\": -76.7105155 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597732, \"longitude\": -76.710808399999991 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597776, \"longitude\": -76.711035799999991 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597739, \"longitude\": -76.711310799999993 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597346, \"longitude\": -76.7117957 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259684899999996, \"longitude\": -76.7120972 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2596358, \"longitude\": -76.7123479 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259574000000008, \"longitude\": -76.7125713 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.25946119999999, \"longitude\": -76.7129169 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259459713008731, \"longitude\": -76.712921709942435 }, \"originalIndex\": 1, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" } ], \"warningMessage\": \"Input path is too sparse. You should provide a path where consecutive points are closer to each other. Refer to the 'path' parameter in Google Roads API documentation.\" }");
            zone = new ParkingZone("A20", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.25147761292736, \"longitude\": -76.714841719221482 }, \"originalIndex\": 0, \"placeId\": \"ChIJB-UwxMgdyIkRvEvlTOoj5ME\" }, { \"location\": { \"latitude\": 39.251258199999995, \"longitude\": -76.7150006 }, \"placeId\": \"ChIJB-UwxMgdyIkRvEvlTOoj5ME\" }, { \"location\": { \"latitude\": 39.2505961, \"longitude\": -76.7152528 }, \"placeId\": \"ChIJB-UwxMgdyIkRvEvlTOoj5ME\" }, { \"location\": { \"latitude\": 39.2500083, \"longitude\": -76.7154815 }, \"placeId\": \"ChIJB-UwxMgdyIkRvEvlTOoj5ME\" }, { \"location\": { \"latitude\": 39.2495108, \"longitude\": -76.7156816 }, \"placeId\": \"ChIJB-UwxMgdyIkRvEvlTOoj5ME\" }, { \"location\": { \"latitude\": 39.249269, \"longitude\": -76.715775499999992 }, \"placeId\": \"ChIJB-UwxMgdyIkRvEvlTOoj5ME\" }, { \"location\": { \"latitude\": 39.248999507729472, \"longitude\": -76.715885470111857 }, \"originalIndex\": 1, \"placeId\": \"ChIJB-UwxMgdyIkRvEvlTOoj5ME\" } ] }");
            zone = new ParkingZone("A21", "", PermitGroup.A, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneAList.add(zone);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void createZoneBMap(List<ParkingZone> zoneBList){

        ParkingZone zone = new ParkingZone("B1", "LOT 20", PermitGroup.B, ParkingType.LOT);
        LatLng[] locationCoordinates  = new LatLng[]{
                new LatLng(39.259671, -76.713757),
                new LatLng(39.259438, -76.713998),
                new LatLng(39.259268, -76.713773),
                new LatLng(39.259546, -76.713553)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneBList.add(zone);

        zone = new ParkingZone("B2", "LOT 21", PermitGroup.B, ParkingType.LOT);
        locationCoordinates  = new LatLng[]{
                new LatLng(39.259022, -76.714601),
                new LatLng(39.258856, -76.714773),
                new LatLng(39.258765, -76.714655),
                new LatLng(39.258902, -76.714467),
                new LatLng(39.258927, -76.714505),
                new LatLng(39.258956, -76.714478)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneBList.add(zone);

    }

    public void createZoneCMap(List<ParkingZone> zoneCList){

        ParkingZone zone = new ParkingZone("C1", "LOT 6", PermitGroup.C, ParkingType.LOT);
        LatLng[] locationCoordinates  = new LatLng[]{
                new LatLng(39.25859, -76.71212),
                new LatLng(39.25897, -76.71133),
                new LatLng(39.25898, -76.71065),
                new LatLng(39.25887, -76.71065),
                new LatLng(39.25886, -76.71114),
                new LatLng(39.25852, -76.71197),
                new LatLng(39.25848, -76.71170),
                new LatLng(39.25837, -76.71164),
                new LatLng(39.25851, -76.71043),
                new LatLng(39.25865, -76.71043),
                new LatLng(39.25865, -76.71046),
                new LatLng(39.25887, -76.71123)
        };

        zone.setLocationCoordinates(locationCoordinates);
        zoneCList.add(zone);

        zone = new ParkingZone("C2", "LOT 23", PermitGroup.C, ParkingType.LOT);
        locationCoordinates  = new LatLng[]{
                new LatLng(39.255143, -76.705419),
                new LatLng(39.254653, -76.705676),
                new LatLng(39.254429, -76.705086),
                new LatLng(39.254923, -76.704780)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneCList.add(zone);

        zone = new ParkingZone("C3", "LOT 25", PermitGroup.C, ParkingType.LOT);
        locationCoordinates  = new LatLng[]{
                new LatLng(39.254944, -76.703395),
                new LatLng(39.254284, -76.702899),
                new LatLng(39.254442, -76.702556),
                new LatLng(39.255140, -76.702964)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneCList.add(zone);

        zone = new ParkingZone("C4", "WALKERS AVENUE GARAGE", PermitGroup.C, ParkingType.LOT);
        locationCoordinates  = new LatLng[]{
                new LatLng(39.25779, -76.71231),
                new LatLng(39.25733, -76.71295),
                new LatLng(39.25699, -76.71257),
                new LatLng(39.25745, -76.71185)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneCList.add(zone);

        zone = new ParkingZone("C5", "LOT 5", PermitGroup.C, ParkingType.LOT);
        locationCoordinates  = new LatLng[]{
                new LatLng(39.25773, -76.70833),
                new LatLng(39.25757, -76.70748),
                new LatLng(39.25763, -76.70779),
                new LatLng(39.25770, -76.70806),
                new LatLng(39.25774, -76.70833),
                new LatLng(39.25781, -76.70832),
                new LatLng(39.25777, -76.70804)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneCList.add(zone);

        // Curved paths
        JSONObject obj = null;
        JSONArray arr = null;
        try{
            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.259176592805417, \"longitude\": -76.71328021441272 }, \"originalIndex\": 0, \"placeId\": \"ChIJ0-gq1jQcyIkR3QwVKQPX_9g\" }, { \"location\": { \"latitude\": 39.259197999999991, \"longitude\": -76.713237499999991 }, \"placeId\": \"ChIJ0-gq1jQcyIkR3QwVKQPX_9g\" }, { \"location\": { \"latitude\": 39.259197999999991, \"longitude\": -76.713237499999991 }, \"placeId\": \"ChIJT8EIJjUcyIkRcquTEl8RJHI\" }, { \"location\": { \"latitude\": 39.2593091, \"longitude\": -76.7129897 }, \"placeId\": \"ChIJT8EIJjUcyIkRcquTEl8RJHI\" }, { \"location\": { \"latitude\": 39.2593091, \"longitude\": -76.7129897 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259332199999996, \"longitude\": -76.7129363 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259422699999995, \"longitude\": -76.7126988 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2594944, \"longitude\": -76.7124722 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259601400000008, \"longitude\": -76.7119888 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2596525, \"longitude\": -76.7115227 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259667500000006, \"longitude\": -76.7111364 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259650199999996, \"longitude\": -76.7106922 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2596263, \"longitude\": -76.7104647 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259601400000008, \"longitude\": -76.7103049 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259553099999991, \"longitude\": -76.7100648 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259514800000005, \"longitude\": -76.7098914 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.2594175, \"longitude\": -76.7095264 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259320399999993, \"longitude\": -76.7092594 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259168699999989, \"longitude\": -76.7089367 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.259037800000009, \"longitude\": -76.7086762 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.258972700000008, \"longitude\": -76.70857199999999 }, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" }, { \"location\": { \"latitude\": 39.258786469088541, \"longitude\": -76.708298807670545 }, \"originalIndex\": 1, \"placeId\": \"ChIJTTBqp0ocyIkRyMQc8PJa6Yc\" } ], \"warningMessage\": \"Input path is too sparse. You should provide a path where consecutive points are closer to each other. Refer to the 'path' parameter in Google Roads API documentation.\" }");
            zone = new ParkingZone("C6", "", PermitGroup.C, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneCList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.258777027508181, \"longitude\": -76.70806375988812 }, \"originalIndex\": 0, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259049999999995, \"longitude\": -76.7084206 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2591943, \"longitude\": -76.708663500000014 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2592953, \"longitude\": -76.708869499999992 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2594128, \"longitude\": -76.7091399 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2594993, \"longitude\": -76.7093775 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259633199999996, \"longitude\": -76.7098583 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259705099999991, \"longitude\": -76.710179 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259756599999996, \"longitude\": -76.7105155 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597732, \"longitude\": -76.710808399999991 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597776, \"longitude\": -76.711035799999991 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597739, \"longitude\": -76.711310799999993 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2597346, \"longitude\": -76.7117957 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259684899999996, \"longitude\": -76.7120972 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.2596358, \"longitude\": -76.7123479 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259574000000008, \"longitude\": -76.7125713 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.25946119999999, \"longitude\": -76.7129169 }, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" }, { \"location\": { \"latitude\": 39.259459713008731, \"longitude\": -76.712921709942435 }, \"originalIndex\": 1, \"placeId\": \"ChIJx-1Lp0ocyIkRE5W811PfIwY\" } ], \"warningMessage\": \"Input path is too sparse. You should provide a path where consecutive points are closer to each other. Refer to the 'path' parameter in Google Roads API documentation.\" }");
            zone = new ParkingZone("C7", "", PermitGroup.C, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneCList.add(zone);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void createZoneDMap(List<ParkingZone> zoneDList){

        ParkingZone zone = new ParkingZone("D1", "LOT 25", PermitGroup.D, ParkingType.LOT);
        LatLng[] locationCoordinates = new LatLng[]{
                new LatLng(39.254944, -76.703395),
                new LatLng(39.254284, -76.702899),
                new LatLng(39.254442, -76.702556),
                new LatLng(39.255140, -76.702964)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneDList.add(zone);

        zone = new ParkingZone("D2", "LOT 24", PermitGroup.D, ParkingType.LOT);
        locationCoordinates  = new LatLng[]{
                new LatLng(39.254657, -76.704360),
                new LatLng(39.254259, -76.704789),
                new LatLng(39.253868, -76.704113),
                new LatLng(39.254342, -76.703850)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneDList.add(zone);

        zone = new ParkingZone("D3", "LOT 28", PermitGroup.D, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.251540, -76.707299),
                new LatLng(39.250834, -76.706285),
                new LatLng(39.250755, -76.706382),
                new LatLng(39.251419, -76.707422)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneDList.add(zone);

        zone = new ParkingZone("D4", "LOT 1", PermitGroup.D, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.253665, -76.708704),
                new LatLng(39.253119, -76.708238),
                new LatLng(39.252980, -76.708557),
                new LatLng(39.253535, -76.709029)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneDList.add(zone);

        zone = new ParkingZone("D6", "LOT 8", PermitGroup.D, ParkingType.LOT);
        locationCoordinates = new LatLng[]{
                new LatLng(39.255949, -76.714907),
                new LatLng(39.257172, -76.714317),
                new LatLng(39.257370, -76.715006),
                new LatLng(39.256211, -76.715975)
        };
        zone.setLocationCoordinates(locationCoordinates);
        zoneDList.add(zone);

        // Curved paths
        JSONObject obj = null;
        JSONArray arr = null;
        try {

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.253887013282629, \"longitude\": -76.708906503210542 }, \"originalIndex\": 0, \"placeId\": \"ChIJ8QzExrUdyIkRwPVy49LtZEM\" }, { \"location\": { \"latitude\": 39.2540243, \"longitude\": -76.7086526 }, \"placeId\": \"ChIJ8QzExrUdyIkRwPVy49LtZEM\" }, { \"location\": { \"latitude\": 39.254193799999996, \"longitude\": -76.7083791 }, \"placeId\": \"ChIJ8QzExrUdyIkRwPVy49LtZEM\" }, { \"location\": { \"latitude\": 39.2542234, \"longitude\": -76.7083379 }, \"placeId\": \"ChIJ8QzExrUdyIkRwPVy49LtZEM\" }, { \"location\": { \"latitude\": 39.2542234, \"longitude\": -76.7083379 }, \"placeId\": \"ChIJu5ast7UdyIkRNs0T51m_RHs\" }, { \"location\": { \"latitude\": 39.2543857, \"longitude\": -76.7081118 }, \"placeId\": \"ChIJu5ast7UdyIkRNs0T51m_RHs\" }, { \"location\": { \"latitude\": 39.2543857, \"longitude\": -76.7081118 }, \"placeId\": \"ChIJzx_ms7UdyIkRsWC-JbcfG5c\" }, { \"location\": { \"latitude\": 39.254547728015254, \"longitude\": -76.7079436099491 }, \"originalIndex\": 1, \"placeId\": \"ChIJzx_ms7UdyIkRsWC-JbcfG5c\" } ] }");
            zone = new ParkingZone("D5", "", PermitGroup.D, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneDList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.253120288575957, \"longitude\": -76.714859226775786 }, \"originalIndex\": 0, \"placeId\": \"ChIJ7c8qX8kdyIkRnIdFJXoWjh4\" }, { \"location\": { \"latitude\": 39.25333659999999, \"longitude\": -76.7150267 }, \"placeId\": \"ChIJ7c8qX8kdyIkRnIdFJXoWjh4\" }, { \"location\": { \"latitude\": 39.2537401, \"longitude\": -76.7153295 }, \"placeId\": \"ChIJ7c8qX8kdyIkRnIdFJXoWjh4\" }, { \"location\": { \"latitude\": 39.2541021, \"longitude\": -76.715595999999991 }, \"placeId\": \"ChIJ7c8qX8kdyIkRnIdFJXoWjh4\" }, { \"location\": { \"latitude\": 39.2541021, \"longitude\": -76.715595999999991 }, \"placeId\": \"ChIJEyCW8MsdyIkR-JX-OWvTqCo\" }, { \"location\": { \"latitude\": 39.2542647, \"longitude\": -76.715729799999991 }, \"placeId\": \"ChIJEyCW8MsdyIkR-JX-OWvTqCo\" }, { \"location\": { \"latitude\": 39.2546678, \"longitude\": -76.7160342 }, \"placeId\": \"ChIJEyCW8MsdyIkR-JX-OWvTqCo\" }, { \"location\": { \"latitude\": 39.2548445, \"longitude\": -76.7161655 }, \"placeId\": \"ChIJEyCW8MsdyIkR-JX-OWvTqCo\" }, { \"location\": { \"latitude\": 39.2548445, \"longitude\": -76.7161655 }, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" }, { \"location\": { \"latitude\": 39.2549857, \"longitude\": -76.716278899999992 }, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" }, { \"location\": { \"latitude\": 39.2551455, \"longitude\": -76.716390199999992 }, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" }, { \"location\": { \"latitude\": 39.2552265, \"longitude\": -76.716436 }, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" }, { \"location\": { \"latitude\": 39.255337399999995, \"longitude\": -76.716484400000013 }, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" }, { \"location\": { \"latitude\": 39.255529599999996, \"longitude\": -76.7165406 }, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" }, { \"location\": { \"latitude\": 39.255677399999989, \"longitude\": -76.7165634 }, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" }, { \"location\": { \"latitude\": 39.255706209039154, \"longitude\": -76.716560460898961 }, \"originalIndex\": 1, \"placeId\": \"ChIJc96hdcwdyIkRT3Duq0XsWbE\" } ] }");
            zone = new ParkingZone("D7", "", PermitGroup.D, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneDList.add(zone);

            obj = new JSONObject("{ \"snappedPoints\": [ { \"location\": { \"latitude\": 39.25718301071042, \"longitude\": -76.719239470974017 }, \"originalIndex\": 0, \"placeId\": \"ChIJ7ajy-8wdyIkRqHsZWrKiBgM\" }, { \"location\": { \"latitude\": 39.2568906, \"longitude\": -76.718417 }, \"placeId\": \"ChIJ7ajy-8wdyIkRqHsZWrKiBgM\" }, { \"location\": { \"latitude\": 39.2568906, \"longitude\": -76.718417 }, \"placeId\": \"ChIJxTAk9cwdyIkRFSaO2oZM6HQ\" }, { \"location\": { \"latitude\": 39.256495199999996, \"longitude\": -76.717258399999992 }, \"placeId\": \"ChIJxTAk9cwdyIkRFSaO2oZM6HQ\" }, { \"location\": { \"latitude\": 39.256495199999996, \"longitude\": -76.717258399999992 }, \"placeId\": \"ChIJ1_SjYswdyIkRT_lx6rVLauY\" }, { \"location\": { \"latitude\": 39.2564043, \"longitude\": -76.71699319999999 }, \"placeId\": \"ChIJ1_SjYswdyIkRT_lx6rVLauY\" }, { \"location\": { \"latitude\": 39.2564043, \"longitude\": -76.71699319999999 }, \"placeId\": \"ChIJf9IffswdyIkRXFDABEdR6J8\" }, { \"location\": { \"latitude\": 39.256338624520765, \"longitude\": -76.716804842962148 }, \"originalIndex\": 1, \"placeId\": \"ChIJf9IffswdyIkRXFDABEdR6J8\" } ] }");
            zone = new ParkingZone("D8", "", PermitGroup.D, ParkingType.STREET);
            arr = obj.getJSONArray("snappedPoints");
            locationCoordinates = new LatLng[arr.length()];
            for (int i = 0; i < arr.length(); i++) {
                locationCoordinates[i] = new LatLng(arr.getJSONObject(i).getJSONObject("location").getDouble("latitude"), arr.getJSONObject(i).getJSONObject("location").getDouble("longitude"));
            }
            zone.setLocationCoordinates(locationCoordinates);
            zoneDList.add(zone);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void createZoneEMap(List<ParkingZone> zoneEList){

    }

}
