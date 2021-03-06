/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.InformationClubWifi.model;

import com.api.kubemq.enums.InformationClubWifiStatus;
import java.io.Serializable;

/**
 *
 * @author APerez
 */
//@Builder
//@ToString
public class UserModel implements Serializable {
    
    private String name;
    private String firstName;
    private String lastName;
    private String id;
    private InformationClubWifiStatus status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InformationClubWifiStatus getStatus() {
        return status;
    }

    public void setStatus(InformationClubWifiStatus status) {
        this.status = status;
    }

    
}
