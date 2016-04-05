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

    
    private Employee convertRowToEmployee(ResultSet Rs){
        Employee emp = null;
        try{
        int id = Rs.getInt("id");
        String name = Rs.getString("name");
        String full_name = Rs.getString("full_name");
        String email = Rs.getString("email");
        String password = Rs.getString("password");
        String position=getPosition(Rs.getInt("id_position"));
        emp = new Employee(id, name, full_name,email,password,position);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error converting row to Employee.");
        }
        return emp;
    }
    
    
    public String getPosition(int index){
       String pos = null;
    
       PreparedStatement preStmt = null;
       ResultSet rs = null;
       try{
           String sql = "Select name from positions where id = ?";
           
           preStmt=myConn.prepareStatement(sql);
           preStmt.setInt(1, index);
           rs = preStmt.executeQuery();
           
           if(rs.next()){
			pos = rs.getString(1);
		}
           
           preStmt.close();
           rs.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error while getting emloyee position info.");
       }
       
       return pos;
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
    
}
