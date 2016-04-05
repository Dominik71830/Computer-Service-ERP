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
import javax.swing.JOptionPane;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Dominik i nikt inny
 */
public class Function {
    
    Connection myConn= null;
    
    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue = 
    new byte[] { 'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y' };

    public Function() {//konstruktor tworzy połączenie DB
            try{
                Properties props = new Properties();
		props.load(new FileInputStream("src/externals/DBInfo.properties"));//ładowanie pliku
		
                //odczyt danych
		String user =       props.getProperty("user");
		String password =   props.getProperty("password");
		String url =        props.getProperty("url");
                
                myConn = DriverManager.getConnection(url, user, password);//uzyskanie połączenia
		
		System.out.println("Connected with " + url + "\n" + "User: " + user);
            }
            catch(Exception e){
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

    
    private Employee convertRowToEmployee(ResultSet rs){
        Employee temp = null;
        try{
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String full_name = rs.getString("full_name");
        String email = rs.getString("email");
        String password = rs.getString("password");
        String position=getPosition(rs.getInt("id_position"));
        temp = new Employee(id, name, full_name,email,password,position);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }
    
    
    public String getPosition(int index){
       String temp = null;
    
       PreparedStatement preStmt = null;
       ResultSet rs = null;
       try{
           String sql = "Select name from positions where id = ?";
           
           preStmt=myConn.prepareStatement(sql);
           preStmt.setInt(1, index);
           rs = preStmt.executeQuery();
           
           if(rs.next()){
			temp = rs.getString(1);
		}
           
           preStmt.close();
           rs.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error while getting emloyee position info.");
       }
       
       return temp;
   }
    
    
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from employees order by full_name";
        try{
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Employee e = convertRowToEmployee(rs);
                list.add(e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error getting Employyes.");
        }
        return list;
    }
    
    
    private Email convertRowToEmail(ResultSet rs){
        Email temp = null;
        try{
        int id = rs.getInt("id");
        int id_sender = rs.getInt("id_sender");
        int id_receiver = rs.getInt("id_receiver");
        String text = rs.getString("text");
        Timestamp date =  rs.getTimestamp("date");
        temp = new Email(id, id_sender, id_receiver,text,date);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }
    
    
    public List<Email> getAllEmails(){
        List<Email> list = new ArrayList<Email>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from emails";
        try{
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Email e = convertRowToEmail(rs);
                list.add(e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }
    
    private Repair convertRowToRepair(ResultSet rs){
        Repair temp = null;
        try{
        int id = rs.getInt("id");
        int id_employee = rs.getInt("id_employee");
        String client_name = rs.getString("client_name");
        String client_full_name = rs.getString("client_full_name");
        String description = rs.getString("description");
        Timestamp date =  rs.getTimestamp("date");
        temp = new Repair(id, id_employee, client_name,client_full_name,description,date);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }
    
    
    public List<Repair> getAllRepairs(){
        List<Repair> list = new ArrayList<Repair>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from repairs";
        try{
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Repair r = convertRowToRepair(rs);
                list.add(r);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }
    
    private Product convertRowToProduct(ResultSet rs){
        Product temp = null;
        try{
        int id = rs.getInt("id");
        String name = rs.getString("name");
        Double retail_price = rs.getDouble("retail_price");
        Double vat = rs.getDouble("vat");
        String id_category =getCategory(rs.getInt("id_category"));
        temp = new Product(id, name, retail_price,vat,id_category);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return temp;
    }
    
    
    public String getCategory(int index){
       String temp = null;
    
       PreparedStatement preStmt = null;
       ResultSet rs = null;
       try{
           String sql = "Select name from categories where id = ?";
           
           preStmt=myConn.prepareStatement(sql);
           preStmt.setInt(1, index);
           rs = preStmt.executeQuery();
           
           if(rs.next()){
			temp = rs.getString(1);
		}
           
           preStmt.close();
           rs.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error while getting product category info.");
       }
       
       return temp;
   }
    
    public List<Product> getAllProducts(){
        List<Product> list = new ArrayList<Product>();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from products";
        try{
            stmt = myConn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Product p = convertRowToProduct(rs);
                list.add(p);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error getting Emails.");
        }
        return list;
    }
    
    public List<Product> convertStringCodeToProductsList(String string){
        List<Product> list = new ArrayList<Product>();
        Statement stmt = null;
        ResultSet rs = null;
        String index = "";
        String quantity = "";
        boolean existsIndex=false;
        try{
            
            for(char x : string.toCharArray()){
                if(x!=',' && x!=';' && existsIndex == false){ //jeśli trafiło na cyfre i nie ma indexu
                    index += x;
                    continue;
                }
                if(x!=',' && x!=';' && existsIndex == true){
                    quantity += x;
                    continue;
                }
                if(x==','){//jest już index 
                    existsIndex = true;
                    continue;
                    }
                if(x==';'){
                    //tu będzie dodawanie produktu
                    int nr = Integer.parseInt(index);
                    int count = Integer.parseInt(quantity);
                    JOptionPane.showMessageDialog(null, "Nr: "+ nr);
                    
                    JOptionPane.showMessageDialog(null, "Count: "+ count);
                    
                    index = "";
                    quantity = "";
                    existsIndex = false;
                    continue;
                }
                
                
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error while getting products list.");
        }
        
        
        return list;
    }
    
    
    
    
    
    
    
    
    
}
