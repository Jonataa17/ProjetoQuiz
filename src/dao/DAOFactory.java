/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Jonata
 */
public class DAOFactory {

    private static PerfilDAO pDAO = new PerfilDAO();

    public static PerfilDAO getPerfilDAO() {
        return pDAO;
    }//fim PerfilDAO
    
    private static PerguntaDAO perDAO = new PerguntaDAO();

    public static PerguntaDAO getPerguntaDAO() {
        return perDAO;
    }//fim PerguntaDAO
    
    private static QuizDAO qDAO = new QuizDAO();
    
    public static QuizDAO getQuizDAO() {
        return qDAO;
    }//fim QuizDAO
    
    private static UsuarioDAO uDAO = new UsuarioDAO();
    
    public static UsuarioDAO getUsuarioDAO() {
        return uDAO;
    }//fim UsuarioDAO
}
