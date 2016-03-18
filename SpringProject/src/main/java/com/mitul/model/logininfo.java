package com.mitul.model;

import javax.persistence.*;

/**
 * Created by Mitul on 18-Mar-16.
 */
@Entity
@Table(name = "logininfo")
public class logininfo {
    @Id
    @GeneratedValue
    @Column(name = "uid")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
