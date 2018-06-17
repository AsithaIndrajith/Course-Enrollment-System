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
public class Lecturer {
    private String lecturerID;
    private String lecturerName;
    private String lecturerPhone;
    private String lecturerAddress;
    private String lecturerNIC;
    private String lecturerPassword;
    private String depID;
    

    /**
     * @return the lecturerID
     */
    public String getLecturerID() {
        return lecturerID;
    }

    /**
     * @param lecturerID the lecturerID to set
     */
    public void setLecturerID(String lecturerID) {
        this.lecturerID = lecturerID;
    }

    /**
     * @return the lecturerName
     */
    public String getLecturerName() {
        return lecturerName;
    }

    /**
     * @param lecturerName the lecturerName to set
     */
    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    /**
     * @return the lecturerPhone
     */
    public String getLecturerPhone() {
        return lecturerPhone;
    }

    /**
     * @param lecturerPhone the lecturerPhone to set
     */
    public void setLecturerPhone(String lecturerPhone) {
        this.lecturerPhone = lecturerPhone;
    }

    /**
     * @return the lecturerNIC
     */
    public String getLecturerNIC() {
        return lecturerNIC;
    }

    /**
     * @param lecturerNIC the lecturerNIC to set
     */
    public void setLecturerNIC(String lecturerNIC) {
        this.lecturerNIC = lecturerNIC;
    }

    /**
     * @return the lecturerPassword
     */
    public String getLecturerPassword() {
        return lecturerPassword;
    }

    /**
     * @param lecturerPassword the lecturerPassword to set
     */
    public void setLecturerPassword(String lecturerPassword) {
        this.lecturerPassword = lecturerPassword;
    }

    public String getLecturerAddress() {
        return lecturerAddress;
    }

    public void setLecturerAddress(String lecturerAddress) {
        this.lecturerAddress = lecturerAddress;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }
    
    
    
}
