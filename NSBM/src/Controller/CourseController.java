/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.Course;
import Model.Undergraduate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */
public class CourseController {
    public static Course searchCourse(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From courses where courseID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                Course cs=new Course();
                cs.setName(rst.getString("courseName"));
                cs.setDegreeID(rst.getString("degreeID"));
                cs.setDepartmentID(rst.getString("departmentID"));
                cs.setType(rst.getString("type"));
                
                
                return cs;
            }else{
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static ArrayList<Course> searchCourseID(String depid,String degid) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From courses where departmentID=? AND degreeID=? ";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, depid);
            stm.setObject(2, degid);
            ResultSet rst = stm.executeQuery();
            ArrayList<Course>ls=new ArrayList<Course>();
            while(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                Course cs=new Course();
                cs.setName(rst.getString("courseName"));
                cs.setDegreeID(rst.getString("degreeID"));
                cs.setDepartmentID(rst.getString("departmentID"));
                cs.setType(rst.getString("type"));
                ls.add(cs);
            }
            return ls;
        }catch(Exception e){
            System.out.println(e);
        }
     return null;   
    }
    
    public static ArrayList<Course> searchCourses(String depid) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From courses where departmentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, depid);
            ResultSet rst = stm.executeQuery();
            ArrayList<Course>ls=new ArrayList<Course>();
            while(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                Course cs=new Course();
                cs.setCourseID(rst.getString("courseID"));
                cs.setName(rst.getString("courseName"));
                cs.setDegreeID(rst.getString("degreeID"));
                cs.setType(rst.getString("type"));
                ls.add(cs);
            }
            return ls;
        }catch(Exception e){
            System.out.println(e);
        }
     return null;   
    }
    
    public static ArrayList<Course> searchCourseIDD(String depid,String degid) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From courses where departmentID=? AND type LIKE ? ";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, depid);
            stm.setObject(2, degid);
            ResultSet rst = stm.executeQuery();
            ArrayList<Course>ls=new ArrayList<Course>();
            while(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                Course cs=new Course();
                cs.setName(rst.getString("courseName"));
                cs.setDegreeID(rst.getString("degreeID"));
                cs.setDepartmentID(rst.getString("departmentID"));
                cs.setType(rst.getString("type"));
                ls.add(cs);
            }
            return ls;
        }catch(Exception e){
            System.out.println(e);
        }
     return null;   
    }
    
    public static String searchCourseName(String name) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From courses where courseName=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, name);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
                return rst.getString("courseID");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
     return null;   
    }
    
    public static int insertCourse(Course cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO courses (courseID,courseName,departmentID,degreeID,type)VALUES (?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getCourseID());
            stm.setObject(2, cs.getName());
            stm.setObject(3, cs.getDepartmentID());
            stm.setObject(4, cs.getDegreeID());
            stm.setObject(5, cs.getType());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int updateCourse(Course cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE courses SET courseName=?,departmentID=?, degreeID=?,type=? WHERE courseID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, cs.getName());
            stm.setObject(2, cs.getDepartmentID());
            stm.setObject(3, cs.getDegreeID());
            stm.setObject(4, cs.getCourseID());
            stm.setObject(5, cs.getType());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int deleteCourse(Course cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM courses WHERE courseID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getCourseID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
       
}
