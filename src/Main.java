import Controlador.Controlador;
import Vista.VistaConsola;
import Modelo.*;

public class Main {
    public static void main(String[] args) {
            System.out.println("tato pelado");
            Jugador j1 = new Jugador();
            Jugador j2 = new Jugador();
            Modelo m = new Modelo(j1,j2);

            Controlador controlador1 = new Controlador(m);
            Controlador controlador2 = new Controlador(m);
            controlador1.setJugador(j1);
            controlador2.setJugador(j2);

            VistaConsola vistaconsola1 = new VistaConsola(controlador1);
            VistaConsola vistaconsola2 = new VistaConsola(controlador2);

            vistaconsola1.setVisible(true);
            vistaconsola2.setVisible(true);

    }
}