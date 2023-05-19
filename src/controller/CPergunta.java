/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Pergunta;

/**
 *
 * @author 182120038
 */
public class CPergunta {

    ArrayList<Pergunta> perguntas = new ArrayList<>();
    int idPergunta = 1;

    /**
     * geraID gerencia a geração de id's autoincrement para Pergunta.
     *
     * @return
     */
    public int geraID() {
        return this.idPergunta++;
    }

    /**
     * addPergunta adiciona uma Pergunta na lista de Pergunta.
     *
     * @param p
     */
    public void addPergunta(Pergunta p) {
        this.perguntas.add(p);
    }

    /**
     * getPergunta retorna na lista de Pergunta.
     *
     * @return
     */
    public ArrayList<Pergunta> getPergunta() {
        return this.perguntas;
    }

    /**
     * removePergunta remove Pergunta da lista de Pergunta.
     *
     * @param p
     */
    public void removePerfil(Pergunta p) {
        this.perguntas.remove(p);
    }

    /**
     * mockPerguntas inicializa aplicação com pergunta.
     */
    public void mockPerguntas() {
        Pergunta p1 = new Pergunta();
        p1.setIdPergunta(this.geraID());
        p1.setAssunto("Ficção");
        p1.setErroAcerto("5 acertos || 2 erros");
        p1.setPontuacao(80 / 100);
        this.addPergunta(p1);

        Pergunta p2 = new Pergunta();
        p2.setIdPergunta(this.geraID());
        p2.setAssunto("Esportes");
        p2.setErroAcerto("3 acertos || 4 erros");
        p2.setPontuacao(30 / 100);
        this.addPergunta(p2);

    }

}
