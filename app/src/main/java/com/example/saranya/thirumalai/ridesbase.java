package com.example.saranya.thirumalai;

public class ridesbase {
    String userid;
    String PickupLocation;
    String DropLocation;
    float Ride_Distance;
    float Ride_Fare;

    public ridesbase(){

    }

    public ridesbase(String userid, String pickupLocation, String dropLocation, float ride_Distance, float ride_Fare) {
        this.userid = userid;
        PickupLocation = pickupLocation;
        DropLocation = dropLocation;
        Ride_Distance = ride_Distance;
        Ride_Fare = ride_Fare;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPickupLocation() {
        return PickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        PickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return DropLocation;
    }

    public void setDropLocation(String dropLocation) {
        DropLocation = dropLocation;
    }

    public float getRide_Distance() {
        return Ride_Distance;
    }

    public void setRide_Distance(float ride_Distance) {
        Ride_Distance = ride_Distance;
    }

    public float getRide_Fare() {
        return Ride_Fare;
    }

    public void setRide_Fare(float ride_Fare) {
        Ride_Fare = ride_Fare;
    }
}
