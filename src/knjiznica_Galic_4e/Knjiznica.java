package knjiznica_Galic_4e;

/**
 *
 * @author Galic
 */
public class Knjiznica {
    public static void main(String[] args){
        
        //pozivanje metode da se program poveže sa bazom
        JavaConnect.connectDB();
        
        //otvaranje prozora prijava
        new Prijava().setVisible(true);
    }
}
