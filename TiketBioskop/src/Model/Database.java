/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.table.*;

/**
 *
 * @author adin
 */
public class Database {
    private String server = "jdbc:mysql://localhost:3306/tiket_bioskop";
    private String dbUser = "root";
    private String dbPasswd = "";
    private Statement statement = null;
    private Connection connection = null;
    private ResultSet rs = null;
    
    public void connect(){
        try{
            connection = DriverManager.getConnection(server, dbUser, dbPasswd);
            statement =  connection.createStatement();
        }catch(SQLException ex){
            System.out.println("Connection problem occured");
        }
    }
    
    public boolean loginAdmin(Admin a){
        try {
            String query = "select * from admin where username ='"
                    + a.getUsername() + "' and password = '" + a.getPassword() + "'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Username or password doesn't exist");
        }
    
    }
    
    public void signUpAdmin(Admin a) {
        try {
            String query = "insert into admin (username, password) values"
                + "('" + a.getUsername() + "', "
                + "'" + a.getPassword() + "', ";
            statement.executeUpdate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("Nama ");
        }
    }
    
//    public void disconnect(){
//        try {
//            conn.close();
//            stmt.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public boolean manipulate(String query){
//        boolean cek = false;
//        try {
//            int rows = stmt.executeUpdate(query);
//            if (rows > 0) cek = true;
//        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return cek;
//    }
    
}
