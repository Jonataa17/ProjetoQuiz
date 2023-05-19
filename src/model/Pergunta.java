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
public class Pergunta {

    private int idPergunta;
    private String assunto;
    private String erroAcerto;
    private float pontuacao;
    private Quiz idQuiz;

    public Pergunta() {
    }

    public Pergunta(int idPergunta, String assunto, String erroAcerto, float pontuacao, Quiz idQuiz) {
        this.idPergunta = idPergunta;
        this.assunto = assunto;
        this.erroAcerto = erroAcerto;
        this.pontuacao = pontuacao;
        this.idQuiz = idQuiz;
    }

    public int getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getErroAcerto() {
        return erroAcerto;
    }

    public void setErroAcerto(String erroAcerto) {
        this.erroAcerto = erroAcerto;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Quiz getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(Quiz idQuiz) {
        this.idQuiz = idQuiz;
    }

    @Override
    public String toString() {
        return "Pergunta: " + "idPergunta = " + idPergunta + "assunto = " + assunto + "erroAcerto = " + erroAcerto + "pontuacao = " + pontuacao + "idQuiz = " + idQuiz;
    }

}
