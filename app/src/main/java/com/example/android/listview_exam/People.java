package com.example.android.listview_exam;

/**
 * Created by student on 2015-08-31.
 */
public class People {
    private String name;
    private String phoneNumber;
    private int imageResourceId;

    public People(int imageResourceId, String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
