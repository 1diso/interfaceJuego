import javax.swing.JOptionPane;

public class JuegoDeDados implements Juego {

  private int dado1, dado2;
  private String jugador1;
  private String jugador2;

  public JuegoDeDados() {}

  public void iniciar() {
    jugador1 =
      JOptionPane.showInputDialog("Ingrese el nombre del primer jugador:");
    jugador2 =
      JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador:");
  }

  public void jugar() {
    dado1 = 1 + (int) (Math.random() * 6);
    dado2 = 1 + (int) (Math.random() * 6);
    JOptionPane.showMessageDialog(null,"A "+jugador1+ " le salió el valor " + dado1);
    JOptionPane.showMessageDialog(null, "A "+jugador2+ " le salió el valor " + dado2);
  }

  public void finalizar() {
    if (dado1 > dado2) JOptionPane.showMessageDialog(null,"Gano " + jugador1 + " con un valor de " + dado1); 
    else if 
    (dado2 > dado1) JOptionPane.showMessageDialog(null,"Gano " + jugador2 + " con un valor de " + dado2);
    else JOptionPane.showMessageDialog(null,"Empataron los dos jugadores con el valor " + dado1);
  }
}
