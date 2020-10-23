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
    private Long phoneNumber;
    private String language;
    private String ethnicGroup;

    public Patient(){
        this(null,null,null,null,null,null,null,null,null,null);
    }

    public Patient(String id, String name, Date doB, Boolean sex, String altName, String race,
                   String address, Long phoneNumber, String language, String ethnicGroup){
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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
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

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
//            str
//                    .append(this.id + "|")
//                    .append(this.doB + " |")
//                    .append(this.name + " |")
//                    .append(this.altName + " |")
//                    .append(this.sex + " |")
//                    .append(this.race + " |")
//                    .append(this.address + " |")
//                    .append(this.phoneNumber + " |")
//                    .append(this.language + " |")
//                    .append(this.ethnicGroup + " |");

        //ID format
        str.append(this.getId());
        for(int i = 0; i < (12 - this.id.length()); i++){
            str.append(" ");
        }
        str.append("|");

        //Dob format
        str.append(this.getDoB());
        for(int i = 0; i < (8 - 0/*this.getDoB().toString().length()*/); i++){
            str.append(" ");
        }
        str.append("|");

        //Name format
        str.append(this.getName());
        for(int i = 0; i < (18 - this.name.length()); i++){
            str.append(" ");
        }
        str.append("|");

        //Alt Name format
        str.append(this.getAltName());
        for(int i = 0; i < (14 -this.altName.length()); i++){
            str.append(" ");
        }
        str.append("|");

        if(this.sex){
            str.append("      M     ");
            str.append("|");
        }else{
            str.append("      F     ");
            str.append("|");
        }

        //Race format
        str.append(this.getRace());
        for(int i = 0; i < (12 - this.getRace().length()); i++){
            str.append(" ");
        }
        str.append("|");

        //Address format
        str.append(this.getAddress());
        for(int i = 0; i < (41 - this.getAddress().length()); i++){
            str.append(" ");
        }
        str.append("|");

        //Address format
        str.append(this.getPhoneNumber());
        for(int i = 0; i < (12 - this.getPhoneNumber().toString().length()); i++){
            str.append(" ");
        }
        str.append("|");

        //Address format
        str.append(this.getLanguage());
        for(int i = 0; i < (12 - this.getLanguage().length()); i++){
            str.append(" ");
        }
        str.append("|");

        //Address format
        str.append(this.getEthnicGroup());
        for(int i = 0; i < (12 - this.getEthnicGroup().length()); i++){
            str.append(" ");
        }
        str.append("|");

        return str.toString();
    }
}
