/*
 * Wiadomo
 */
package classes;

/**
 *
 * @author Dominik
 */
public class Product {
    private int id;
    private String name;
    private Double retail_price;
    private Double vat;
    private String category;
    private int quantity;

  

    public Product() {
    }

    public Product(String name, Double retail_price, Double vat, String category, int quantity) {
        this.name = name;
        this.retail_price = retail_price;
        this.vat = vat;
        this.category = category;
        this.quantity = quantity;
    }

    public Product(int id, String name, Double retail_price, Double vat, String category, int quantity) {
        this.id = id;
        this.name = name;
        this.retail_price = retail_price;
        this.vat = vat;
        this.category = category;
        this.quantity = quantity;
    }

    
    public Product(int id, String name, Double retail_price, Double vat, String category) {
        this.id = id;
        this.name = name;
        this.retail_price = retail_price;
        this.vat = vat;
        this.category = category;
    }

    public Product(String name, Double retail_price, Double vat, String category) {
        this.name = name;
        this.retail_price = retail_price;
        this.vat = vat;
        this.category = category;
    }

    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getRetail_price() {
        return retail_price;
    }

    public Double getVat() {
        return vat;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRetail_price(Double retail_price) {
        this.retail_price = retail_price;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

     public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
    
    public void substractQuantity(int _quantity) {
        this.quantity -= _quantity;
    }

    @Override
    public String toString() {
        return name + " - " + retail_price +"zł";
    }
    
    public static Product copy(Product p){
        Product temp = new Product();
        temp.id = p.id;
        temp.name = p.name;
        temp.retail_price = p.retail_price;
        temp.vat = p.vat;
        temp.category = p.category;
        temp.quantity = p.quantity;
        return temp;
    } 
    
}
