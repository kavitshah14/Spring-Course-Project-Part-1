package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RequestStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int RequestStatusId;

    @Column(nullable = false, unique = true)
    private String RequestStatusName;

    public int getRequestStatusId() {
        return RequestStatusId;
    }

    public void setRequestStatusId(int requestStatusId) {
        RequestStatusId = requestStatusId;
    }

    public String getRequestStatusName() {
        return RequestStatusName;
    }

    public void setRequestStatusName(String requestStatusName) {
        RequestStatusName = requestStatusName;
    }

    public RequestStatus() {}

    public RequestStatus(String requestStatusName) {
        RequestStatusName = requestStatusName;
    }

    @Override
    public String toString() {
        return "RequestStatus{" +
                "RequestStatusId=" + RequestStatusId +
                ", RequestStatusName='" + RequestStatusName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestStatus that = (RequestStatus) o;
        return RequestStatusId == that.RequestStatusId &&
                Objects.equals(RequestStatusName, that.RequestStatusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RequestStatusId, RequestStatusName);
    }
}

