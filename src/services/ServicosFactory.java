/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author Jonata
 */
public class ServicosFactory {
    
    private static UsuarioServicos uServicos = new UsuarioServicos();

    public static UsuarioServicos getUsuarioServicos() {
        return uServicos;
    }//fim UsuarioServicos
    
    private static PerfilServicos pServicos = new PerfilServicos();

    public static PerfilServicos getPerfilServicos() {
        return pServicos;
    }//fim PerfilServicos
    
    private static PerguntaServicos perServicos = new PerguntaServicos();

    public static PerguntaServicos getPerguntaServicos() {
        return perServicos;
    }//fim PerguntaServicos
    
    private static QuizServicos qServicos = new QuizServicos();

    public static QuizServicos getQuizServicos() {
        return qServicos;
    }//fim QuizServicos
}
