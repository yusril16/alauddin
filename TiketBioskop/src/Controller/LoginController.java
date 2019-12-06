package Controller;

import Model.Database;
import Model.Main;
import View.Login;
import View.Menuutama;
import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Yusril
 */

public class LoginController implements ActionListener {

    private Main model;
    private Login view;
    private Database db = new Database();
    
    public LoginController() {
        model = new Main();
        view = new Login();
        view.setVisible(true);
        view.addActionListener(this);
        db.connect();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(view.getBtnlogin())){
                if (view.getTfusername().getText().equals("")||view.getTfpassword().getText().equals("")){
                    JOptionPane.showMessageDialog(view, "All data must be field");
                } else {
                    String username = view.getTfusername().getText();
                    String password = view.getTfpassword().getText();
                    if(model.loginAdmin(username,password)){
                        view.setVisible(false);
//                        new MainMenuController(username);
                        view.dispose();
                    } else {
                        JOptionPane.showMessageDialog(view, "Invalid Password/Username");
                    }
                    view.setTfusername("");
                    view.setTfpassword("");
                }
//                if (model.loginAdmin(view.gettfUsername().getText(), view.gettfPass().getText())){
//                    new Main();
//                }
//                } else {
//                    JOptionPane.showMessageDialog(null, "Gagal Login", "Gagal Login", JOptionPane.ERROR_MESSAGE);
//                }
            } else if (source.equals(view.getBtnsignin())){
                view.setVisible(false);
                new RegisterController();
                view.dispose();
            } else if (source.equals(view.getBtnforget())){
                view.setVisible(false);
                new Forgotpasscontroller();
                view.dispose();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }
    
}
