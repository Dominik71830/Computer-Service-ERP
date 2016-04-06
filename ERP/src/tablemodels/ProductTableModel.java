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
public class ProductTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int NAME_COL = 0;
    public static final int RETAIL_PRICE_COL = 1;
    public static final int VAT_COL = 2;
    public static final int CATEGORY_COL = 3;
    public static final int QUANTITY_COL = 4;
    
    
    private String [] column_names = { 
                                        "Nazwa", 
                                        "Cena detal.", 
                                        "VAT",
                                        "Kategoria",
                                        "Ilosć"};
    private List<Product> products;
    
    Function f;
    
    public ProductTableModel(List<Product> products){
        super();
        this.products = products;
        f = new Function();
    }
    
    @Override
    public int getRowCount() {
        return products.size();
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
        Product temp = products.get(row);
                
        
        switch (col) {
            case NAME_COL:
                return temp.getName();
                
            case RETAIL_PRICE_COL:
                return temp.getRetail_price();
                
            case VAT_COL:
                return temp.getVat();
                
            case CATEGORY_COL:
                return temp.getCategory();
                
            case QUANTITY_COL:
                return temp.getQuantity();
            
            case OBJECT_COL:
			return temp;
                
            default:
                return temp.getId();
                
        }
    }
    
    
    
    
    
    
}
