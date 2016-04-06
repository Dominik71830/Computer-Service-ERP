/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import classes.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominik
 */
public class EmailTableModel extends AbstractTableModel{
    public static final int OBJECT_COL = -1;
    public static final int SENDER_NAME_COL = 0;
    public static final int SENDER_FULL_NAME_COL = 1;
    public static final int TEXT_COL = 2;
    public static final int DATE_COL = 3;
    
    private String [] column_names = { 
                                        "Imie nadawcy", 
                                        "Nazwisko nadawcy", 
                                        "Treść",
                                        "Data"};
    
    
    private List<Email> emails;
    private List<Employee> employees;
    
    Function f;
    
    public EmailTableModel(List<Email> emails, List<Employee> employees){
        super();
        this.emails = emails;
        this.employees = employees;
        f = new Function();
    }
    
    @Override
    public int getRowCount() {
        return emails.size();
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
        Email temp = emails.get(row);
        Employee e = f.getEmployeeByID(temp.getId_sender());
        
        
        switch (col) {
            case SENDER_NAME_COL:
                return e.getName();
                
            case SENDER_FULL_NAME_COL:
                return e.getFull_name();
                
            case TEXT_COL:
                return temp.getText();
                
            case DATE_COL:
                return temp.getDate();
                
            case OBJECT_COL:
			return temp;
                
            default:
                return temp.getId();
                
        }
    }
    
    
    
    
    
    
    
}
