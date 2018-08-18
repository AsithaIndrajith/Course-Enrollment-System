/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database_Connection.DBConnection;
import Model.AssignmentGrades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */

/** Assignment results controlling class*/
public class AssignmentGradeController {
    
    /**Search assignment grades by assignment type and subject id and student id*/
    public static ArrayList<AssignmentGrades> searchAssignmentGradeByTypeAndSubjectAndStudentID(String type,String sub,String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From assignment_grades where studentID=? AND subjectID=? AND assignmentType=?";
            
            Connection conn = DBConnection.getDBConnection().getConnection();
            
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            stm.setObject(2, sub);
            stm.setObject(3, type);
            ResultSet rst = stm.executeQuery();
            
            ArrayList<AssignmentGrades> assignmentGradesesList=new ArrayList<AssignmentGrades>();
            
            while(rst.next()){
                AssignmentGrades asgnmnt=new AssignmentGrades();
                asgnmnt.setAsgnmtnID(rst.getString("id"));
                asgnmnt.setStudentID(id);
                asgnmnt.setSubjectID(sub);
                asgnmnt.setGrade(rst.getString("grade"));
                asgnmnt.setResult(rst.getString("result"));
                asgnmnt.setAssignmentType(rst.getString("assignmentType"));
                asgnmnt.setYear(rst.getString("year"));
                asgnmnt.setSemester(rst.getString("semester"));
                assignmentGradesesList.add(asgnmnt);
            }
            return assignmentGradesesList;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
    
    /**Search Assignment grades by student ID*/
    public static ArrayList<AssignmentGrades> searchAssignmentGradeByStudentID(String studid) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From assignment_grades where studentID=?";
            
            Connection conn = DBConnection.getDBConnection().getConnection();
            
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, studid);
            ResultSet rst = stm.executeQuery();
            
            ArrayList<AssignmentGrades> assignmentGradesesList=new ArrayList<AssignmentGrades>();
            
            while(rst.next()){
                AssignmentGrades asgnmnt=new AssignmentGrades();
                asgnmnt.setAsgnmtnID(rst.getString("id"));
                asgnmnt.setStudentID(studid);
                asgnmnt.setAsgnmtnID(rst.getString("id"));
                asgnmnt.setSubjectID(rst.getString("subjectID"));
                asgnmnt.setGrade(rst.getString("grade"));
                asgnmnt.setResult(rst.getString("result"));
                asgnmnt.setAssignmentType(rst.getString("assignmentType"));
                asgnmnt.setYear(rst.getString("year"));
                asgnmnt.setSemester(rst.getString("semester"));
                assignmentGradesesList.add(asgnmnt);
            }
            return assignmentGradesesList;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
    
    /**Search assignment grades assignment ID*/
    public static AssignmentGrades searchAssignmentGradeByAssignmentID(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From assignment_grades WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
                AssignmentGrades asgnmnt=new AssignmentGrades();
                asgnmnt.setAsgnmtnID(id);
                asgnmnt.setStudentID(rst.getString("studentID"));
                asgnmnt.setSubjectID(rst.getString("subjectID"));
                asgnmnt.setGrade(rst.getString("grade"));
                asgnmnt.setResult(rst.getString("result"));
                asgnmnt.setAssignmentType(rst.getString("assignmentType"));
                asgnmnt.setYear(rst.getString("year"));
                asgnmnt.setSemester(rst.getString("semester"));
                return asgnmnt;
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /** Insert assignment grades in to database*/
    public static int insertAssignmentGrades(AssignmentGrades asgmnt) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO assignment_grades (result,grade,id,studentID,subjectID,assignmentType)VALUES (?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, asgmnt.getResult());
            stm.setObject(2, asgmnt.getGrade());
            stm.setObject(3, asgmnt.getAsgnmtnID());
            stm.setObject(4, asgmnt.getStudentID());
            stm.setObject(5, asgmnt.getSubjectID());
            stm.setObject(6, asgmnt.getAssignmentType());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
    /**Update assignment grades*/
    public static int updateAssignmentGrades(AssignmentGrades asgmnt) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE assignment_grades SET result=?,grade=? where studentID=? AND subjectID=? AND assignmentType=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, asgmnt.getResult());
            stm.setObject(2, asgmnt.getGrade());
            stm.setObject(3, asgmnt.getStudentID());
            stm.setObject(4, asgmnt.getSubjectID());
            stm.setObject(5, asgmnt.getAssignmentType());
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
}
