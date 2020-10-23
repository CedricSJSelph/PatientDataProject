package com.patientData;

import java.util.Date;

public class Patient {

    private String id;
    private String name;
    private Date doB;
    private Boolean sex;
    private String altName;
    private String race;
    private String address;
    private String phoneNumber;
    private String language;
    private String ethnicGroup;

    public Patient(){}

    public Patient(String id, String name, Date doB, Boolean sex, String altName, String race,
                   String address, String phoneNumber, String language, String ethnicGroup){
        this.id = id;
        this.name = name;
        this.doB = doB;
        this.sex = sex;
        this.altName = altName;
        this.race = race;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.language = language;
        this.ethnicGroup = ethnicGroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoB() {
        return doB;
    }

    public void setDoB(Date doB) {
        this.doB = doB;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getAltName() {
        return altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }
}
