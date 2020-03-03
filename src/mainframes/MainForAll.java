package mainframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import classes.*;

import Log.YouAre;//the first frame to apper

public class MainForAll {
    
    public static void main(String args[]){
        

        SplashWin o = new SplashWin();
        
        Lms_Connection connect = new Lms_Connection();//initializing connection when the program first starts
        connect.createConnection();
        
        
    }
    
    }
