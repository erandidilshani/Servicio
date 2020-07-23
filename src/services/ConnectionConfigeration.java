package services;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionConfigeration {
    //Connection conn = null;
    public static Connection getConnection(){
       Connection conn ;
       
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servicio","root","");
        //JOptionPane.showMessageDialog(null,"Success");
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    //return conn;
    }
}
