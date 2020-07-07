package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int activityId;

    @Column(nullable = false, unique = true)
    private String activityType;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Activity() {}

    public Activity(String activityType) {
        this.activityType = activityType;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityType='" + activityType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return activityId == activity.activityId &&
                Objects.equals(activityType, activity.activityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId, activityType);
    }
}
