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
public class Quiz {

    private int idQuiz;
    private String cabecario;
    private String descricao;

    public Quiz() {
    }

    public Quiz(int idQuiz, String cabecario, String descricao) {
        this.idQuiz = idQuiz;
        this.cabecario = cabecario;
        this.descricao = descricao;
    }

    public int getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(int idQuiz) {
        this.idQuiz = idQuiz;
    }

    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Quiz: " + "idQuiz = " + idQuiz + "cabecario = " + cabecario + "descricao = " + descricao;
    }

}
