/*
 * To jest klasa która będzie dostarczała wszystkich podstawowych funkcji m. in. zapytań do bazy.
 */
package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import tablemodels.*;

/**
 *
 * @author Dominik i nikt inny
 */
public class Function {

    Connection myConn = null;

    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue
            = new byte[]{'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};

    public Function() {//konstruktor tworzy połączenie DB
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("src/externals/DBInfo.properties"));//ładowanie pliku

            //odczyt danych
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            String url = props.getProperty("url");

            myConn = DriverManager.getConnection(url, user, password);//uzyskanie połączenia

            System.out.println("Connected with " + url + "\n" + "User: " + user);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error.");
        }
    }

    //////funkcje które są potrzebne przy hasłąch
    public String encrypt(String valueToEnc) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encValue = c.doFinal(valueToEnc.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encValue);
        return encryptedValue;
    }

    public String decrypt(String encryptedValue) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }

    private Employee convertRowToEmployee(ResultSet rs) {
        Employee temp = null;
        try {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String full_name = rs.getString("full_name");
            String email = rs.getString("email");
            String password = rs.getString("password");
            String position = getPosition(rs.getInt("id_position"));
            temp = new Employee(id, name, full_name, email, password, position);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }

    public String getPosition(int index) {
        String temp = null;

        PreparedStatement preStmt = null;
        ResultSet rs = null;
        try {
            String sql = "Select name from positions where id = ?";

            preStmt = myConn.prepareStatement(sql);
            preStmt.setInt(1, index);
            rs = preStmt.executeQuery();

            if (rs.next()) {
                temp = rs.getString(1);
            }

            preStmt.close();
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while getting emloyee position info.");
        }

        return temp;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<Employee>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from employees order by full_name";
        try {
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Employee e = convertRowToEmployee(rs);
                list.add(e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Employyes.");
        }
        return list;
    }

    private Email convertRowToEmail(ResultSet rs) {
        Email temp = null;
        try {
            int id = rs.getInt("id");
            int id_sender = rs.getInt("id_sender");
            int id_receiver = rs.getInt("id_receiver");
            String text = rs.getString("text");
            Timestamp date = rs.getTimestamp("date");
            boolean checked = rs.getBoolean("checked");
            temp = new Email(id, id_sender, id_receiver, text, date, checked);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }

    public List<Email> getAllEmails() {
        List<Email> list = new ArrayList<Email>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from emails";
        try {
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Email e = convertRowToEmail(rs);
                list.add(e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }

    private Repair convertRowToRepair(ResultSet rs) {
        Repair temp = null;
        try {
            int id = rs.getInt("id");
            int id_employee = rs.getInt("id_employee");
            String client_name = rs.getString("client_name");
            String client_full_name = rs.getString("client_full_name");
            String description = rs.getString("description");
            Timestamp date = rs.getTimestamp("date");
            boolean executed = rs.getBoolean("executed");
            temp = new Repair(id, id_employee, client_name, client_full_name, description, date, executed);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }

    public List<Repair> getAllRepairs() {
        List<Repair> list = new ArrayList<Repair>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from repairs order by executed";
        try {
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Repair r = convertRowToRepair(rs);
                list.add(r);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }

    private Product convertRowToProduct(ResultSet rs) {
        Product temp = null;
        try {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            Double retail_price = rs.getDouble("retail_price");
            Double vat = rs.getDouble("vat");
            String id_category = getCategory(rs.getInt("id_category"));
            int quantity = rs.getInt("quantity");
            temp = new Product(id, name, retail_price, vat, id_category,quantity);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }

    public String getCategory(int index) {
        String temp = null;

        PreparedStatement preStmt = null;
        ResultSet rs = null;
        try {
            String sql = "Select name from categories where id = ?";

            preStmt = myConn.prepareStatement(sql);
            preStmt.setInt(1, index);
            rs = preStmt.executeQuery();

            if (rs.next()) {
                temp = rs.getString(1);
            }

            preStmt.close();
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while getting product category info.");
        }

        return temp;
    }

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<Product>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from products";
        try {
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Product p = convertRowToProduct(rs);
                list.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }

    public List<Product> convertStringCodeToProductsList(String string) {
        List<Product> list = new ArrayList<Product>();
        //List<Product> dblist = new ArrayList<Product>();
        Statement stmt = null;
        ResultSet rs = null;
        String index = "";
        String quantity = "";
        boolean existsIndex = false;
        try {

            for (char x : string.toCharArray()) {
                if (x != ',' && x != ';' && existsIndex == false) { //jeśli trafiło na cyfre i nie ma indexu
                    index += x;
                    continue;
                }
                if (x != ',' && x != ';' && existsIndex == true) {
                    quantity += x;
                    continue;
                }
                if (x == ',') {//jest już index 
                    existsIndex = true;
                    continue;
                }
                if (x == ';') {
                    //tu będzie dodawanie produktu
                    int nr = Integer.parseInt(index);
                    int count = Integer.parseInt(quantity);
                    //JOptionPane.showMessageDialog(null, "Nr: "+ nr);
                    //JOptionPane.showMessageDialog(null, "Count: "+ count);
                    Product temp = getProductById(nr); //cały produkt bez ilości
                    //ilość
                    temp.setQuantity(count);
                    //wstawienie do listy
                    list.add(temp);

                    //JOptionPane.showMessageDialog(null, temp);
                    //wyzerwanie
                    index = "";
                    quantity = "";
                    existsIndex = false;

                    continue;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while getting products list.");
        }

        return list;
    }

    private Product getProductById(int id) {
        Product p = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from products where id = ?";
        try {
            stmt = myConn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                p = convertRowToProduct(rs);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }

        return p;

    }

    private Order convertRowToOrder(ResultSet rs) {
        Order temp = null;
        try {
            int id = rs.getInt("id");
            int id_employee = rs.getInt("id_employee");
            Timestamp date = rs.getTimestamp("date");
            List<Product> list = convertStringCodeToProductsList(rs.getString("products"));
            boolean executed = rs.getBoolean("executed");
            temp = new Order(id, id_employee, date, list, executed);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }

    public List<Order> getAllOrders() {
        List<Order> list = new ArrayList<Order>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from orders";
        try {
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Order o = convertRowToOrder(rs);
                list.add(o);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }

    public Employee getEmployeeByID(int id) {
        Employee temp = null;
        List<Employee> list = new ArrayList<Employee>();
        list = getAllEmployees();

        for (Employee e : list) {
            if (e.getId() == id) {
                temp = e;
            }
        }

        return temp;

    }

    public void fillComboboxWithEmployees(JComboBox<Employee> combobox) {
        List<Employee> employees = new ArrayList<Employee>();

        employees = getAllEmployees();
        combobox.removeAllItems();
        for (Employee e : employees) {
            combobox.addItem(e);
        }
    }

    public void addEmail(Email temp) {
        try {
            PreparedStatement pstm = null;
            pstm = myConn.prepareStatement("insert into emails (id_sender,id_receiver,text,checked) values (?,?,?,?)");

            pstm.setInt(1, temp.getId_sender());
            pstm.setInt(2, temp.getId_receiver());
            pstm.setString(3, temp.getText());
            pstm.setBoolean(4, temp.isChecked());
            pstm.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error sending mail");
        }

    }

    void fillComboboxWithEmployeesWithoutUser(JComboBox combobox, Employee user) {
        List<Employee> employees = new ArrayList<Employee>();

        employees = getAllEmployees();
        combobox.removeAllItems();
        for (Employee e : employees) {
            if (e.getId() != user.getId()) {
                combobox.addItem(e);
            }
        }
    }

    public List<Email> getAllEmailsForUser(Employee user) {
        List<Email> list = new ArrayList<Email>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from emails where id_receiver = ? order by checked";
        try {
            stmt = myConn.prepareStatement(sql);
            stmt.setInt(1, user.getId());
            rs = stmt.executeQuery();

            while (rs.next()) {
                Email e = convertRowToEmail(rs);
                list.add(e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }

    public void addRepair(Repair temp) {
        try {
            PreparedStatement pstm = null;
            pstm = myConn.prepareStatement("INSERT INTO repairs (id_employee,client_name,client_full_name,description,executed) VALUES (?,?,?,?,?)");
            pstm.setInt(1, temp.getId_employee());
            pstm.setString(2, temp.getClient_name());
            pstm.setString(3, temp.getClient_full_name());
            pstm.setString(4, temp.getDescription());
            pstm.setBoolean(5, temp.isExecuted());
            pstm.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error sending mail");
        }

    }

    public void setEmailChecked(Email email) {
        PreparedStatement pstm = null;
        try {
            String sql = "update emails set checked = true where id=?";
            pstm = myConn.prepareStatement(sql);
           //pstm.setString(1, email.isChecked());

            pstm.setInt(1, email.getId());

            pstm.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while updating email");
        }
    }

    public void fillTableWithEmailsForUser(JTable jTableMailbox, Employee user) {

        List<Email> emails = new ArrayList<Email>();
        List<Employee> employees = new ArrayList<Employee>();
        emails = getAllEmailsForUser(user);
        employees = getAllEmployees();

        EmailTableModel model = new EmailTableModel(emails, employees);
        jTableMailbox.setModel(model);
    }

    public boolean thereIsNewMail(Employee user) {
        boolean thereis = false;
        try {
            List<Email> list = new ArrayList<Email>();
            list = getAllEmailsForUser(user);

            for (Email e : list) {
                if (!e.isChecked()) {
                    thereis = true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error checking new Email");
        }
        return thereis;
    }

    public void fillTableWithRepairs(JTable jTableRepairs) {
       try{
        List<Repair> repairs = new ArrayList<Repair>();
        List<Employee> employees = new ArrayList<Employee>();
        repairs = getAllRepairs();
        employees = getAllEmployees();
        
        RepairTableModel model = new RepairTableModel(repairs, employees);
        jTableRepairs.setModel(model);
       
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error filling table with Repars");
       }
    }
    
    public void setRepairExecuted(Repair temp) {
        PreparedStatement pstm = null;
        try {
            String sql = "update repairs set executed = true where id=?";
            pstm = myConn.prepareStatement(sql);
           //pstm.setString(1, email.isChecked());

            pstm.setInt(1, temp.getId());

            pstm.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while updating repair");
        }
    }

    public void fillTableWithAllProducts(JTable jTableProducts) {
       try{
        List<Product> products = new ArrayList<Product>();
        products = getAllProducts();
        
        ProductTableModel model = new ProductTableModel(products);
        jTableProducts.setModel(model);
       
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error filling table with Products");
       }
    }
    
    public List<Product> getFoodProducts() {
        List<Product> list = new ArrayList<Product>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from products where id_category = 4";
        try {
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Product p = convertRowToProduct(rs);
                list.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }

    public void fillTableWithFoodProducts(JTable jTableProducts) {
       try{
        List<Product> products = new ArrayList<Product>();
        products = getFoodProducts();
        
        ProductTableModel model = new ProductTableModel(products);
        jTableProducts.setModel(model);
       
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error filling table with Products");
       }
    }
    
    public List<Product> getPartsProducts() {
        List<Product> list = new ArrayList<Product>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from products where id_category != 4";
        try {
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Product p = convertRowToProduct(rs);
                list.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }
    
    public void fillTableWithPartsProducts(JTable jTableProducts) {
       try{
        List<Product> products = new ArrayList<Product>();
        products = getPartsProducts();
        
        ProductTableModel model = new ProductTableModel(products);
        jTableProducts.setModel(model);
       
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error filling table with Products");
       }
    }
    
    public List<Product> searchPartsProducts(String name) {
        name = '%' + name + '%';
        //JOptionPane.showMessageDialog(null, name);
        List<Product> list = new ArrayList<Product>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from products where id_category != 4 and name like ?";
        try {
            stmt = myConn.prepareStatement(sql);
            stmt.setString(1, name);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Product p = convertRowToProduct(rs);
                list.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error searching products.");
        }
        return list;
    }

    public void fillTableWithPartsProducts(JTable jTableProducts,String name) {
       try{
        List<Product> products = new ArrayList<Product>();
        products = searchPartsProducts(name);
        
        ProductTableModel model = new ProductTableModel(products);
        jTableProducts.setModel(model);
       
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error filling table with Products");
       }
    }
    
    public void removeColumn(JTable table, int x){
        
        TableColumn tcol = table.getColumnModel().getColumn(x);
        table.getColumnModel().removeColumn(tcol);
    }

    public void selectColumns(JTable jTableFoodOrdered, JTable jTableFoodToOrder) {
     
        for(int i = 0;i<3;i++)
        removeColumn(jTableFoodToOrder, 2);
        for(int i = 0;i<2;i++)
        removeColumn(jTableFoodOrdered, 2);
           
    }

    void refreshOrderedFood(JTable jTableFoodOrdered, List<Product> ordered_list) {
        ProductTableModel ordered_model = new ProductTableModel(ordered_list);
 
        jTableFoodOrdered.setModel(ordered_model);
        
        for(int i = 0;i<2;i++)
        removeColumn(jTableFoodOrdered, 2);
    }

    public boolean containsProductID(List<Product> ordered_list, int id) {
    
        for(Product p : ordered_list){
            if(p.getId() == id) return true;
        }
        return false;
    }
    
    public void addOrder(Order temp) {
        try {
            PreparedStatement pstm = null;
            pstm = myConn.prepareStatement("INSERT INTO orders (id_employee,products,executed) VALUES (?,?,?)");
            pstm.setInt(1, temp.getId_employee());
            String product_list = convertProductListToStringCode(temp.getList());
            pstm.setString(2, product_list);
            pstm.setBoolean(3, temp.isExecuted());
            pstm.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error sending order");
        }

    }

    public String convertProductListToStringCode(List<Product> list){
        String result = "";
        for(Product p : list){
            result += Integer.toString(p.getId()) + ',' + Integer.toString(p.getQuantity()) + ';';
        }
        
        
        return result;
    }
    
    public List<Product> getCategorisedProducts(int category) {
        List<Product> list = new ArrayList<Product>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from products where id_category = ?";
        try {
            stmt = myConn.prepareStatement(sql);
            stmt.setInt(1, category);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Product p = convertRowToProduct(rs);
                list.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }
    
    public void fillComboboxWithPartsCat(JComboBox<Product> combobox, int categorie) {
        List<Product> list = new ArrayList<Product>();

        list = getCategorisedProducts(categorie);
        combobox.removeAllItems();
        for (Product p : list) {
            combobox.addItem(p);
        }
    }

    void refreshProductTable(JTable jTablePartsOrders, List<Product> ordered_list) {
        ProductTableModel ordered_model = new ProductTableModel(ordered_list);
 
        jTablePartsOrders.setModel(ordered_model);
        
        removeColumn(jTablePartsOrders, 3);
    }
    
    
    
    
    
    
    
    
}
