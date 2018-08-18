/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database_Connection.DBConnection;
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

/**Subject controller class*/
public class SubjectController {
    
    /**Search 4 subjects by course id, semester and year */
    public static ArrayList<Subject> search4SubjectsByCourseIDAndYearAndSemester(String id,String yr,String sem) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From subject where subject.courseID=? AND subject.subjectSemester=? AND subject.subjectYear=? ORDER BY subject.subjectID LIMIT 4";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            stm.setObject(2, sem);
            stm.setObject(3, yr);
            ResultSet rst = stm.executeQuery();
            ArrayList<Subject>sub=new ArrayList<>();
            while(rst.next()){
                Subject cs=new Subject();
                cs.setSubjectName(rst.getString("subjectName"));
                cs.setSubjectID(rst.getString("subjectID"));
                cs.setSubjectSemester(rst.getString("subjectSemester"));
                cs.setSubjectYear(rst.getString("subjectYear"));
                cs.setCredits(rst.getString("credits"));
                cs.setCourseID(rst.getString("courseID"));
                cs.setLecturerID(rst.getString("lecturerID"));
                cs.setPrice(rst.getString("price"));
                sub.add(cs);
                
            }
            return sub;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Search another 4 subjects by course id, semester and year */
    public static ArrayList<Subject> searchOther4SubjectsByCourseIDAndYearAndSemester(String id,String yr,String sem) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From subject where subject.courseID=? AND subject.subjectSemester=? AND subject.subjectYear=? ORDER BY subject.subjectID DESC LIMIT 4";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            stm.setObject(2, sem);
            stm.setObject(3, yr);
            ResultSet rst = stm.executeQuery();
            ArrayList<Subject>sub=new ArrayList<>();
            while(rst.next()){
                Subject cs=new Subject();
                cs.setSubjectName(rst.getString("subjectName"));
                cs.setSubjectID(rst.getString("subjectID"));
                cs.setSubjectSemester(rst.getString("subjectSemester"));
                cs.setSubjectYear(rst.getString("subjectYear"));
                cs.setCredits(rst.getString("credits"));
                cs.setCourseID(rst.getString("courseID"));
                cs.setLecturerID(rst.getString("lecturerID"));
                cs.setPrice(rst.getString("price"));
                sub.add(cs);
                
            }
            return sub;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Search subject by subject ID*/
    public static Subject searchSubjectBySubjectID(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From subject where subjectID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
                Subject cs=new Subject();
                cs.setSubjectName(rst.getString("subjectName"));
                cs.setSubjectID(rst.getString("subjectID"));
                cs.setSubjectSemester(rst.getString("subjectSemester"));
                cs.setSubjectYear(rst.getString("subjectYear"));
                cs.setCredits(rst.getString("credits"));
                cs.setCourseID(rst.getString("courseID"));
                cs.setLecturerID(rst.getString("lecturerID"));
                cs.setPrice(rst.getString("price"));
                return cs;
            }
            else{
                return null;
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Search subjects by department id, semester and year and student Type */
    public static ArrayList<Subject> searchSubjectBySemesterAndYearAndDepartmentIDAndType(String year,String sem,String dep,String type) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select subject.* From subject,courses where subject.subjectYear=? AND subject.subjectSemester=? AND subject.departmentID=? AND courses.type=? AND subject.courseID=courses.courseID";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, year);
            stm.setObject(2, sem);
            stm.setObject(3, dep);
            stm.setObject(4, type);
            ResultSet rst = stm.executeQuery();
            ArrayList<Subject>ls=new ArrayList<>();
            while(rst.next()){
                Subject cs=new Subject();
                cs.setSubjectName(rst.getString("subjectName"));
                cs.setSubjectID(rst.getString("subjectID"));
                cs.setSubjectSemester(rst.getString("subjectSemester"));
                cs.setSubjectYear(rst.getString("subjectYear"));
                cs.setCredits(rst.getString("credits"));
                cs.setCourseID(rst.getString("courseID"));
                cs.setLecturerID(rst.getString("lecturerID"));
                cs.setPrice(rst.getString("price"));
                ls.add(cs);
            }
            return ls;
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Search subjects by department id, semester and year  */
    public static ArrayList<Subject> searchSubjectBySemesterAndYearAndDepartmentID(String year,String sem,String dep) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select subject.* From subject where subject.subjectYear=? AND subject.subjectSemester=? AND subject.departmentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, year);
            stm.setObject(2, sem);
            stm.setObject(3, dep);
            ResultSet rst = stm.executeQuery();
            ArrayList<Subject>ls=new ArrayList<>();
            while(rst.next()){
                Subject cs=new Subject();
                cs.setSubjectName(rst.getString("subjectName"));
                cs.setSubjectID(rst.getString("subjectID"));
                cs.setSubjectSemester(rst.getString("subjectSemester"));
                cs.setSubjectYear(rst.getString("subjectYear"));
                cs.setCredits(rst.getString("credits"));
                cs.setCourseID(rst.getString("courseID"));
                cs.setLecturerID(rst.getString("lecturerID"));
                cs.setPrice(rst.getString("price"));
                ls.add(cs);
            }
            return ls;
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Search subjects by department id*/
    public static ArrayList<Subject> searchSubjectByDepartmentID(String dep) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select subject.*,courses.type From subject,courses where subject.departmentID=? AND subject.courseID=courses.courseID";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, dep);
            ResultSet rst = stm.executeQuery();
            ArrayList<Subject>ls=new ArrayList<>();
            while(rst.next()){
                Subject cs=new Subject();
                cs.setSubjectName(rst.getString("subjectName"));
                cs.setSubjectID(rst.getString("subjectID"));
                cs.setSubjectSemester(rst.getString("subjectSemester"));
                cs.setSubjectYear(rst.getString("subjectYear"));
                cs.setCredits(rst.getString("credits"));
                cs.setCourseID(rst.getString("courseID"));
                cs.setLecturerID(rst.getString("lecturerID"));
                cs.setPrice(rst.getString("price"));
                cs.setType(rst.getString("type"));
                ls.add(cs);
            }
            return ls;
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Insert Subjects*/
    public static int insertSubject(Subject cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO subject (subjectID,subjectName,subjectSemester,subjectYear,credits,price,courseID,lecturerID,departmentID)VALUES (?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getSubjectID());
            stm.setObject(2, cs.getSubjectName());
            stm.setObject(3, cs.getSubjectSemester());
            stm.setObject(4, cs.getSubjectYear());
            stm.setObject(5, cs.getCredits());
            stm.setObject(6, cs.getPrice());
            stm.setObject(7, cs.getCourseID());
            stm.setObject(8, cs.getLecturerID());
            stm.setObject(9, cs.getDepID());
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
     /**Update Subjects*/
     public static int updateSubject(Subject cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE subject SET subjectName=?,subjectSemester=?,subjectYear=?,credits=?, price=? WHERE subjectID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getSubjectName());
            stm.setObject(2, cs.getSubjectSemester());
            stm.setObject(3, cs.getSubjectYear());
            stm.setObject(4, cs.getCredits());
            stm.setObject(5, cs.getPrice());
            stm.setObject(6, cs.getSubjectID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     
      /**Delete Subjects*/
     public static int deleteSubject(Subject cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM subject WHERE subjectID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getSubjectID());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
}
