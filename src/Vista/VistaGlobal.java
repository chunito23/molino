package Vista;


import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class VistaGlobal {
    Login login1 = new Login();
    VistaConsola vc;
    VistaGrafica vf;

     public VistaGlobal(Controlador c){
         vc = new VistaConsola(c);
         vf = new VistaGrafica();
         vc.setVisible(false);
         vf.setVisible(false);
         login1.getIniciarButton().addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 iniciarJugadores();
             }
         });
     }

     public int iniciarJugadores(){
         login1.setVisible(false);
         vc.setVisible(true);
         vf.setVisible(true);
         return WindowConstants.EXIT_ON_CLOSE;
     }
}
