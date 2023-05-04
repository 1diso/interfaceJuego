import javax.swing.*;

public class JuegoMoneda implements Juego {
    private int moneda, monedaJugador;
    private String monedaResultado;
    private int victoriaJugador = 0;
    private int victoriaMaquina = 0;

    public void iniciar() {
        monedaJugador = Integer.parseInt(JOptionPane.showInputDialog("Escribe 1 para elegir Cara \nO \nEscribe 2 para elegir cruz "));
    }

    public void jugar() {
        moneda = 1 + (int)(Math.random() * 2);
        if (moneda == 1) {
            monedaResultado = "Cara";
        } else {
            monedaResultado = "Cruz";
        }
    }

    public void finalizar() {
        if (monedaJugador == moneda) {
            JOptionPane.showMessageDialog(null, "Ganaste \nCayó: " + monedaResultado);
            victoriaJugador++;
        } else {
            JOptionPane.showMessageDialog(null, "Perdiste \nCayó: " + monedaResultado);
            victoriaMaquina++;
        }
    }

    public void mostrarMarcador() {
        JOptionPane.showMessageDialog(null, "MARCADOR \nEl jugador lleva: " + victoriaJugador + " victorias" + "\nLa maquina lleva: " + victoriaMaquina + " victorias");
    }
}
