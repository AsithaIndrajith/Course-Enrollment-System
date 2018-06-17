/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.Course;
import Model.Instructor;
import Model.Lecturer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */
public class InstrcutorController {
    public static Instructor searchInstrcutor(String id) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM instructor WHERE instructorId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Instructor ins=new Instructor();
            ins.setInstructorID(rst.getString("instructorId"));
            ins.setInstructorName(rst.getString("instructorName"));
            ins.setInstructorPhone(rst.getString("instructorPhone"));
            ins.setInstructorAddress(rst.getString("instructorAddress"));
            ins.setInstructorNIC(rst.getString("instructorNIC"));
            ins.setInstructorPassword(rst.getString("instructorPassword"));
            ins.setDepID(rst.getString("depID"));
            return ins;
        }
        else{
            return null;
        }
    }
    
    public static ArrayList<Instructor> searchInstrcutorID(String dep) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM instructor WHERE depId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, dep);
        ResultSet rst = stm.executeQuery();
        ArrayList<Instructor> ls=new ArrayList<>();
        while(rst.next()){
            Instructor ins=new Instructor();
            ins.setInstructorID(rst.getString("instructorId"));
            ins.setInstructorName(rst.getString("instructorName"));
            ins.setInstructorPhone(rst.getString("instructorPhone"));
            ins.setInstructorAddress(rst.getString("instructorAddress"));
            ins.setInstructorNIC(rst.getString("instructorNIC"));
            ins.setInstructorPassword(rst.getString("instructorPassword"));
            ls.add(ins);
        }
        return ls;
    }
    
    
    public static int insertInstructor(Instructor ins) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO instructor (instructorID,instructorName,instructorPhone,instructorAddress,instructorNIC,instructorPassword,depID)VALUES (?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, ins.getInstructorID());
            stm.setObject(2, ins.getInstructorName());
            stm.setObject(3, ins.getInstructorPhone());
            stm.setObject(4, ins.getInstructorAddress());
            stm.setObject(5, ins.getInstructorNIC());
            stm.setObject(6, ins.getInstructorPassword());
            stm.setObject(7, ins.getDepID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int updateInstructor(Instructor ins) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE instructor SET instructorName=?,instructorPhone=?,instructorAddress=?, instructorNIC=?, instructorPassword=? WHERE instructorID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
           
            stm.setObject(1, ins.getInstructorName());
            stm.setObject(2, ins.getInstructorPhone());
            stm.setObject(3, ins.getInstructorAddress());
            stm.setObject(4, ins.getInstructorNIC());
            stm.setObject(5, ins.getInstructorPassword());
            stm.setObject(6, ins.getInstructorID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int deleteInstructor(Instructor ins) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM instructor WHERE instructorID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, ins.getInstructorID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
}
