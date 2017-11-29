/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.*;
import javax.swing.*;


public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/UserLogins","root","");
        JOptionPane.showMessageDialog(null,"Connected to DB");
        return conn;
        
    }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,"Error in Connected to DB");
        return null;
    }
    }
}



    
