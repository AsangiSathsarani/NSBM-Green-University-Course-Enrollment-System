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
public class LectureRecords extends AbstractTableModel {
    private static final String[] COLUMN_NAMES = {"Lecture Id" ,"Lecture Name" ,"Email" ,"Contact Number","Department Name"};
    private static ArrayList<SaveLectureDetails> listt;
    LectureRecords(ArrayList<SaveLectureDetails> lelist){
        listt = lelist;
    }
    
    @Override
    public int getRowCount() {
        return listt.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch(c){
                case 0:
                    return listt.get(r).getLecId();
                case 1:
                    return listt.get(r).getLecName();
                case 2:
                    return listt.get(r).getEmail();
                case 3:
                    return listt.get(r).getTelNo();
                case 4:
                    return listt.get(r).getDepName();
                default:
                    return "error";
        }
    }
}
