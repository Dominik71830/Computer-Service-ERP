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
import java.sql.SQLException;
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
                JOptionPane.showMessageDialog(null, "Connection Error");
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

    
    
    
    
    
    
    
    
    
    
}
