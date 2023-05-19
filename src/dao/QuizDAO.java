/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Quiz;

/**
 *
 * @author Jonata
 */
public class QuizDAO {
    
     public void cadastrarQuizDAO(Quiz uVO) {
        //busca conexão com o BD
        try {
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQL, é a area no Java onde vamos executar os Scripts SQL
            String sql;

            sql = "insert into quiz values"
                    + "(null, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uVO.getCabecario());
            pst.setString(2, uVO.getDescricao());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrarQuizDAO
}
