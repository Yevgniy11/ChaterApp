package com.herokuapp.chaterapplicationproject.chaterapp.pojo;

/**
 * Created by klu shvartsman on 04/08/2016.
 * Contact Pojo Class
 */
public class ContactObject {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactObject(String name) {

        this.name = name;
    }
}
