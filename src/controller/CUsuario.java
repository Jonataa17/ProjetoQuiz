/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author 182120038
 */
public class CUsuario {

    ArrayList<Usuario> usuarios = new ArrayList<>();
    int idUsuario = 1;

    /**
     * geraID gerencia a geração de id's autoincrement para Usuario.
     *
     * @return
     */
    public int geraID() {
        return this.idUsuario++;
    }

    /**
     * addUsuario adiciona um Usuario na lista de Usuario.
     *
     * @param u
     */
    public void addUsuario(Usuario u) {
        this.usuarios.add(u);
    }

    /**
     * getUsuarios retorna na lista de Usuario.
     *
     * @return
     */
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    /**
     * removeUsuarios remove Usuario da lista de Usuario.
     *
     * @param u
     */
    public void removeUsuarios(Usuario u) {
        this.usuarios.remove(u);
    }

    /**
     * mockUsuario inicializa aplicação com Usuario.
     */
    public void mockUsuarios() {
        Usuario u1 = new Usuario();
        u1.setIdUsuario(this.geraID());
        u1.setNome("Elvis Presley");
        u1.setCpf("91121505090");
        u1.setNumCadastro("123456");
        u1.setEndereco("Hollywood, Estrada da fama");
        u1.setTelefone("5584444433");
        this.addUsuario(u1);

        Usuario u2 = new Usuario();
        u2.setIdUsuario(this.geraID());
        u2.setNome("Irineu Santos");
        u2.setCpf("46909246004");
        u2.setNumCadastro("654321");
        u2.setEndereco("Pernambuco, Estrada de chao");
        u2.setTelefone("51987775532");
        this.addUsuario(u2);
    }//fim mockUsuario

    /**
     * getUsuarioCPF pesquisa usuario pelo CPF e retorna o usuario e caso não
     * encontre retorna nulo podendo cadastrar.
     *
     * @param cpf
     * @return
     */
    public Usuario getUsuarioCPF(String cpf) {
        Usuario u = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                u = usuario;
                break;
            }
        }

        return u;
    }//fim getUsuario

}
