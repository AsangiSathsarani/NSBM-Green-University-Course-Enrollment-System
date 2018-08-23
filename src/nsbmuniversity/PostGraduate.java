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
public class PostGraduate {

    /**
     * @return the colification
     */
    public String getColification() {
        return colification;
    }

    /**
     * @param colification the colification to set
     */
    public void setColification(String colification) {
        this.colification = colification;
    }

    /**
     * @return the gpa
     */
    public String getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the degreeName
     */
    public String getDegreeName() {
        return degreeName;
    }

    /**
     * @param degreeName the degreeName to set
     */
    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    /**
     * @return the instituteName
     */
    public String getInstituteName() {
        return instituteName;
    }

    /**
     * @param instituteName the instituteName to set
     */
    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    /**
     * @return the regId
     */
    public int getRegId() {
        return regId;
    }

    /**
     * @param regId the regId to set
     */
    public void setRegId(int regId) {
        this.regId = regId;
    }
    private int regId;
    private String instituteName;
    private String degreeName;
    private int year;
    private String gpa;
    private String colification;
}
