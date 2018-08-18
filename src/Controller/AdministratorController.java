/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database_Connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asitha
 */


/**Administrator controller class*/
public class AdministratorController {
    
    /** Search Administrator by username and password*/
    public static int searchAdministrator(String username,String password) throws SQLException, ClassNotFoundException {
        String sql = "Select * From administrator where id=? and password=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, username);
        stm.setObject(2, password);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return 1;
        }else{
            return 0;
        }
    }
    
    
}
