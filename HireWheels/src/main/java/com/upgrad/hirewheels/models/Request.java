package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int requestId;

    @Column(nullable = false)
    private int activityId;

    private String userComments;
    private String adminComments;

    @Column(nullable = false)
    private int requestStatusId;

    @Column(nullable = false)
    private int vehicleId;

    @Column(nullable = false)
    private  int userId;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getUserComments() {
        return userComments;
    }

    public void setUserComments(String userComments) {
        this.userComments = userComments;
    }

    public String getAdminComments() {
        return adminComments;
    }

    public void setAdminComments(String adminComments) {
        this.adminComments = adminComments;
    }

    public int getRequestStatusId() {
        return requestStatusId;
    }

    public void setRequestStatusId(int requestStatusId) {
        this.requestStatusId = requestStatusId;
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

    public Request() {}

    public Request(int activityId, String userComments, String adminComments, int requestStatusId, int vehicleId, int userId) {
        this.activityId = activityId;
        this.userComments = userComments;
        this.adminComments = adminComments;
        this.requestStatusId = requestStatusId;
        this.vehicleId = vehicleId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", activityId=" + activityId +
                ", userComments='" + userComments + '\'' +
                ", adminComments='" + adminComments + '\'' +
                ", requestStatusId=" + requestStatusId +
                ", vehicleId=" + vehicleId +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return requestId == request.requestId &&
                activityId == request.activityId &&
                requestStatusId == request.requestStatusId &&
                vehicleId == request.vehicleId &&
                userId == request.userId &&
                Objects.equals(userComments, request.userComments) &&
                Objects.equals(adminComments, request.adminComments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, activityId, userComments, adminComments, requestStatusId, vehicleId, userId);
    }
}

