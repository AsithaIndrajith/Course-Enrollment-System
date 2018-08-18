/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database_Connection.DBConnection;
import Model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asitha
 */

/**Department controller class*/
public class DepartmentController {
    
    /**Search department by department name*/
    public static Department searchDepartmentByDepartmentName(String name) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From department where departmentName=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, name);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
                Department dp=new Department();
                dp.setDepartmentID((rst.getString("departmentID")));
                dp.setDepartmentName((rst.getString("departmentName")));
                return dp;
            }else{
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Insert department*/
    public static int insertDepartment(Department dp) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO department (departmentID,departmentName)VALUES (?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, dp.getDepartmentID());
            stm.setObject(2, dp.getDepartmentName());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
    /**Update department*/
     public static int updateDepartment(Department dp) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE department SET departmentID=?,departmentName=? WHERE departmentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, dp.getDepartmentID());
            stm.setObject(2, dp.getDepartmentName());
            stm.setObject(3, dp.getDepartmentID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     
     /**Delete department*/
     public static int deleteDepartment(Department dp) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM department WHERE departmentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, dp.getDepartmentID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
}
