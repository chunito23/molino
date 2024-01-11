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

    public JButton getIniciarButton() {
        return iniciarButton;
    }

    public void setIniciarButton(JButton iniciarButton) {
        this.iniciarButton = iniciarButton;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JButton getConsolaButton() {
        return consolaButton;
    }

    public void setConsolaButton(JButton consolaButton) {
        this.consolaButton = consolaButton;
    }

    public JButton getGraficaButton() {
        return graficaButton;
    }

    public void setGraficaButton(JButton graficaButton) {
        this.graficaButton = graficaButton;
    }

    public JPanel getLogin() {
        return login;
    }

    public void setLogin(JPanel login) {
        this.login = login;
    }


}
