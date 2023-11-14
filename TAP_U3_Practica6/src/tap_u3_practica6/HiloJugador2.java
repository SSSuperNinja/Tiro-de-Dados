package tap_u3_practica6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloJugador2 extends Thread{
    Ventana p;
    boolean estado = true;
    int resultado2 = 0;
    public HiloJugador2(Ventana p){
        this.p = p;
    }
    
    public void run(){
        while(estado){
            for (int i = 0; i < 2; i++) {
            int tiro = (int)(Math.random()*(6-1)+1);
            p.mostrarMensaje2("Numero resultante al tirar el dado: "+tiro);
            resultado2 += tiro;
            if(i==1){
            p.mostrarMensaje2("Suma de los tiros: "+resultado2); 
            p.ganador[1] = resultado2;
            p.bufferArreglo.append(resultado2+"");
//            p.jTextPane4.setText(p.bufferArreglo.toString());
            Terminar();
            }
        }
            try {
                sleep(1200);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void Terminar(){
        estado = false;
    }
}
