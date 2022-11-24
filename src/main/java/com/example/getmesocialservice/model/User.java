package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;


public class User {
    @Id
  private String userId;
  private String name;
    private String address;
    private String email;
    private String profilePicUrl;

    public User( String name, String address, String email, String profilePicUrl) {

        this.name = name;
        this.address = address;
        this.email = email;
        this.profilePicUrl = profilePicUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }
}
