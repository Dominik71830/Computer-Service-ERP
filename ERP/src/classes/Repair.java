/*
 * Naprawy i serwisowanie
 */
package classes;

import java.sql.Timestamp;

/**
 *
 * @author Dominik
 */
public class Repair {
    private int id;
    private int id_employee;
    private String client_name;
    private String client_full_name;
    private String description;
    private Timestamp date;

    public Repair() {
    }

    public Repair(int id, int id_employee, String client_name, String client_full_name, String description, Timestamp date) {
        this.id = id;
        this.id_employee = id_employee;
        this.client_name = client_name;
        this.client_full_name = client_full_name;
        this.description = description;
        this.date = date;
    }

    
    public Repair(int id_employee, String client_name, String client_full_name, String description, Timestamp date) {
        this.id_employee = id_employee;
        this.client_name = client_name;
        this.client_full_name = client_full_name;
        this.description = description;
        this.date = date;
    }

    public Repair(int id_employee, String client_name, String client_full_name, String description) {
        this.id_employee = id_employee;
        this.client_name = client_name;
        this.client_full_name = client_full_name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getId_employee() {
        return id_employee;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getClient_full_name() {
        return client_full_name;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public void setClient_full_name(String client_full_name) {
        this.client_full_name = client_full_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Repair{" + "id=" + id + ", id_employee=" + id_employee + ", client_name=" + client_name + ", client_full_name=" + client_full_name + ", description=" + description + ", date=" + date + '}';
    }
    
    
    
}
