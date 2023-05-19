/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 182120038
 */
public class Perfil {

    private int idPerfil;
    private String perfil;

    public Perfil() {
    }

    public Perfil(int idPerfil, String perfil) {
        this.idPerfil = idPerfil;
        this.perfil = perfil;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Perfil{" + "idPerfil=" + idPerfil + ", perfil=" + perfil + '}';
    }

    
}
