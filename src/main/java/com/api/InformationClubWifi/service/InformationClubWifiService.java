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
      
    public InfClubWifiResponseModel validateAccout(Integer accout) {
        InfClubWifiResponseModel modelRequest = new InfClubWifiResponseModel();  
        if (accout>0){
            modelRequest.setResult("accout valid");
        }else{
            modelRequest.setResult("accout invalid");
        }
        return modelRequest;
    }
}
