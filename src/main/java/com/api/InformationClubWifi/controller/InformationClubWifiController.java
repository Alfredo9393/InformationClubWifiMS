/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.InformationClubWifi.controller;

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
    
    @RequestMapping(value="/getInformation",method=RequestMethod.GET)
    public String getInformation(){
        System.out.println("ADAP: InformationClubWifiController: getInformation ");        
        return "Hello word!";
    }
}
