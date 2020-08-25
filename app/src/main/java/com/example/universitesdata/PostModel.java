package com.example.universitesdata;

import com.firebase.ui.database.FirebaseRecyclerOptions;

public class PostModel
{
    String address;
    String city;
    String name;
    String other_details;
    String sector;



    public PostModel(FirebaseRecyclerOptions<PostModel> options)
    {



    }


    @Override
    public String toString() {
        return "PostModel{" +
                "adress='" + address + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", other_details='" + other_details + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }


    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
