import javax.swing.JOptionPane;

public class PruebaDeJuegos 
{
  public static void main(String[] args) {
    int respuesta = 0;
    do {respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Juego de Dados \n 2.-Juego adivinar numero \n 3.-Jugar volado \n 4.-Salir "));
        switch (respuesta) {
            case 1:
            JuegoDeDados juego = new JuegoDeDados();
            juego.iniciar();
            juego.jugar();
            juego.finalizar();

            break;
            case 2:
            JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero();
            juego2.iniciar();
            juego2.jugar();
            juego2.finalizar();
            break;
            case 3:
            JuegoMoneda juego3 = new JuegoMoneda();
            juego3.iniciar();
            juego3.jugar();
            juego3.finalizar();
            // juego3.Marcador();

            break;
            case 4:
            JOptionPane.showMessageDialog(null, "Hasta la proxima amigo");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Ingrese una opcion  valida");
            break;
            }
        } while (respuesta != 4);
    }
}
