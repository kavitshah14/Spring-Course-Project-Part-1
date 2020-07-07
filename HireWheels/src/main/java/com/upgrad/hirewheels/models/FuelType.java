package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuelTypeId;

    @Column(nullable = false, unique = true)
    private String roleName;

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public FuelType() {}

    public FuelType(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "fuelTypeId=" + fuelTypeId +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuelType fuelType = (FuelType) o;
        return fuelTypeId == fuelType.fuelTypeId &&
                Objects.equals(roleName, fuelType.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelTypeId, roleName);
    }
}
