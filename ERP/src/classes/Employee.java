
package classes;


/**
 *
 * @author Dominik
 */
public class Employee {
   
    private int id;
    private String name;
    private String full_name;
    private String email;
    private String password;
    private String position;
   

    public Employee() {
    }

    public Employee(int id, String name, String full_name, String email, String password, String position) {
        this.id = id;
        this.name = name;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.position = position;
    }

    public Employee(String name, String full_name, String email, String password, String position) {
        this.name = name;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPosition() {
        return position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return name + ' ' + full_name;
    }
    
    public String showInfo() {
        return name + ' ' + full_name + ' ' + email + ' ' + password + ' ' + position;
    }
    
}
