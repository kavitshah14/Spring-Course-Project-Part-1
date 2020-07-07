package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class VehicleCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleCategoryId;

    @Column(nullable = false, unique = true)
    private String vehicleCategoryName;

    public int getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    public VehicleCategory(){}

    public VehicleCategory(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicleCategoryId=" + vehicleCategoryId +
                ", vehicleCategoryName='" + vehicleCategoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleCategory that = (VehicleCategory) o;
        return vehicleCategoryId == that.vehicleCategoryId &&
                Objects.equals(vehicleCategoryName, that.vehicleCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleCategoryId, vehicleCategoryName);
    }
}
