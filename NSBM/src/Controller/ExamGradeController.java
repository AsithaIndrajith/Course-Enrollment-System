/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
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
public class ExamGradeController {
    public static ExamGrades searchExamGrade(String id,String sub) throws SQLException, ClassNotFoundException{
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
    
    public static ArrayList<ExamGrades> searchExamGradeSub(String sub) throws SQLException, ClassNotFoundException{
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
