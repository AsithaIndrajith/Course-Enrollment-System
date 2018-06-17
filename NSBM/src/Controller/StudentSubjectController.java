/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.StudentSubject;
import Model.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */
public class StudentSubjectController {
    public static  ArrayList<StudentSubject> searchStudentSubject(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From student_subject where studentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            ArrayList<StudentSubject>studSub=new ArrayList<>();
            while(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                StudentSubject cs=new StudentSubject();
                cs.setStudentID(id);
                cs.setSubjectID(rst.getString("subjectID"));
                studSub.add(cs);
            }  
            return studSub;
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static  ArrayList<StudentSubject> searchStudentSubjectAll(String yr) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select student_subject.studentID From student_subject,subject where subject.subjectYear=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, yr);
            ResultSet rst = stm.executeQuery();
            ArrayList<StudentSubject>studSub=new ArrayList<>();
            while(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                StudentSubject cs=new StudentSubject();
                cs.setStudentID(rst.getString("studentID"));
                studSub.add(cs);
                
            }
            return studSub;
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static int insertStudentSubject(StudentSubject cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO student_subject (studentID,subjectID)VALUES (?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getStudentID());
            stm.setObject(2, cs.getSubjectID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int updateStudentSubject(StudentSubject cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE student_subject SET studentID=?,subjectID=? WHERE studentID=? AND subjectID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getStudentID());
            stm.setObject(2, cs.getSubjectID());
            stm.setObject(3, cs.getStudentID());
            stm.setObject(4, cs.getSubjectID());
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     
     
      public static int deleteStudentSubject(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM student_subject WHERE studentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
}
