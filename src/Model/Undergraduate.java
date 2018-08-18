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
public class Undergraduate {
    private String id;
    private String name;
    private String dob;
    private String nic;
    private String address;
    private String telephone;
    private String course;
    private String alResult;
    private String alIndex;
    private String alStream;
    private String password;
    private String semester;
    private String security;
    private String department;
    private String answer;
    private String year;
    private String depID;
    private String email;
    /**
     * @return the name
     */
    public Undergraduate(){
      
    }
    public Undergraduate(String name,String dob,String nic,String address,String telephone,String alIndex,String alResult,String alStream){
        this.setName(name);
        this.setAddress(address);
        this.setDob(dob);
        this.setNic(nic);
        this.setTelephone(telephone);
        this.setAlIndex(alIndex);
        this.setAlResult(alResult);
        this.setAlStream(alStream);
    }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the alResult
     */
    public String getAlResult() {
        return alResult;
    }

    /**
     * @param alResult the alResult to set
     */
    public void setAlResult(String alResult) {
        this.alResult = alResult;
    }

    /**
     * @return the alIndex
     */
    public String getAlIndex() {
        return alIndex;
    }

    /**
     * @param alIndex the alIndex to set
     */
    public void setAlIndex(String alIndex) {
        this.alIndex = alIndex;
    }

    /**
     * @return the alStream
     */
    public String getAlStream() {
        return alStream;
    }

    /**
     * @param alStream the alStream to set
     */
    public void setAlStream(String alStream) {
        this.alStream = alStream;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the security
     */
    public String getSecurity() {
        return security;
    }

    /**
     * @param security the security to set
     */
    public void setSecurity(String security) {
        this.security = security;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
