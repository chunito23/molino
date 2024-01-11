package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaGrafica extends JFrame implements Ivista{
    private JPanel VG;
    private Controlador c;
    private int contador = 1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public class BotonComunListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se hizo clic en un botón");
        }
    }

    public VistaGrafica(Controlador c){
        this.c = c;
        c.setVista(this);
        setLocationRelativeTo(null);
        setSize(600,600);
        setContentPane(VG);
    }

    public void establecerNombre(String nombreJugador) {
        setTitle(nombreJugador);
    }

    @Override
    public void mostrar() {

    }

    @Override
    public void MostrarTexto(String texto) {

    }
}
