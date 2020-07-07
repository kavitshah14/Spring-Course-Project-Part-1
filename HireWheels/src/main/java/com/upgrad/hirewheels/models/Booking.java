package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @Column(nullable = false)
    private Date pickupDate;

    @Column(nullable = false)
    private Date dropOffDate;

    @Column(nullable = false)
    private Date bookingDate;

    @Column(nullable = false)
    private float amount;

    @Column(nullable = false)
    private int locationId;

    @Column(nullable = false)
    private int vehicleId;

    @Column(nullable = false)
    private int userId;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Booking() {}

    public Booking(Date pickupDate, Date dropOffDate, Date bookingDate, float amount, int locationId, int vehicleId, int userId) {
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.bookingDate = bookingDate;
        this.amount = amount;
        this.locationId = locationId;
        this.vehicleId = vehicleId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", pickupDate=" + pickupDate +
                ", dropOffDate=" + dropOffDate +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                ", locationId=" + locationId +
                ", vehicleId=" + vehicleId +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId &&
                Float.compare(booking.amount, amount) == 0 &&
                locationId == booking.locationId &&
                vehicleId == booking.vehicleId &&
                userId == booking.userId &&
                Objects.equals(pickupDate, booking.pickupDate) &&
                Objects.equals(dropOffDate, booking.dropOffDate) &&
                Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, pickupDate, dropOffDate, bookingDate, amount, locationId, vehicleId, userId);
    }
}







