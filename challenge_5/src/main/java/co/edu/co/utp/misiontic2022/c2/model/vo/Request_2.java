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
public class Request_2 {
    //Attributes
    private int idProject;
    private String provider;
    private String prepaid;
    private int idBuildingMaterial;
    private String materialName;
    
    //Builder
    public Request_2(int idProject, String provider, String prepaid, int idBuildingMaterial, String materialName) {
        this.idProject = idProject;
        this.provider = provider;
        this.prepaid = prepaid;
        this.idBuildingMaterial = idBuildingMaterial;
        this.materialName = materialName;
    }
    
    //Getter and Setters
    
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPrepaid() {
        return prepaid;
    }

    public void setPrepaid(String prepaid) {
        this.prepaid = prepaid;
    }

    public int getIdBuildingMaterial() {
        return idBuildingMaterial;
    }

    public void setIdBuildingMaterial(int idBuildingMaterial) {
        this.idBuildingMaterial = idBuildingMaterial;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
    
}
