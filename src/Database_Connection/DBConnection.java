/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_Connection;

/**
 *
 * @author Asitha
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**Database connection class*/
public class DBConnection {
    private static DBConnection dBConnection;
    private static Connection con;
    
    /**initialising static database connection */
    private DBConnection(){//com.mysql.jdbc.Driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/courseenrolmentsystem","root","");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please check your Database Connection and restart the application");
            System.exit(0);
        }
    }
    
    /**Getting database connection*/
    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
    
    /**Getting database connection*/
    public Connection getConnection(){
        return con;
    }
    
    
}
