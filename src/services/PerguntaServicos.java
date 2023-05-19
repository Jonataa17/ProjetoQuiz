/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.DAOFactory;
import dao.PerguntaDAO;
import model.Pergunta;

/**
 *
 * @author Jonata
 */
public class PerguntaServicos {
    
    public void pergunta(Pergunta perVO){
        PerguntaDAO perDAO = DAOFactory.getPerguntaDAO();
        perDAO.cadastrarPerguntaDAO(perVO);
    }
}
