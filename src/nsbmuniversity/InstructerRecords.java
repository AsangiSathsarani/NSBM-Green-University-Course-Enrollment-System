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
public class InstructerRecords extends AbstractTableModel{
    private static final String[] COLUMN_NAMES = {"Instructor Id" ,"Instructor Name" ,"Email" ,"Contact Number","Department Name"};
    private static ArrayList<SaveInstrucorDetails> list;
    InstructerRecords(ArrayList<SaveInstrucorDetails> inlist){
        list = inlist;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch(c){
                case 0:
                    return list.get(r).getInstructId();
                case 1:
                    return list.get(r).getInstructName();
                case 2:
                    return list.get(r).getEmail();
                case 3:
                    return list.get(r).getTelNo();
                case 4:
                    return list.get(r).getDepName();
                default:
                    return "error";
        }
    }
    
}
