/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.Lecturer;
import Model.Subject;
import Model.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asitha
 */
public class TimeController {
    public static Time searchTime(String lecid,String sem,String yr) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM teaching_allocation WHERE lecturerId=? AND semester=? AND year=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecid);
        stm.setObject(2, sem);
        stm.setObject(3, yr);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Time t=new Time();
            t.setLecID(rst.getString("lecturerId"));
            t.setInsID(rst.getString("instructorID"));
            t.setLocID(rst.getString("subjectID"));
            t.setSubID(rst.getString("locationID"));
            t.setSem(rst.getString("semester"));
            t.setYr(rst.getString("year"));
            return t;
        }
        else{
            return null;
        }
    }
    
    public static Time searchTimeIns(String lecid,String sem,String yr) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM teaching_allocation WHERE instructorId=? AND semester=? AND year=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecid);
        stm.setObject(2, sem);
        stm.setObject(3, yr);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Time t=new Time();
            t.setLecID(rst.getString("lecturerId"));
            t.setInsID(rst.getString("instructorID"));
            t.setLocID(rst.getString("subjectID"));
            t.setSubID(rst.getString("locationID"));
            t.setSem(rst.getString("semester"));
            t.setYr(rst.getString("year"));
            return t;
        }
        else{
            return null;
        }
    }
    
     public static int insertTime(Time cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO teaching_allocation (subjectID,lecturerID,semester,year,locationID,instructorID)VALUES (?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getSubID());
            stm.setObject(2, cs.getLecID());
            stm.setObject(3, cs.getSem());
            stm.setObject(4, cs.getYr());
            stm.setObject(5, cs.getLocID());
            stm.setObject(6, cs.getInsID());            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
    public static int updateTime(Time cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE teaching_allocation SET subjectID=?,lecturerID=?,semester=?,year=?,locationID=? WHERE lecturerID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getSubID());
            stm.setObject(2, cs.getLecID());
            stm.setObject(3, cs.getSem());
            stm.setObject(4, cs.getYr());
            stm.setObject(5, cs.getLocID());
            stm.setObject(6, cs.getLecID());            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
}
