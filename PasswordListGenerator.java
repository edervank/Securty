package passwordlistgenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PasswordListGenerator {

    public static PrintWriter pr;
    public static void main(String[] args) {
        geradoweb();
        try { 
            pr = new PrintWriter("999999.txt", "UTF-8");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PasswordListGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PasswordListGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void geradoweb(){
        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;

        try {
            url = new URL("http://www.sulamericano.com.br/");
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (MalformedURLException mue) {
             mue.printStackTrace();
        } catch (IOException ioe) {
             ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
                // nothing to see here
            }
        }

    }
    
    public static void gettext(){
        
    }
    
    
    
    
}
