
package logiciel_ipm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connecteur {
    Connection  con ;
    public Connecteur() throws SQLException{
        /*try{
        Class.forName("org.sqlite.JDBC");
        }catch(ClassNotFoundException e){
        System.err.println(e);
        }*/
      
        con = DriverManager.getConnection("jdbc:sqlite:C:\\DataBase\\IPM.db");
        System.out.println("connected");
            
       
    }
    Connection obtenirconnexion(){return con;}
}
