/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import classes.*;
import classes.Function;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Dominik
 */
public class RepairTableModel extends AbstractTableModel{
    
    
    public static final int OBJECT_COL = -1;
    public static final int SENDER_COL = 0;
    public static final int CLIENT_COL = 1;
    public static final int DESC_COL = 2;
    public static final int DATE_COL = 3;
    public static final int EXECUTED_COL = 4;
    
    
    private String [] column_names = { 
                                        "Nadawca", 
                                        "Klient", 
                                        "Opis",
                                        "Data",
                                        "Czy wykonano"};
    
    private List<Repair> repairs;
    //private List<Employee> employees;
    
    Function f;
    
    public RepairTableModel(List<Repair> repairs, List<Employee> employees){
        super();
        this.repairs = repairs;
        //this.employees = employees;
        f = new Function();
    }
   
    @Override
    public int getRowCount() {
        return repairs.size();
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
        Repair temp = repairs.get(row);
        Employee e = f.getEmployeeByID(temp.getId_employee());
        
        
        switch (col) {
            case SENDER_COL:
                return e.getName() + ' ' + e.getFull_name();
                
            case CLIENT_COL:
                return temp.getClient_name() + ' ' + temp.getClient_full_name();
                
            case DESC_COL:
                return temp.getDescription();
                
            case DATE_COL:
                return temp.getDate();
                
            case EXECUTED_COL:{
                //return temp.isExecuted();
                return (temp.isExecuted() ? "Tak" : "Nie");
            }
            case OBJECT_COL:
			return temp;
                
            default:
                return temp.getId();
                
        }
    }
    
    
    
    
}
