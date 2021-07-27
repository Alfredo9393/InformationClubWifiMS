/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.InformationClubWifi.service;

import com.api.InformationClubWifi.model.InfClubWifiResponseModel;
import com.api.InformationClubWifi.model.InfClubWifiResultModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author APerez
 */
@Service
public class InformationClubWifiService {
      

    
    public InfClubWifiResponseModel validateAccout(String accout) {
        System.out.println("aadap asdfasdfasdfasdfasdf");
        InfClubWifiResponseModel modelRequest = new InfClubWifiResponseModel();  
        String asifTitle ="";
        if(accout.length()==10 && accout!=""){
            asifTitle = accout+""; //oraext:setFlowInstanceTitle(string(concat($inputVariable.payload/client:Account, '')))
            //'select X  from /account where F1 = V1'
            //oraext:parseXML('<RESULTS></RESULTS>')
//            result 
//            if ()

            System.out.println("correct");
            return getFromAccoutSucc(accout);
            
        }else{
            System.out.println("Falled - Ingresar una cuenta valida");
            return getFromAccoutErr(accout);
        }
 
   
    }
    
    
    public InfClubWifiResponseModel getFromAccoutSucc(String accout){
        InfClubWifiResponseModel res = new InfClubWifiResponseModel();
        
        List<InfClubWifiResultModel> result = new ArrayList<>(); 
        InfClubWifiResultModel obj = new InfClubWifiResultModel();
        obj.setIdResult("0000");
        obj.setResult("0");
        obj.setResultDescription("Peticion realizada con exito");
        result.add(obj);
        
        res.setResult(result);
        res.setName("alfredo del angel perez");
        res.setPhone("8116220283");
        res.setEmail("alfredo_93939@onissolutions.con");
        
        return res;
    }
    
    public InfClubWifiResponseModel getFromAccoutErr(String accout){
        InfClubWifiResponseModel res = new InfClubWifiResponseModel();
        
        List<InfClubWifiResultModel> result = new ArrayList<>(); 
        InfClubWifiResultModel obj = new InfClubWifiResultModel();
        obj.setIdResult("501");
        obj.setResult("1");
        obj.setResultDescription("Ingresar una cuenta valida");
        result.add(obj);
  
        res.setResult(result);
        
        return res;
    }
    
    public InfClubWifiResponseModel getFromAccoutFalled(String accout){
        InfClubWifiResponseModel res = new InfClubWifiResponseModel();
        
        List<InfClubWifiResultModel> result = new ArrayList<>(); 
        InfClubWifiResultModel obj = new InfClubWifiResultModel();
        obj.setIdResult("505");
        obj.setResult("1");
        obj.setResultDescription("Peticion fallida");
        result.add(obj);
  
        res.setResult(result);
        
        return res;
    }
        
    public String format(String name) {
        String convert = "";
        String[] information = name.split(" ");

        for (int i = 0; i < information.length; i++) {
            if (i < information.length - 1) {
                convert += information[i].substring(0, 1).toUpperCase() + information[i].substring(1).toLowerCase() + " ";
            } else {
                convert += information[i].substring(0, 1).toUpperCase() + information[i].substring(1).toLowerCase();
            }
        }

        return convert;
    }
        
    
}


//string($IvkInformation_Output.PCM_OP_SEARCH_outputFlist/
//            ns1:RESULTS/ns1:NAMEINFO/ns1:PHONES[$CounterPhones]/ns1:TYPE) = '5'
//    
//icon	string($IvkInformation_Output.PCM_OP_SEARCH_outputFlist/ns1:RESULTS/ns1:NAMEINFO[1]
//    /ns1:PHONES[$CounterPhones]/ns1:PHONE)
//    $outputVariable.payload/client:Phone
//
//tring($IvkInformation_Output.PCM_OP_SEARCH_outputFlist/ns1:RESULTS/ns1:AAC_VENDOR)
//
//try{   
//   
//    String name = (String) getVariableData("VarName");   
//    setVariableData("VarName", FormatString.Format(name));   
//   
//}catch(Exception e){   
//   
//}
//
//string($IvkInformation_Output.PCM_OP_SEARCH_outputFlist/ns1:RESULTS/ns1:NAMEINFO[1]/ns1:EMAIL_ADDR)