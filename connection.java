package UNM;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    Connection connection;
    Statement statement;

    public con(){
        try{
            connection = DriverManager.get
        }
    }catch (Exception e){
            e.printStackTrace();
        }
}
