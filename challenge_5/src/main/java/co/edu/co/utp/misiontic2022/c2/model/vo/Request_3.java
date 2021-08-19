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
public class Request_3 {
    //Attributes
    private int idLeader;
    private String name;
    private String surname;
    private String secondSurname;
    
    //Builder

    public Request_3(int idLeader, String name, String surname, String secondSurname) {
        this.idLeader = idLeader;
        this.name = name;
        this.surname = surname;
        this.secondSurname = secondSurname;
    }
    
    //Getter and Setters

    public int getIdLeader() {
        return idLeader;
    }

    public void setIdLeader(int idLeader) {
        this.idLeader = idLeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    
}
