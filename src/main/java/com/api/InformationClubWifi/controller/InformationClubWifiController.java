/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.InformationClubWifi.controller;

import com.api.InformationClubWifi.model.InfClubWifiRequestModel;
import com.api.InformationClubWifi.model.InfClubWifiResponseModel;
import com.api.InformationClubWifi.service.InformationClubWifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author APerez
 */
@RestController
@RequestMapping("/api/informationclubwifi")
public class InformationClubWifiController {
    
    
    @Autowired
    private InformationClubWifiService informationClubWifiService;
        
    @RequestMapping(value="/getInformation",method=RequestMethod.GET)
    public String getInformation(){
        System.out.println("ADAP: InformationClubWifiController: getInformation ");        
        return "Hello word!";
    }
    
    @RequestMapping(value="/processReceive",method=RequestMethod.POST)
    public InfClubWifiResponseModel getProcessReceive(@RequestBody InfClubWifiRequestModel informationClubWifiModel){
        System.out.println("getProcessReceive: Start validate accout "+informationClubWifiModel.getInput());      
        return informationClubWifiService.validateAccout(informationClubWifiModel.getInput());
        
    }
}
