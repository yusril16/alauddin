
package Controller;

import Model.Database;
import Model.Admin;
import Model.Main;
import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class RegisterController implements ActionListener{
    private Main model = new Main();
    private Register view = new Register();
    private Database db = new Database();

    public RegisterController() {
        view.setVisible(true);
        view.addActionListener(this);
        db.connect();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnsign())){
            try {
                if(view.getTfsusername().getText().equals("")||view.getTfsemail().getText().equals("")||view.getTffirstname().getText().equals("")||
                    view.getTflastname().toString().equals("")||view.getTfspassword().getText().equals("")||view.getTfsconpass().getText().equals("")||
                    view.getTfsnohp().getText().equals("")){
                        JOptionPane.showMessageDialog(view, "All data must be filled");
                } else {
                    String username = view.getTfsusername().getText();
                    String password = view.getTfspassword().getText();
                    String firstname = view.getTffirstname().getText();
                    String lastname = view.getTflastname().getText();
                    String email = view.getTfsemail().getText();
                    String nohp = view.getTfsnohp().getText();
                    Admin a = new Admin(username, password, firstname, lastname, email, nohp);
                    model.createAdmin(a);
                    JOptionPane.showMessageDialog(view, "Signed Up");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(view, e.getMessage());
            }
            view.setTfsusername("");
            view.setTfspassword("");
            view.setTfsconpass("");
            view.setTffirstname("");
            view.setTflastname("");
            view.setTfsemail("");
            view.setTfsnohp("");
        } else if (source.equals(view.getBtnbacksignin())){
            view.setVisible(false);
            new LoginController();
            view.dispose();
        }
    
    }
    
    
}
