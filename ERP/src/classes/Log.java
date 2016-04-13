/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Timestamp;

/**
 *
 * @author Dominik
 */
public class Log {
    private int id;
    private int id_object;
    private Timestamp date;
    private String action;

    public Log() {
    }

    public Log(int id, int id_object, Timestamp date, String action) {
        this.id = id;
        this.id_object = id_object;
        this.date = date;
        this.action = action;
    }
    
    

    public Log(int id_object, Timestamp date, String action) {
        this.id_object = id_object;
        this.date = date;
        this.action = action;
    }

    public Log(int id_object, String action) {
        this.id_object = id_object;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public int getId_object() {
        return id_object;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getAction() {
        return action;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_object(int id_object) {
        this.id_object = id_object;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Log{" + "id=" + id + ", id_object=" + id_object + ", date=" + date + ", action=" + action + '}';
    }
    
    
    
}
