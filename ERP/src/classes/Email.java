/*
 * Wiadomości między użytkownikami
 */
package classes;

import java.sql.Timestamp;

/**
 *
 * @author Dominik
 */
public class Email {
    private int id;
    private int id_sender;
    private int id_receiver;
    private String text;
    private Timestamp date;
    private boolean checked;

    public Email(int id, int id_sender, int id_receiver, String text, Timestamp date, boolean checked) {
        this.id = id;
        this.id_sender = id_sender;
        this.id_receiver = id_receiver;
        this.text = text;
        this.date = date;
        this.checked = checked;
    }

    public Email(int id_sender, int id_receiver, String text, Timestamp date, boolean checked) {
        this.id_sender = id_sender;
        this.id_receiver = id_receiver;
        this.text = text;
        this.date = date;
        this.checked = checked;
    }

    public Email(int id_sender, int id_receiver, String text, boolean checked) {
        this.id_sender = id_sender;
        this.id_receiver = id_receiver;
        this.text = text;
        this.checked = checked;
    }
    
    

    

    public Email() {
    }

    public int getId() {
        return id;
    }

    public int getId_sender() {
        return id_sender;
    }

    public int getId_receiver() {
        return id_receiver;
    }

    public String getText() {
        return text;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_sender(int id_sender) {
        this.id_sender = id_sender;
    }

    public void setId_receiver(int id_receiver) {
        this.id_receiver = id_receiver;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Email{" + "id=" + id + ", id_sender=" + id_sender + ", id_receiver=" + id_receiver + ", text=" + text + ", date=" + date + ", checked=" + checked + '}';
    }

    
    
    
    
    
    
}
