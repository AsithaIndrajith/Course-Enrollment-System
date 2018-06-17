/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.Degree;
import Model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */
public class DegreeController {
    public static ArrayList<Degree> searchDegree(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From degree where depID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            ArrayList<Degree>dep=new ArrayList<>();
            while(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                Degree dp=new Degree();
                dp.setDegreeID((rst.getString("degreeID")));
                dp.setDegreeName((rst.getString("degreeName")));
                dp.setDepID(rst.getString("depID"));
                dep.add(dp);
            }
            return dep;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static int insertDegree(Degree dp) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO degree (degreeID,degreeName,depID)VALUES (?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, dp.getDegreeID());
            stm.setObject(2, dp.getDegreeName());
            stm.setObject(3, dp.getDepID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int updateDegree(Degree dp) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE degree SET degreeID=?,degreeName=?,depID=? WHERE degreeID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, dp.getDegreeID());
            stm.setObject(2, dp.getDegreeName());
            stm.setObject(3, dp.getDepID());
            stm.setObject(4, dp.getDegreeID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int deleteDegree(Department dp) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM degree WHERE degreeID=?";
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
