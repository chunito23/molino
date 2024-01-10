package Vista;

import javax.swing.*;

public class Login extends JFrame{
    private JButton iniciarButton;
    private JTextField textField1;
    private JButton consolaButton;
    private JButton graficaButton;
    private JPanel login;

    public Login(){
        setVisible(true);
        setTitle("login ");
        setLocationRelativeTo(null);
        setSize(400,200);
        setContentPane(login);
    }
}
