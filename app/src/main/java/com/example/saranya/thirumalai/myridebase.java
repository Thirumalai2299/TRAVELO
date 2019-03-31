package com.example.saranya.thirumalai;

public class myridebase {
    String riderid;
    String PickupLocation;
    String DropLocation;
    String Ride_Distance;
    String Ride_Fare;

    public myridebase(){

    }

    public myridebase(String riderid, String pickupLocation, String dropLocation, String ride_Distance, String ride_Fare) {
        this.riderid = riderid;
        PickupLocation = pickupLocation;
        DropLocation = dropLocation;
        Ride_Distance = ride_Distance;
        Ride_Fare = ride_Fare;
    }

    public String getRiderid() {
        return riderid;
    }

    public void setRiderid(String riderid) {
        this.riderid = riderid;
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

    public String getRide_Distance() {
        return Ride_Distance;
    }

    public void setRide_Distance(String ride_Distance) {
        Ride_Distance = ride_Distance;
    }

    public String getRide_Fare() {
        return Ride_Fare;
    }

    public void setRide_Fare(String ride_Fare) {
        Ride_Fare = ride_Fare;
    }
}
