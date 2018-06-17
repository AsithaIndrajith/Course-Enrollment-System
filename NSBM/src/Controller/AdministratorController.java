/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Asitha
 */



public class AdministratorController {
    public static int searchAdmin(String id,String password) throws SQLException, ClassNotFoundException {
        String sql = "Select * From administrator where id=? and password=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        stm.setObject(2, password);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
            return 1;
        }else{
            return 0;
        }
    }
}
