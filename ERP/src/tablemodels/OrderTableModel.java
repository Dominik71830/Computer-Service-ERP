/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import javax.swing.table.AbstractTableModel;
import classes.*;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class OrderTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int EMPLOYEE_NAME_COL = 0;
    public static final int DATE_COL = 1;
    public static final int PRODUCTS_COL = 2;
    public static final int PRICE_COL = 3;
    public static final int EXECUTED_COL = 4;
    
    
    private String [] column_names = { 
                                        "Zamawiający", 
                                        "Data", 
                                        "Produkty",
                                        "Cena + VAT",
                                        "Czy odebrano"};
    private List<Order> orders;

    Function f;
    
    public OrderTableModel(List<Order> products){
        super();
        this.orders = products;
        f = new Function();
    }
    
    @Override
    public int getRowCount() {
        return orders.size();
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
        Order temp = orders.get(row);
        Employee employee = f.getEmployeeByID(temp.getId_employee());
        
        switch (col) {
            case EMPLOYEE_NAME_COL:
                return employee.getName() + ' ' + employee.getFull_name();
                
            case DATE_COL:
                return temp.getDate();
                
            case PRODUCTS_COL:
                return temp.getList();
                
            case PRICE_COL:
                return f.getPriceFromProductList(temp.getList());
                
            case EXECUTED_COL:
                return temp.isExecuted();
            
            case OBJECT_COL:
			return temp;
                
            default:
                return temp.getId();
                
        }
    }
    
    
    
    
    
    
}
