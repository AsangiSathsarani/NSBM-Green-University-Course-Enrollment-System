/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmuniversity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Asangi
 */
public class DBOperation {
    String url = "jdbc:mysql://localhost:3306/nsbmuniversity";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    
    
    
    public boolean RegStudentpart1(RegisterDetails rs) {
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO registerdetailspart1 VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, rs.getRegId());
        pst.setString(2, rs.getName());
        pst.setString(3, rs.getFullName());
        pst.setString(4, rs.getpAddress());
        pst.setString(5, rs.gettAddress());
        pst.setString(6 , rs.getNIC());
        pst.setString(7, rs.getDOB());
        pst.setString(8, rs.getGender());
        pst.setString(9, rs.getTelNo());
        pst.setString(10, rs.getEmail());
        pst.setString(11, rs.getReligion());
        pst.setInt(12, rs.getAge());
        pst.setString(13, rs.getCivilStatus());
        pst.executeUpdate();
        return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }
public boolean RegStudentpart2(RegisterDetailsPart2 rs2) {/*Undergraduate student's A/L result insert query and method*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO registerdetailspart2 VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, rs2.getRegId());
        pst.setInt(2, rs2.getAlIndexNo());
        pst.setInt(3, rs2.getYear());
        pst.setString(4, rs2.getSchool());
        pst.setString(5, rs2.getDistrict());
        pst.setInt(6, rs2.getiRank());
        pst.setInt(7 , rs2.getdRank());
        pst.setString(8, rs2.getSub1());
        pst.setString(9, rs2.getGrade1());
        pst.setString(10, rs2.getSub2());
        pst.setString(11, rs2.getGrade2());
        pst.setString(12, rs2.getSub3());
        pst.setString(13, rs2.getGrade3());
        pst.setString(14, rs2.getMedium());
        pst.setString(15, rs2.getZcore());
        pst.setInt(16, rs2.getAttempt());
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }    
public boolean ExamResult(ExameResultDetails erd) {/*Assigmnet result for each student insert and method*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO examresult VALUES(?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, erd.getRegId());
        pst.setString(2, erd.getName());
        pst.setString(3, erd.getDepName());
        pst.setString(4, erd.getCozId());
        pst.setString(5, erd.getGradeofLec());
        pst.setString(6 , erd.getGradeofReport());
        pst.setString(7, erd.getGradeofExam());
        pst.setString(8, erd.getGrafeofPracticalAss());
        pst.setString(9, erd.getGradeofProject());
        pst.setString(10, erd.getGradeofPracticalExam());
        
        
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }   
public boolean courseDetails(SaveCourseDetails cd) {/*Ecah subject insert query and method*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO coursedetails VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, cd.getCozId());
        pst.setString(2, cd.getSubName());
        pst.setInt(3, cd.getCredit());
        pst.setString(4, cd.getDescription());
        pst.setString(5, cd.getDepName());
        pst.setInt(6 , cd.getSemester());
        pst.setString(7, cd.getLecName());
        pst.setString(8, cd.getInstructName());
        pst.setString(9, cd.getLabNo());
        pst.setString(10, cd.getLabInsructName());
        pst.setString(11, cd.getsTime());
        pst.setString(12, cd.getfTime());
        pst.setString(13, cd.getCozFee());
        pst.executeUpdate();
        
        pst.executeUpdate();
        return true;
        }catch(Exception e){
          System.out.println(e);
          return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }   
ArrayList<SaveCourseDetails> getCourse() {/*course details can view using table .this method is for data set to the table */
          ArrayList<SaveCourseDetails> listi =new ArrayList<SaveCourseDetails>();
            try{
            
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT coursedetails.cozId , coursedetails.subName , coursedetails.credit ,coursedetails.depName ,coursedetails.semester ,coursedetails.lecName ,coursedetails.labNo ,coursedetails.cozFee FROM coursedetails";
            pst = (PreparedStatement) con.prepareStatement(query); 
            res = pst.executeQuery();
            
            while(res.next()){
                SaveCourseDetails scd = new SaveCourseDetails();
                scd.setCozId(res.getString(1));
                scd.setSubName(res.getString(2));
                scd.setCredit(res.getInt(3));
                scd.setDepName(res.getString(4));
                scd.setSemester(res.getInt(5));
                scd.setLecName(res.getString(6));
                scd.setLabNo(res.getString(7));
                scd.setCozFee(res.getString(8));
                listi.add(scd);
            
            }
            
            
            
        }catch(Exception e){
          System.out.println(e);
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        return listi;
        
    }
public boolean departmentDetails(SaveDepartmentDetails dd) {/*Ecah faculty add */
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO departmentdetails VALUES(?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, dd.getDepCode());
        pst.setString(2, dd.getDepName());
       
        
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }


ArrayList<SaveDepartmentDetails> getDepartment() {
    ArrayList<SaveDepartmentDetails> lists =new ArrayList<SaveDepartmentDetails>();
            try{
            
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT departmentdetails.depCode , departmentdetails.depName  FROM departmentdetails";
            pst = (PreparedStatement) con.prepareStatement(query); 
            res = pst.executeQuery();
            
            while(res.next()){
                SaveDepartmentDetails sdd = new SaveDepartmentDetails();
                sdd.setDepCode(res.getString(1));
                sdd.setDepName(res.getString(2));
                
                lists.add(sdd);
            
            }
            
            
            
        }catch(SQLException e){
          
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        return lists ;
        
        
    }
public boolean instructorDetails(SaveInstrucorDetails id) {
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO instructordetails VALUES(?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, id.getInstructId());
        pst.setString(2, id.getInstructName());
        pst.setString(3, id.getAddress());
        pst.setString(4, id.getEmail());
        pst.setString(5, id.getTelNo());
        pst.setString(6, id.getDepName());
       
        
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
  
    } 
      
      ArrayList<SaveInstrucorDetails> getInsructor() {
          ArrayList<SaveInstrucorDetails> list =new ArrayList<SaveInstrucorDetails>();
            try{
            
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT instructordetails.instructId , instructordetails.instructName , instructordetails.email ,instructordetails.telNo ,instructordetails.depName FROM instructordetails";
            pst = (PreparedStatement) con.prepareStatement(query); 
            res = pst.executeQuery();
            
            while(res.next()){
                SaveInstrucorDetails sid = new SaveInstrucorDetails();
                sid.setInstructId(res.getInt(1));
                sid.setInstructName(res.getString(2));
                sid.setEmail(res.getString(3));
                sid.setTelNo(res.getString(4));
                sid.setDepName(res.getString(5));
                list.add(sid);
            
            }
            
            
            
        }catch(SQLException e){
          
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        return list;
        
    }
public boolean lectureDetails(SaveLectureDetails ld) {
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO lecturedetails VALUES(?,?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, ld.getLecId());
        pst.setString(2, ld.getLecName());
        pst.setString(3, ld.getAddress());
        pst.setString(4, ld.getEmail());
        pst.setString(5, ld.getTelNo());
        pst.setString(6, ld.getDesignation());
        pst.setString(7, ld.getDepName());
       
        
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    } 

ArrayList<SaveLectureDetails> getLecture() {
    ArrayList<SaveLectureDetails> listt =new ArrayList<SaveLectureDetails>();
            try{
            
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT lecturedetails.lecId , lecturedetails.lecName , lecturedetails.email ,lecturedetails.telNo ,lecturedetails.depName FROM lecturedetails";
            pst = (PreparedStatement) con.prepareStatement(query); 
            res = pst.executeQuery();
            
            while(res.next()){
                SaveLectureDetails sld = new SaveLectureDetails();
                sld.setLecId(res.getInt(1));
                sld.setLecName(res.getString(2));
                sld.setEmail(res.getString(3));
                sld.setTelNo(res.getString(4));
                sld.setDepName(res.getString(5));
                listt.add(sld);
            
            }
            
            
            
        }catch(SQLException e){
          
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        return listt ;
        
        
    }
public boolean EnrolledCourse(EnrolledCourseDetails ecd) {/*postgraduate student are enrolled course on february registration student*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        
        String query = "INSERT INTO enrolledcourse VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        pst = (PreparedStatement) con.prepareStatement(query);
        
        pst.setInt(1, ecd.getRegId());
        pst.setString(2, ecd.getName());
        pst.setString(3, ecd.getDepName());
        pst.setString(4, ecd.getYearOfReg());
        pst.setString(5, ecd.getSemOneSubOne());
        pst.setInt(6, ecd.getCourseOneFee());
        pst.setString(7 , ecd.getSemOneSubTwo());
        pst.setInt(8, ecd.getCourseTwoFee());
        pst.setString(9, ecd.getSemOneSubThree());
        pst.setInt(10, ecd.getCourseThreeFee());
        pst.setString(11, ecd.getSemOneSubFour());
        pst.setInt(12, ecd.getCourseFourFee());
        pst.setString(13, ecd.getSemTwoSubOne());
        pst.setInt(14, ecd.getCourseFiveFee());
        pst.setString(15, ecd.getSemTwoSubTwo());
        pst.setInt(16, ecd.getCourseSixFee());
        pst.setString(17, ecd.getSemTwoSubThree());
        pst.setInt(18, ecd.getCourseSevenFee());
        pst.setString(19, ecd.getSemTwoSubFour());
        pst.setInt(20, ecd.getCourseEghitFee());
        pst.executeUpdate();
        return true;
        }catch(Exception e){
          System.out.println(e);
          return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }

public boolean examresultenter(Result rs) {/*Each student ecah subject mask add*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        
        String query = "INSERT INTO examresultsheet VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        pst = (PreparedStatement) con.prepareStatement(query);
        
        pst.setInt(1, rs.getRegId());
        pst.setString(2, rs.getName());
        pst.setString(3, rs.getSubone());
        pst.setString(4, rs.getResultone());
        pst.setString(5, rs.getSubtwo());
        pst.setString(6, rs.getResulttwo());
        pst.setString(7, rs.getSubthree());
        pst.setString(8, rs.getResultthree());
        pst.setString(9, rs.getSemOneSubOne());
        pst.setString(10, rs.getResultfour());
        pst.setString(11 , rs.getSemOneSubTwo());
        pst.setString(12, rs.getResultfive());
        pst.setString(13, rs.getSemOneSubThree());
        pst.setString(14, rs.getResultsix());
        pst.setString(15, rs.getSemOneSubFour());
        pst.setString(16, rs.getResultseven());
        pst.setString(17, rs.getSemTwoSubOne());
        pst.setString(18, rs.getResultegiht());
        pst.setString(19, rs.getSemTwoSubTwo());
        pst.setString(20, rs.getResultnine());
        pst.setString(21, rs.getSemTwoSubThree());
        pst.setString(22, rs.getResultten());
        pst.setString(23, rs.getSemTwoSubFour());
        pst.setString(24, rs.getResulteleven());
        pst.executeUpdate();
        return true;
        }catch(Exception e){
          System.out.println(e);
          return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }
public boolean EnrolledCourse2(EnrolledCourseDetails2 ecd2) {/*postgraduate student enrolled course subject in july*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO enrolledcourse2 VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, ecd2.getRegId());
        pst.setString(2, ecd2.getName());
        pst.setString(3, ecd2.getDepName());
        pst.setString(4, ecd2.getYearOfReg());
        pst.setString(5, ecd2.getSemTwoSubOne());
        pst.setInt(6, ecd2.getCourseFiveFee());
        pst.setString(7, ecd2.getSemTwoSubTwo());
        pst.setInt(8, ecd2.getCourseSixFee());
        pst.setString(9, ecd2.getSemTwoSubThree());
        pst.setInt(10, ecd2.getCourseSevenFee());
        pst.setString(11, ecd2.getSemTwoSubFour());
        pst.setInt(12, ecd2.getCourseEghitFee());
        pst.executeUpdate();
        
        
          System.out.println("X");
        return true;
        }catch(Exception e){
          System.out.println(e);
          return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }

 public boolean postgraduatedetails(PostGraduate pg) {/*postgraduate student details*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO postgraduatedetails VALUES(?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, pg.getRegId());
        pst.setString(2, pg.getInstituteName());
        pst.setString(3, pg.getDegreeName());
        pst.setInt(4, pg.getYear());
        pst.setString(5, pg.getGpa());
        pst.setString(6, pg.getColification());
       
       
        
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    } 

public boolean deleteLecture(SaveLectureDetails sld){
    try{
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "DELETE FROM lecturedetails  WHERE lecId='"+sld.getLecId()+"'";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false; 
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
    }
public boolean deleteInstructor(SaveInstrucorDetails sid){
    try{
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "DELETE FROM instructordetails  WHERE lecId='"+sid.getInstructId()+"'";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false; 
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
    }
public boolean deleteCourse(SaveCourseDetails scd){
    try{
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "DELETE FROM coursedetails  WHERE lecId='"+scd.getCozId()+"'";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.executeUpdate();
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false; 
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
    }

public boolean UndergraduateEnrolledCourse(UndergraduateEnrolledCourseDetails uecd) {/*undergraduta student enrolled course in february*/
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        
        String query = "INSERT INTO undergraduateenrolledcourse VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        pst = (PreparedStatement) con.prepareStatement(query);
        
        pst.setInt(1, uecd.getRegId());
        pst.setString(2, uecd.getName());
        pst.setString(3, uecd.getDepName());
        pst.setString(4, uecd.getYearOfReg());
        pst.setString(5, uecd.getSemOneSubOne());
        pst.setInt(6, uecd.getCourseOneFee());
        pst.setString(7 , uecd.getSemOneSubTwo());
        pst.setInt(8, uecd.getCourseTwoFee());
        pst.setString(9, uecd.getSemOneSubThree());
        pst.setInt(10, uecd.getCourseThreeFee());
        pst.setString(11, uecd.getSemOneSubFour());
        pst.setInt(12, uecd.getCourseFourFee());
        pst.setString(13, uecd.getSemTwoSubOne());
        pst.setInt(14, uecd.getCourseFiveFee());
        pst.setString(15, uecd.getSemTwoSubTwo());
        pst.setInt(16, uecd.getCourseSixFee());
        pst.setString(17, uecd.getSemTwoSubThree());
        pst.setInt(18, uecd.getCourseSevenFee());
        pst.setString(19, uecd.getSemTwoSubFour());
        pst.setInt(20, uecd.getCourseEghitFee());
        pst.executeUpdate();
        return true;
        }catch(Exception e){
          System.out.println(e);
          return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }
public boolean UndergraduateEnrolledCourse2(UndergraduateEnrolledCourse2Details uecd2) {/*undergraduate student enrolled subject in july*/
    
        try{
            
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO undergraduateenrolledcourse2 VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, uecd2.getRegId());
        pst.setString(2, uecd2.getName());
        pst.setString(3, uecd2.getDepName());
        pst.setString(4, uecd2.getYearOfReg());
        pst.setString(5, uecd2.getSemTwoSubOne());
        pst.setInt(6, uecd2.getCourseFiveFee());
        pst.setString(7, uecd2.getSemTwoSubTwo());
        pst.setInt(8, uecd2.getCourseSixFee());
        pst.setString(9, uecd2.getSemTwoSubThree());
        pst.setInt(10, uecd2.getCourseSevenFee());
        pst.setString(11, uecd2.getSemTwoSubFour());
        pst.setInt(12, uecd2.getCourseEghitFee());
        pst.executeUpdate();
        
        
          return true;
        }catch(Exception e){
          System.out.println(e);
          return false;
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
            
            }
            catch(SQLException e){
            
            }
        
        }
        
            
        
    }
}

