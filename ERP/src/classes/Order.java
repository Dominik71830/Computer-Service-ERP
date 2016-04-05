/*
 * Zamówienia na produkty
 */
package classes;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class Order {
    private int id;
    private int id_employee;
    private Timestamp date;
    private List<Product> list;
    private boolean executed;

    public Order() {
    }

    public Order(int id, int id_employee, Timestamp date, List<Product> list, boolean executed) {
        this.id = id;
        this.id_employee = id_employee;
        this.date = date;
        this.list = list;
        this.executed = executed;
    }

    public Order(int id_employee, Timestamp date, List<Product> list, boolean executed) {
        this.id_employee = id_employee;
        this.date = date;
        this.list = list;
        this.executed = executed;
    }

    public int getId() {
        return id;
    }

    public int getId_employee() {
        return id_employee;
    }

    public Timestamp getDate() {
        return date;
    }

    public List<Product> getList() {
        return list;
    }

    public boolean isExecuted() {
        return executed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", id_employee=" + id_employee + ", date=" + date + ", list=" + list + ", executed=" + executed + '}';
    }
    
    
}
