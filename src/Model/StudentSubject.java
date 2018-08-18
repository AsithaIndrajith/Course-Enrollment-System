/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Asitha
 */
public class StudentSubject {
    private String studentID;
    private String subjectID;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }
    public static String getTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");  
        LocalDateTime now = LocalDateTime.now();  
        return dtf.format(now);
    }
}
