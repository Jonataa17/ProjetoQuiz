/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jonata
 */
public class Conexao {
     //cria uma conexão com o endereço do BD/Schema
    private static String url = "jdbc:mysql://localhost:3306/projetoQuiz";//colocar o nome do BD depois do: /
                                            // ^ podendo ser com letra minuscula
    
    //cria uma conexão com user do BD
    private static String user = "root";

    //cria uma conexão com a senha do BD
    private static String pass = "";

    public static Connection getConexao() throws SQLException {
        //inicia cenexão nula
        Connection c = null;

        //tenta estabelecer conexão
        try {
            c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            //caso haja erro na conexão
            throw new SQLException("Erro ao conectar !\n"
                    + e.getMessage());
        }
        return c;
    }
}
