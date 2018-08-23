/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmuniversity;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asangi
 */
public class CourseRecords extends AbstractTableModel{
   private static final String[] COLUMN_NAMES = {"Subject Id","Subject Name" ,"credit" ,"Department Name","Semester","Lecture Name" ,"Lab Number" ,"Course Fee"};
    private static ArrayList<SaveCourseDetails> listi;
    CourseRecords(ArrayList<SaveCourseDetails> czlist){
        listi = czlist;
    }
    
    @Override
    public int getRowCount() {
        return listi.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch(c){
                case 0:
                    return listi.get(r).getCozId();
                case 1:
                    return listi.get(r).getSubName();
                case 2:
                    return listi.get(r).getCredit();
                case 3:
                    return listi.get(r).getDepName();
                case 4:
                    return listi.get(r).getSemester();
                case 5:
                    return listi.get(r).getLecName();
                case 6:
                    return listi.get(r).getLabNo();
                case 7:
                    return listi.get(r).getCozFee();
                default:
                    return "error";
        }
    } 
}
