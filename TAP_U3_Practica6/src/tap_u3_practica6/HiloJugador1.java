package tap_u3_practica6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloJugador1 extends Thread{
        Ventana p;
        int resultado = 0;
        private boolean estado = true;
        
    public HiloJugador1(Ventana p){
        this.p = p;
    }


    
    public void run(){
    while(estado){
        
        for (int i = 0; i < 2; i++) {
            int tiro = (int)(Math.random()*(6-1)+1);
            p.mostrarMensaje1("Numero resultante al tirar el dado: "+tiro);
            resultado += tiro;
            if(i==1){
            p.mostrarMensaje1("Suma de los tiros: "+resultado); 
            p.ganador[0] = resultado;
            p.bufferArreglo.append(resultado+"");
//            p.jTextPane4.setText(p.bufferArreglo.toString());
            Terminar();            
            }
        }

       
        
            try {
                sleep(1200);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJugador1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
    public void Terminar(){
        estado = false;
    }
}
