package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import classes.*;


public class MainForAll {
    
    public static void main(String args[]){
        

        SplashWin o = new SplashWin();
        
        Lms_Connection connect = new Lms_Connection();//initializing connection when the program first starts
        connect.createConnection();
        
        
    }
    
    }
