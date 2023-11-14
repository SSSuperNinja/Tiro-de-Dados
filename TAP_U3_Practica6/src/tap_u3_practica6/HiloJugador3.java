package tap_u3_practica6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloJugador3 extends Thread{
    Ventana p;
    boolean estado = true;
    int resultado3 = 0;
    public HiloJugador3(Ventana p){
        this.p = p;
    }
    
    public void run(){
    while(estado){
        for (int i = 0; i < 2; i++) {
            int tiro = (int)(Math.random()*(6-1)+1);
            p.mostrarMensaje3("Numero resultante al tirar el dado: "+tiro);
            resultado3 += tiro;
            if(i==1){
            p.mostrarMensaje3("Suma de los tiros: "+resultado3); 
            p.ganador[2] = resultado3;
            p.bufferArreglo.append(resultado3+"");
            Terminar();
//            p.jTextPane4.setText(p.bufferArreglo.toString());
            }
        }
        
             int l = Integer.parseInt(p.bufferArreglo.toString());
                if (p.ganador[0] > p.ganador[1]) {
            if (p.ganador[0] > p.ganador[2]) {
                p.mostrarGanadores("El ganador es el jugador 1");                                             
            } else {
                p.mostrarGanadores("El ganador es el jugador 3");                
            }
        } else if (p.ganador[1] > p.ganador[2]) {
            p.mostrarGanadores("El ganador es el jugador 2");
        } else {
            p.mostrarGanadores("El ganador es el jugador 3");
        
                
                }//for  
        try {
            sleep(1200);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloJugador3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }  

    
    
        public void Terminar(){
        estado = false;
    }  
}


