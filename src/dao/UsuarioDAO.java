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
import model.Usuario;

/**
 *
 * @author Jonata
 */
public class UsuarioDAO {
    public void cadastrarUsuarioDAO(Usuario uVO) {
        //busca conexão com o BD
        try {
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQL, é a area no Java onde vamos executar os Scripts SQL
            String sql;

            sql = "insert into usuario values"
                    + "(null, ?, ?, null, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uVO.getNome());
            pst.setString(2, uVO.getCpf());
            pst.setString(3, uVO.getTelefone());
            pst.setString(4, uVO.getEndereco());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrarUsuarioDAO
    
    public ArrayList<Usuario> getUsuarioDAO() {
        ArrayList<Usuario> usuario = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from usuario";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                Usuario u = new Usuario();
                //lado do java |x| (lado do banco)
                u.setIdUsuario(rs.getInt("idusuario"));
                u.setNome(rs.getString("nome"));
                u.setCpf(rs.getString("cpf"));
                u.setEndereco(rs.getString("telefone"));
                u.setTelefone(rs.getString("endereco"));
                usuario.add(u);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
        return usuario;
    }//fim do listar (ArrayList)
    
    public Usuario getUsuarioByDoc(String cpf) {

        Usuario u = new Usuario();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from usuario where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //lado do java |x| (lado do banco)
                u.setIdUsuario(rs.getInt("idusuario"));
                u.setNome(rs.getString("nome"));
                u.setCpf(rs.getString("cpf"));
                u.setTelefone(rs.getString("telefone"));
                u.setEndereco(rs.getString("endereco"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Consultar CPF!\n"
                    + ex.getMessage());
        }
        return u;
    }// fim getUsuarioByDoc
    
    public void deletarUsuarioDAO(String cpf) {

        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from usuario where = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Deletar Usuario!\n"
                    + ex.getMessage());
        }
    }//fim deletarUsuarioDAO
    
    public void atualizaUsuarioByDoc(Usuario uVO) {

        try {
            Connection con = Conexao.getConexao();
            String sql = "update usuario set nome = ?, endereco = ?, telefone = ? "
                    + "where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uVO.getNome());
            pst.setString(2, uVO.getEndereco());
            pst.setString(3, uVO.getTelefone());
            pst.setString(4, uVO.getCpf());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao Atualizar o Usuario!\n"
                    + ex.getMessage());
        }
    }//fim atualizaUsuarioByDoc
}
