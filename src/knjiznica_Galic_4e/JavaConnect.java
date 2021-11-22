package knjiznica_Galic_4e;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author Galic
 */

public class JavaConnect {
    
    Connection con;
    
    public static Connection connectDB(){
        
        //povezivanje s bazom
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Galic\\Desktop\\Knjiznica_Galic_4e\\knjiznica.sqlite");
            
            return conn;            
        }
        catch(ClassNotFoundException | SQLException e){
            //bacanje exceptiona ako se baza ne može povezati sa programom
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Nastao je problem sa spajanjem na bazu!\nProvjerite path u JavaConnect.java!", "Greška", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
        }
    }
}
