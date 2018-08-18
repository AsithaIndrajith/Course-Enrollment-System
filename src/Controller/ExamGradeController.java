/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database_Connection.DBConnection;
import Model.ExamGrades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */

/**Examination results controller class*/
public class ExamGradeController {
    
    /**Search examination results by student and subject id*/
    public static ExamGrades searchExamGradeByStudentIDAndSubjectID(String id,String sub) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From exam_grades where studentID=? AND subjectID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            stm.setObject(2, sub);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
                ExamGrades asgnmnt=new ExamGrades();
                asgnmnt.setGrade(rst.getString("grade"));
                asgnmnt.setResult(rst.getString("result"));
                asgnmnt.setCredits(rst.getString("credits"));
                asgnmnt.setSemester(rst.getString("semester"));
                asgnmnt.setYear(rst.getString("year"));
                return asgnmnt;
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return null;
    }
    
    /**Search examination results by subject ID*/
    public static ArrayList<ExamGrades> searchExamGradeBySubjectID(String sub) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From exam_grades where subjectID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, sub);
            ResultSet rst = stm.executeQuery();
            ArrayList<ExamGrades> e=new ArrayList<>();
            while(rst.next()){
                ExamGrades asgnmnt=new ExamGrades();
                asgnmnt.setStudentID(rst.getString("studentID"));
                asgnmnt.setGrade(rst.getString("grade"));
                asgnmnt.setResult(rst.getString("result"));
                asgnmnt.setCredits(rst.getString("credits"));
                asgnmnt.setSemester(rst.getString("semester"));
                asgnmnt.setYear(rst.getString("year"));
                asgnmnt.setSubjectID(sub);
                e.add(asgnmnt);
            }
            return e;
        }catch(Exception e){
            System.out.println(e);
        }
        
        return null;
    }
    
    /**Search examination results by student ID*/
     public static ArrayList<ExamGrades> searchExamGradeByStudentID(String student) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From exam_grades where studentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, student);
            ResultSet rst = stm.executeQuery();
            ArrayList<ExamGrades> e=new ArrayList<>();
            while(rst.next()){
                ExamGrades asgnmnt=new ExamGrades();
                asgnmnt.setStudentID(rst.getString("studentID"));
                asgnmnt.setGrade(rst.getString("grade"));
                asgnmnt.setResult(rst.getString("result"));
                asgnmnt.setCredits(rst.getString("credits"));
                asgnmnt.setSemester(rst.getString("semester"));
                asgnmnt.setYear(rst.getString("year"));
                asgnmnt.setSubjectID(rst.getString("subjectID"));
                e.add(asgnmnt);
            }
            return e;
        }catch(Exception e){
            System.out.println(e);
        }
        
        return null;
    }
     
     /**Search examination results by student ID and year and semester*/
     public static ArrayList<ExamGrades> searchExamGradesOfStudentByYearAndSemester(String student,String year,String sem) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From exam_grades where studentID=? AND semester=? AND year=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, student);
            stm.setObject(2, sem);
            stm.setObject(3, year);
            ResultSet rst = stm.executeQuery();
            ArrayList<ExamGrades> e=new ArrayList<>();
            while(rst.next()){
                ExamGrades asgnmnt=new ExamGrades();
                asgnmnt.setStudentID(rst.getString("studentID"));
                asgnmnt.setGrade(rst.getString("grade"));
                asgnmnt.setResult(rst.getString("result"));
                asgnmnt.setCredits(rst.getString("credits"));
                asgnmnt.setSemester(rst.getString("semester"));
                asgnmnt.setYear(rst.getString("year"));
                asgnmnt.setSubjectID(rst.getString("subjectID"));
                e.add(asgnmnt);
            }
            return e;
        }catch(Exception e){
            System.out.println(e);
        }
        
        return null;
    }
    
     /**Insert examination results*/
    public static int insertGrade(ExamGrades asgmnt) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO exam_grades (studentID,subjectID,result,grade,semester,year,credits)VALUES (?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, asgmnt.getStudentID());
            stm.setObject(2, asgmnt.getSubjectID());
            stm.setObject(3, asgmnt.getResult());
            stm.setObject(4, asgmnt.getGrade());
            stm.setObject(5, asgmnt.getSemester());
            stm.setObject(6, asgmnt.getYear());
            stm.setObject(7, asgmnt.getCredits());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
     /**Update examination results*/
     public static int updateGrades(ExamGrades asgmnt) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE exam_grades SET result=?,grade=?,semester=?,year=?,credits=? where studentID=? AND subjectID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, asgmnt.getResult());
            stm.setObject(2, asgmnt.getGrade());
            stm.setObject(3, asgmnt.getSemester());
            stm.setObject(4, asgmnt.getYear());
            stm.setObject(5, asgmnt.getCredits());
            stm.setObject(6, asgmnt.getStudentID());
            stm.setObject(7, asgmnt.getSubjectID());
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
}
