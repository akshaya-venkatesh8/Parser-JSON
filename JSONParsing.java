/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.akshayavenkatesh8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author akshaya
 */
public class JSONParsing {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String line,jsonData="";
        Address ad = new Address();
        FileReader jsonfile = new FileReader("address.json");
        JSONParser thisparser=new JSONParser();
        JSONObject jsonObject = (JSONObject) thisparser.parse(jsonfile);            
        JSONObject addressobj = (JSONObject) jsonObject.get("address");
     ad.name=(String)addressobj.get("name");
     ad.streetNumber=(String)addressobj.get("streetnumber");
     ad.streetName=(String)addressobj.get("streetname");
     ad.secondaryAddress=(String)addressobj.get("secondary address");
     ad.city=(String)addressobj.get("city");
     ad.stateCode=(String)addressobj.get("statecode");
     ad.zipCode=(String)addressobj.get("zipcode");
         System.out.println(ad);
             }   
     
        }
    
    
