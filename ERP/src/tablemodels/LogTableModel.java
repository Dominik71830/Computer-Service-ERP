/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import classes.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dominik
 */
public class LogTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int ACTION_COL = 0;
    public static final int DATE_COL = 2;

    
    
    private String [] column_names = { 
                                        "Aktywność", 
                                        "Data"};
    private List<Log> logs;

    Function f;
    
    public LogTableModel(List<Log> logs){
        super();
        this.logs = logs;
        f = new Function();
    }
    
    @Override
    public int getRowCount() {
        return logs.size();
    }
    
    @Override
    public String getColumnName(int nr) {
		return column_names[nr];
	}
    
    
    @Override
    public int getColumnCount() {
        return column_names.length;
    }
    
    
    @Override
    public Object getValueAt(int row, int col) {
        Log temp = logs.get(row);
                
        switch (col) {
            case ACTION_COL:
                return temp.getAction();
                
            case DATE_COL:
                return temp.getDate();
                
            
            case OBJECT_COL:
		return temp;
                
            default:
                return temp.getId();
                
        }
    }
    
    
}
