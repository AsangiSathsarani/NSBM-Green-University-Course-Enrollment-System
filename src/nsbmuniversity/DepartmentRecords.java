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
public class DepartmentRecords extends AbstractTableModel{
    private static final String[] COLUMN_NAMES = {"Department Code" ,"Department Name"};
    private static ArrayList<SaveDepartmentDetails> lists;
    DepartmentRecords(ArrayList<SaveDepartmentDetails> dplist){
        lists = dplist;
    }
    
    @Override
    public int getRowCount() {
        return lists.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch(c){
                case 0:
                    return lists.get(r).getDepCode();
                case 1:
                    return lists.get(r).getDepName();
                
                default:
                    return "error";
        }
    }
}
