/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmuniversity;

/**
 *
 * @author Asangi
 */
public class SaveLectureDetails {

    /**
     * @return the lecId
     */
    public int getLecId() {
        return lecId;
    }

    /**
     * @param lecId the lecId to set
     */
    public void setLecId(int lecId) {
        this.lecId = lecId;
    }

    /**
     * @return the lecId
     */
    

    /**
     * @return the depName
     */
    public String getDepName() {
        return depName;
    }

    /**
     * @param depName the depName to set
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the lecName
     */
    public String getLecName() {
        return lecName;
    }

    /**
     * @param lecName the lecName to set
     */
    public void setLecName(String lecName) {
        this.lecName = lecName;
    }
    private int lecId;
    private String lecName;
    private String address;
    private String email;
    private String telNo;
    private String designation;
    private String depName;
}
