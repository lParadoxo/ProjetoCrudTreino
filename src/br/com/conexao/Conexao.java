package br.com.conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Conexao {
     
    static Connection con = null;
     
    static String url = "jdbc:mysql://localhost:3306/arquivojm?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";
    static String user = "root";
    static String password = "";
          
  
     public static Connection conectar() {
  
          try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado");
                
          } catch (ClassNotFoundException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("Falha conexão");
          }
  
          return con;
     }
  
     public void closeConnection() throws SQLException {
  
          con.close();
     }
  
     
}
