package com.addressmicro.addressmicro.module;

public class Address {
    private Long pinCode;
    private String country;
    private String city;
    private String landmark;
    private Long userId;

    public Address(int pinCode, String country, String city, String landmark, Long userId) {
        this.pinCode = (long) pinCode;
        this.country = country;
        this.city = city;
        this.landmark = landmark;
        this.userId = userId;
    }
    public Address(){     
    }
    public Long getPinCode() {
        return pinCode;
    }
    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getLandmark() {
        return landmark;
    }
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }  
}
