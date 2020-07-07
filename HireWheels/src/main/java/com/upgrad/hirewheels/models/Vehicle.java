package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;

    @Column(nullable = false)
    private String vehicleModel;

    @Column(nullable = false)
    private int vehicleNumber;

    /*@Column(nullable = false)
    private int vehicleSubcategoryId;
*/
    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String vehicleImageUrl;

    @ManyToOne
    VehicleSubcategory vehicleSubcategory;

    @OneToOne
    Users users;

    @OneToOne
    Location location;

    @OneToOne
    FuelType fuelType;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    /*public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }
*/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    public Vehicle() {}

    public Vehicle(String vehicleModel, int vehicleNumber, String color, String vehicleImageUrl) {
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
  //      this.vehicleSubcategoryId = vehicleSubcategoryId;
        this.color = color;
        this.vehicleImageUrl = vehicleImageUrl;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber=" + vehicleNumber +
                ", color='" + color + '\'' +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleId == vehicle.vehicleId &&
                vehicleNumber == vehicle.vehicleNumber &&
//                vehicleSubcategoryId == vehicle.vehicleSubcategoryId &&
                Objects.equals(vehicleModel, vehicle.vehicleModel) &&
                Objects.equals(color, vehicle.color) &&
                Objects.equals(vehicleImageUrl, vehicle.vehicleImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, vehicleModel, vehicleNumber, color, vehicleImageUrl);
    }
}
