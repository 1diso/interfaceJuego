import javax.swing.*;
public class JuegoPiedraPapelTijera implements Juego
{   
    private int manoMaquina,manoJugador;
    
    private String resultadoManoJugador,resultadoManoMaquina;
    
    public void iniciar() {
        manoJugador=Integer.parseInt(JOptionPane.showInputDialog("Escribe 1 para elegir Piedra \nEscribe 2 para elegir Papel \nEscribe 3 para elegir Tijera "));
        if(manoJugador==1)
        {
            resultadoManoJugador="Piedra";
        }
        else if(manoJugador==2)
        {
            resultadoManoJugador="Papel";
        }
        else
        {
            resultadoManoJugador="Tijera";                
        }

        manoMaquina= 1+(int)(Math.random()*3);
        if(manoMaquina==1){
            resultadoManoMaquina="Piedra";
        }
        else if(manoMaquina==2)
        {
            resultadoManoMaquina="Papel";
        }
        else
        {
            resultadoManoMaquina="Tijera";
        }
        
    }

    
    public void jugar() 
    {
        if(resultadoManoJugador.equalsIgnoreCase(resultadoManoMaquina))
        {
            JOptionPane.showMessageDialog(null, "Empate, ambos jugadores sacaron "+ resultadoManoJugador);
           
        }
        
        else if((resultadoManoJugador.equalsIgnoreCase("Piedra")) && (resultadoManoMaquina.equalsIgnoreCase("Tijera"))
                || (resultadoManoJugador.equalsIgnoreCase("Papel")) && (resultadoManoMaquina.equalsIgnoreCase("Piedra"))   
                || (resultadoManoJugador.equalsIgnoreCase("Tijera")) && (resultadoManoMaquina.equalsIgnoreCase("Papel")))
            {
                JOptionPane.showMessageDialog(null,"Gano el jugador");
                
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Gano la maquina");
                
            }
           
    }

    
    public void finalizar() 
    {
        JOptionPane.showMessageDialog(null, "Tú elegiste: "+resultadoManoJugador+"\nY la maquina: "+resultadoManoMaquina);
     
    }
    

    


}
