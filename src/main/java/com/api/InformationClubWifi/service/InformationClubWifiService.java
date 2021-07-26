/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.InformationClubWifi.service;

import com.api.InformationClubWifi.model.InfClubWifiResponseModel;
import org.springframework.stereotype.Service;

/**
 *
 * @author APerez
 */
@Service
public class InformationClubWifiService {
      
    public InfClubWifiResponseModel format(String name) {
        InfClubWifiResponseModel modelRequest = new InfClubWifiResponseModel();  
        String convert = "";
        String[] information = name.split(" ");

        for (int i = 0; i < information.length; i++) {
            if (i < information.length - 1) {
                convert += information[i].substring(0, 1).toUpperCase() + information[i].substring(1).toLowerCase() + " ";
            } else {
                convert += information[i].substring(0, 1).toUpperCase() + information[i].substring(1).toLowerCase();
            }
        }

        modelRequest.setResult(convert);
        return modelRequest;
    }
}
