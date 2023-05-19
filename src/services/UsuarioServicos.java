/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.DAOFactory;
import dao.UsuarioDAO;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author Jonata
 */
public class UsuarioServicos {
    
     public void cadUsuario(Usuario uVO) {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.cadastrarUsuarioDAO(uVO);
    }//fim cadUsuario

    public void atualizarUsuario(Usuario uVO) {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.atualizaUsuarioByDoc(uVO);
    }//fim atualizarUsuario

    public void deletarUsuario(String cpf) {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.deletarUsuarioDAO(cpf);
    }//fim deletarUsuario

    public Usuario buscarUsuarioByCPF(String cpf) {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        return uDAO.getUsuarioByDoc(cpf);
    }//fim buscarUsuarioByCPF

    public ArrayList<Usuario> getUsuarios() {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        return uDAO.getUsuarioDAO();
    }//fim ArrayList
}
