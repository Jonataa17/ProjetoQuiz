/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Perfil;

/**
 *
 * @author 182120038
 */
public class CPerfil {

    ArrayList<Perfil> perfis = new ArrayList<>();
    int idPerfil = 1;

    /**
     * geraID gerencia a geração de id's autoincrement para Perfil.
     *
     * @return
     */
    public int geraID() {
        return this.idPerfil++;
    }

    /**
     * addPerfil adiciona um Perfil na lista de Perfil.
     *
     * @param p
     */
    public void addPerfil(Perfil p) {
        this.perfis.add(p);
    }

    /**
     * getPerfis retorna na lista de Perfil.
     *
     * @return
     */
    public ArrayList<Perfil> getPerfis() {
        return this.perfis;
    }

    /**
     * removePerfil remove Perfil da lista de perfil.
     *
     * @param p
     */
    public void removePerfil(Perfil p) {
        this.perfis.remove(p);
    }

    /**
     * mockPerfis inicializa aplicação com perfis.
     */
    public void mockPerfis() {
        Perfil p1 = new Perfil();
        p1.setIdPerfil(this.geraID());
        p1.setPerfil("Paul Walker");
        this.addPerfil(p1);

        Perfil p2 = new Perfil();
        p2.setIdPerfil(this.geraID());
        p2.setPerfil("Josivaldo Oliveira");
        this.addPerfil(p2);

    }

}
