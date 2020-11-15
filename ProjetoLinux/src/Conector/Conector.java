/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conector;
import java.sql.*;
/**
 *
 * @author hcp
 */
public class Conector {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        //CHAMANDO DRIVER DA BIBLIOTECA 
        String driver = "com.mysql.jdbc.Driver";
        
        //ARMAZENA INFORMACOES DO BANCO
        String url = "jdbc:mysql://localhost:3306/bd";
        String user = "root";
        String password = "";
        
        //ESTABELECE CONEXAO 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            
            return null;
            
        }
    }
}

