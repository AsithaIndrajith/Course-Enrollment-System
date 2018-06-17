/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
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
public class LecturerController {
    public static Lecturer searchLecturer(String id) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM lecturer WHERE lecturerId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Lecturer lec=new Lecturer();
            lec.setLecturerID(rst.getString("lecturerId"));
            lec.setLecturerName(rst.getString("lecturerName"));
            lec.setLecturerPhone(rst.getString("lecturerPhone"));
            lec.setLecturerAddress(rst.getString("lecturerAddress"));
            lec.setLecturerNIC(rst.getString("lecturerNIC"));
            lec.setLecturerPassword(rst.getString("lecturerPassword"));
            lec.setDepID(rst.getString("depID"));
            return lec;
        }
        else{
            return null;
        }
    }
    
    public static ArrayList<Lecturer> searchLecturerID(String dep) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM lecturer WHERE depID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, dep);
        ResultSet rst = stm.executeQuery();
        ArrayList<Lecturer> ls=new ArrayList<>();
        while(rst.next()){
            Lecturer lec=new Lecturer();
            lec.setLecturerID(rst.getString("lecturerId"));
            lec.setLecturerName(rst.getString("lecturerName"));
            lec.setLecturerPhone(rst.getString("lecturerPhone"));
            lec.setLecturerPhone(rst.getString("lecturerAddress"));
            lec.setLecturerNIC(rst.getString("lecturerNIC"));
            lec.setLecturerPassword(rst.getString("lecturerPassword"));
            ls.add(lec);
        }
        return ls;
    }
    
    public static int insertLecturer(Lecturer ins) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO Lecturer (lecturerID,lecturerName,lecturerPhone,lecturerAddress,lecturerNIC,lecturerPassword,depID)VALUES (?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, ins.getLecturerID());
            stm.setObject(2, ins.getLecturerName());
            stm.setObject(3, ins.getLecturerPhone());
            stm.setObject(4, ins.getLecturerAddress());
            stm.setObject(5, ins.getLecturerNIC());
            stm.setObject(6, ins.getLecturerPassword());
            stm.setObject(7, ins.getDepID());
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int updateLecturer(Lecturer ins) throws SQLException, ClassNotFoundException{
        try{
                String sql = "UPDATE lecturer SET lecturerName=?,lecturerPhone=?,lecturerAddress=?, lecturerNIC=?, lecturerPassword=? WHERE lecturerID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
           
            stm.setObject(1, ins.getLecturerName());
            stm.setObject(2, ins.getLecturerPhone());
            stm.setObject(3, ins.getLecturerAddress());
            stm.setObject(4, ins.getLecturerNIC());
            stm.setObject(5, ins.getLecturerPassword());
            stm.setObject(6, ins.getLecturerID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int deleteLecturer(Lecturer ins) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM lecturer WHERE lecturerID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, ins.getLecturerID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
}
