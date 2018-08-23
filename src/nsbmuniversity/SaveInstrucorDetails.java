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
public class SaveInstrucorDetails {

    /**
     * @return the instructId
     */
    public int getInstructId() {
        return instructId;
    }

    /**
     * @param instructId the instructId to set
     */
    public void setInstructId(int instructId) {
        this.instructId = instructId;
    }

    /**
     * @return the instructName
     */
    public String getInstructName() {
        return instructName;
    }

    /**
     * @param instructName the instructName to set
     */
    public void setInstructName(String instructName) {
        this.instructName = instructName;
    }

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
     * @return the name
     */
    private int instructId;
    private String instructName;
    private String address;
    private String email;
    private String telNo;
    private String depName;
}
