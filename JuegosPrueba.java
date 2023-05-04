import javax.swing.JOptionPane;

public class JuegosPrueba {

  public static void main(String[] args) {
    int respuesta = 0;
    
    do {respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Juego de Dados \n2.-Juego adivinar numero \n3.-Jugar volado \n4.-Piedra, Papel y Tijera \n5.-Salir "));
        switch (respuesta) {
            case 1:
            JuegoDeDados juego1 = new JuegoDeDados();
            juego1.iniciar();
            juego1.jugar();
            juego1.finalizar();


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
            

            break;

            case 4:
            JuegoPiedraPapelTijera juego4 = new JuegoPiedraPapelTijera();
            juego4.iniciar();
            juego4.jugar();
            juego4.finalizar();
            
            break;

            case 5:
            JOptionPane.showMessageDialog(null, "Hasta la proxima amigo");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Ingrese una opcion  valida");
            break;
            }
        } while (respuesta != 5);
    }
}
