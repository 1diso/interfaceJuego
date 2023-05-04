import javax.swing.JOptionPane;

public class JuegoAdivinaNumero implements Juego {
    private int numAdivina;
    private int intentos=0;
    public JuegoAdivinaNumero() {
    }
    public void iniciar() {
    numAdivina = 1 + (int) (Math.random() * 100);
    }
    public void jugar() {
    int numero;
    do {
        numero=Integer.parseInt(JOptionPane.showInputDialog("Adivina un número entre 1 y 100:")) ;
    if (numAdivina < numero)
    JOptionPane.showMessageDialog(null, "El número a adivinar es menor");
    else if (numAdivina > numero)
    JOptionPane.showMessageDialog(null, "El número a adivinar es mayor");
    intentos++;
    } 
    while (numero != numAdivina);
    }
    public void finalizar() 
    {
    JOptionPane.showMessageDialog(null, "Ganaste luego de \n" + intentos + " intentos");
    }
}
    