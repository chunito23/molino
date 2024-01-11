package Vista;

import Controlador.Controlador;

import javax.swing.*;

public class VistaGrafica extends JFrame implements Ivista{
    private JPanel VG;
    private JButton b00;
    private JButton b03;
    private JButton b06;
    private JButton b11;
    private JButton b13;
    private JButton b15;
    private JButton b22;
    private JButton b23;
    private JButton b24;
    private JButton b30;
    private JButton b31;
    private JButton b32;
    private JButton b34;
    private JButton b35;
    private JButton b36;
    private JButton b42;
    private JButton b43;
    private JButton b44;
    private JButton b51;
    private JButton b53;
    private JButton b55;
    private JButton b60;
    private JButton b63;
    private JButton b66;
    private Controlador c;
    private int contador = 1;

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
