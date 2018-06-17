/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asitha
 */
public class Instructor {
    private String instructorID;
    private String instructorName;
    private String instructorPhone;
    private String instructorAddress;
    private String instructorNIC;
    private String instructorPassword;
    private String depID;
    
    /**
     * @return the instructorID
     */
    public String getInstructorID() {
        return instructorID;
    }

    /**
     * @param instructorID the instructorID to set
     */
    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    /**
     * @return the instructorName
     */
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * @param instructorName the instructorName to set
     */
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    /**
     * @return the instructorPhone
     */
    public String getInstructorPhone() {
        return instructorPhone;
    }

    /**
     * @param instructorPhone the instructorPhone to set
     */
    public void setInstructorPhone(String instructorPhone) {
        this.instructorPhone = instructorPhone;
    }

    /**
     * @return the instructorNIC
     */
    public String getInstructorNIC() {
        return instructorNIC;
    }

    /**
     * @param instructorNIC the instructorNIC to set
     */
    public void setInstructorNIC(String instructorNIC) {
        this.instructorNIC = instructorNIC;
    }

    /**
     * @return the instructorPassword
     */
    public String getInstructorPassword() {
        return instructorPassword;
    }

    /**
     * @param instructorPassword the instructorPassword to set
     */
    public void setInstructorPassword(String instructorPassword) {
        this.instructorPassword = instructorPassword;
    }

    public String getInstructorAddress() {
        return instructorAddress;
    }

    public void setInstructorAddress(String instructorAddress) {
        this.instructorAddress = instructorAddress;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }
    
    
}
