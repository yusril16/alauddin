package Controller;

import Model.Database;
import Model.Admin;
import Model.Main;
import View.Forgetpass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Forgotpasscontroller implements ActionListener {
    private Main model;
    private Forgetpass view;
    private Database db = new Database();

    public Forgotpasscontroller() {
        model = new Main();
        view = new Forgetpass();
        view.setVisible(true);
        view.addActionListener(this);
        db.connect();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnsubmit())){
            if (view.getTfemail().getText().equals("") ||
                view.getTfpass().getText().equals("") || view.getTfConfirm().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Fill data field first");
            } else {
                String email = view.getTfemail().getText();
                Admin a = model.searchemail(email);
                if (model.searchemail(email) != null){
                    String pass = view.getTfpass().getText();
                    String confirmPass = view.getTfConfirm().getText();
                    if (pass.equals(confirmPass)){
                        a.setPassword(pass);
                        model.updateAdmin(a);
                        JOptionPane.showMessageDialog(view, "Change password succesful");
                    } else {
                        JOptionPane.showMessageDialog(view, "Confirmed password must be same");
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "NIK doesn't exist");
                }
            }
            view.setTfemail("");
            view.setTfpass("");
            view.setTfConfirm("");
        } else if (source.equals(view.getBtnback())){
            new LoginController();
            view.dispose();
        }
        
        }
}

