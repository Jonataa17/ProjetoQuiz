/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.DAOFactory;
import dao.PerfilDAO;
import java.util.ArrayList;
import model.Perfil;

/**
 *
 * @author Jonata
 */
public class PerfilServicos {
    
    public void cadPerfil(Perfil pVO) {
        PerfilDAO pDAO = DAOFactory.getPerfilDAO();
        pDAO.cadastrarPerfilDAO(pVO);
    }//fim cadPerfil

    public void atualizarPerfil(Perfil pVO) {
        PerfilDAO pDAO = DAOFactory.getPerfilDAO();
        pDAO.atualizaPerfilByDoc(pVO);
    }//fim atualizarPerfil

    public void deletarPerfil(String id) {
        PerfilDAO pDAO = DAOFactory.getPerfilDAO();
        pDAO.deletarPerfilDAO(id);
    }//fim deletarPerfil

    public Perfil buscarPerfilById(int id) {
        PerfilDAO pDAO = DAOFactory.getPerfilDAO();
        return pDAO.getPerfilByDoc(id);
    }//fim buscarPerfilById

    public ArrayList<Perfil> getPerfis() {
        PerfilDAO pDAO = DAOFactory.getPerfilDAO();
        return pDAO.getPerfilDAO();
    }//fim ArrayList
    
}
