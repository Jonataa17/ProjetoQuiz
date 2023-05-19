/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.DAOFactory;
import dao.QuizDAO;
import model.Quiz;

/**
 *
 * @author Jonata
 */
public class QuizServicos {
    
    public void quiz(Quiz qVO){
        QuizDAO qDAO = DAOFactory.getQuizDAO();
        qDAO.cadastrarQuizDAO(qVO);
    }
}
