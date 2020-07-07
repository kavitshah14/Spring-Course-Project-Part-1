package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId;

    @Column(nullable = false)
    private String locationName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private int cityId;

    @Column(nullable = false)
    private int pincode;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Location() {}

    public Location(String locationName, String address, int cityId, int pincode) {
        this.locationName = locationName;
        this.address = address;
        this.cityId = cityId;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", cityId=" + cityId +
                ", pincode=" + pincode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationId == location.locationId &&
                cityId == location.cityId &&
                pincode == location.pincode &&
                Objects.equals(locationName, location.locationName) &&
                Objects.equals(address, location.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locationName, address, cityId, pincode);
    }
}
