/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Model.Database;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adin
 */
public class Main {
    private Database db;
    private DefaultTableModel model;
    
    public Main(JTable tbData) {
        model = (DefaultTableModel) tbData.getModel();
        this.db = new Database();
        db.connect();
    }

    public Main() {
        this.db = new Database();
        db.connect();
    }
    
    public boolean loginAdmin(String username, String password){
        Admin a = new Admin(username, password);
        if (db.loginAdmin(a)){
            return true;
        } else {
            return false;
        }
    }
    
    
}
