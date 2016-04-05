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

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", retail_price=" + retail_price + ", vat=" + vat + ", category=" + category + '}';
    }

   
    
    
    
}
