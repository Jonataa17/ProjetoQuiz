/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Quiz;

/**
 *
 * @author 182120038
 */
public class CQuiz {

    ArrayList<Quiz> quizes = new ArrayList<>();
    int idQuiz = 1;

    /**
     * geraID gerencia a geração de id's autoincrement para Quiz.
     *
     * @return
     */
    public int geraID() {
        return this.idQuiz++;
    }

    /**
     * addQuiz adiciona um Quiz na lista de Quiz.
     *
     * @param q
     */
    public void addQuiz(Quiz q) {
        this.quizes.add(q);
    }

    /**
     * getQuiz retorna na lista de Quiz.
     *
     * @return
     */
    public ArrayList<Quiz> getQuiz() {
        return this.quizes;
    }

    /**
     * removeQuiz remove Quiz da lista de Quiz.
     *
     * @param q
     */
    public void removeQuiz(Quiz q) {
        this.quizes.remove(q);
    }

    /**
     * mockQuiz inicializa aplicação com quiz.
     */
    public void mockQuizes() {
        Quiz q1 = new Quiz();
        q1.setIdQuiz(this.geraID());
        q1.setCabecario(" --> Bem vindo ao Quiz <--");
        q1.setDescricao("Escolha um assunto e teste seu conhecimento!");
        this.addQuiz(q1);
    }

}
