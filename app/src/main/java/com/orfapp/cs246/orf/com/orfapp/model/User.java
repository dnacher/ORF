package com.orfapp.cs246.orf.com.orfapp.model;

/**
 * Created by Nacher on 20/6/2017.
 */

public class User {

    private int idUser;
    private String name;
    private String password;
    private boolean active;

    public User(){}

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
