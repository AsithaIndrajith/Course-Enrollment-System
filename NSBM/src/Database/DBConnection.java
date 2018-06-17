/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Asitha
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnection {
    private static DBConnection dBConnection;
    private static Connection con;
    
    private DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please check your Database Connection");
        }
    }
    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
    public Connection getConnection(){
        return con;
    }
    
    
}
