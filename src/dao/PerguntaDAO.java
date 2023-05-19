/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Pergunta;

/**
 *
 * @author Jonata
 */
public class PerguntaDAO {
    
    public void cadastrarPerguntaDAO(Pergunta perVO) {
        //busca conexão com o BD
        try {
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQL, é a area no Java onde vamos executar os Scripts SQL
            String sql;

            sql = "insert into pergunta values"
                    + "(null, ?, ?, ?, null)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, perVO.getAssunto());
            pst.setString(2, perVO.getErroAcerto());
            pst.setFloat(3, perVO.getPontuacao());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrarPerguntaDAO
}
