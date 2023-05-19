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
public class Usuario {

    private int idUsuario;
    private String nome;
    private String cpf;
    private String numCadastro;
    private String telefone;
    private String endereco;
    private Perfil idPerfil;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nome, String cpf, String numCadastro, String telefone, String endereco, Perfil idPerfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.numCadastro = numCadastro;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idPerfil = idPerfil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(String numCadastro) {
        this.numCadastro = numCadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Perfil getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Perfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    @Override
    public String toString() {
        return "Usuario: " + "idUsuario = " + idUsuario + "nome = " + nome + "cpf = " + cpf + "numCadastro = " + numCadastro + "telefone = " + telefone + "endereco = " + endereco + "idPerfil = " + idPerfil;
    }

}
