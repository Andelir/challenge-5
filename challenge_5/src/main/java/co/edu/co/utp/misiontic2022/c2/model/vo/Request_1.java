/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.model.vo;

/**
 *
 * @author anderson
 */
public class Request_1 {

    //Attributes
    private int numLeaders;
    private String city;
    
     //Builder
    public Request_1(int numLeaders, String city) {
        this.city = city;
        this.numLeaders = numLeaders;
    }
    
    
    //Getters and Setters

    public int getNumLeaders() {
        return numLeaders;
    }

    public void setNumLeaders(int numLeaders) {
        this.numLeaders = numLeaders;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
