/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Perfil;

/**
 *
 * @author Jonata
 */
public class PerfilDAO {
    
    public void cadastrarPerfilDAO(Perfil pVO) {
        //busca conexão com o BD
        try {
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQL, é a area no Java onde vamos executar os Scripts SQL
            String sql;

            sql = "insert into perfil values"
                    + "(null, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getPerfil());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrarPerfilDAO
    
    public ArrayList<Perfil> getPerfilDAO() {
        ArrayList<Perfil> perfil = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from perfil";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                Perfil p = new Perfil();
                //lado do java |x| (lado do banco)
                p.setIdPerfil(rs.getInt("idperfil"));
                p.setPerfil(rs.getString("perfil"));
                perfil.add(p);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
        return perfil;
    }//fim do listar (ArrayList)
    
    public Perfil getPerfilByDoc(int id) {

        Perfil p = new Perfil();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from perfil where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //lado do java |x| (lado do banco)
                p.setIdPerfil(rs.getInt("idperfil"));
                p.setPerfil(rs.getString("perfil"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Consultar Perfil!\n"
                    + ex.getMessage());
        }
        return p;
    }// fim getPerfilByDoc
    
     public void deletarPerfilDAO(String id) {

        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from perfil where = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Deletar ID!\n"
                    + ex.getMessage());
        }
    }//fim deletarPerfilDAO
     
     public void atualizaPerfilByDoc(Perfil pVO) {

        try {
            Connection con = Conexao.getConexao();
            String sql = "update perfil set perfil = ? "
                    + "where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getPerfil());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Atualizar o Perfil!\n"
                    + ex.getMessage());
        }

    }//fim atualizaPerfilByDoc
}
