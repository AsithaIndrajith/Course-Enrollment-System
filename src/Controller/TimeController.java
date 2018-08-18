/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database_Connection.DBConnection;
import Model.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */

 /**Teaching Allocation controller class*/
public class TimeController {
    
     /**Search teaching allocation by lecturer ID and semester and year*/
    public static Time searchTeachingAllocationByLecturerIDAndSemesterAndYear(String lecid,String sem,String yr) throws SQLException, ClassNotFoundException{
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
            t.setLocID(rst.getString("locationID"));
            t.setSubID(rst.getString("subjectID"));
            t.setSem(rst.getString("semester"));
            t.setYr(rst.getString("year"));
            return t;
        }
        else{
            return null;
        }
    }
    
    /**Search teaching allocation by instructor ID and semester and year*/
    public static Time searchTeachingAllocationByInstructorIDAndYearAndSemester(String lecid,String sem,String yr) throws SQLException, ClassNotFoundException{
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
    
    /**Search teaching allocation by Department ID*/
    public static ArrayList<Time> searchTeachingAllocationByDepartmentID(String depid) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM teaching_allocation where depID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, depid);
        ResultSet rst = stm.executeQuery();
        ArrayList<Time>time=new ArrayList<Time>();
        while(rst.next()){
            Time t=new Time();
            t.setLecID(rst.getString("lecturerId"));
            t.setInsID(rst.getString("instructorID"));
            t.setLocID(rst.getString("locationID"));
            t.setSubID(rst.getString("subjectID"));
            t.setSem(rst.getString("semester"));
            t.setYr(rst.getString("year"));
            t.setDep(depid);
            time.add(t);
        }
        return time;
    }
    
    /**Search teaching allocation by only lecturer ID*/
    public static ArrayList<Time> searchTeachingAllocationByLecturerID(String lecid) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM teaching_allocation where lecturerID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecid);
        ResultSet rst = stm.executeQuery();
        ArrayList<Time>time=new ArrayList<Time>();
        while(rst.next()){
            Time t=new Time();
            t.setLecID(rst.getString("lecturerId"));
            t.setInsID(rst.getString("instructorID"));
            t.setLocID(rst.getString("locationID"));
            t.setSubID(rst.getString("subjectID"));
            t.setSem(rst.getString("semester"));
            t.setYr(rst.getString("year"));
            t.setDep(rst.getString("depID"));
            time.add(t);
        }
        return time;
    }
    
    
     /**Insert teaching allocation*/
     public static int insertTime(Time cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO teaching_allocation (subjectID,lecturerID,semester,year,locationID,instructorID,depID)VALUES (?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getSubID());
            stm.setObject(2, cs.getLecID());
            stm.setObject(3, cs.getSem());
            stm.setObject(4, cs.getYr());
            stm.setObject(5, cs.getLocID());
            stm.setObject(6, cs.getInsID());  
            stm.setObject(7, cs.getDep());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
    /**Update teaching allocation*/ 
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
    
    /**Delete teaching allocation*/
    public static int deleteTimeAllocation(Time t) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM teaching_allocation WHERE lecturerID=? AND semester=? AND year=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, t.getLecID());
            stm.setObject(2, t.getYr());
            stm.setObject(3, t.getSem());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            return 0;
        }
        
    }
}
