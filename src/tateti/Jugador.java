package tateti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugador {
    private Ficha ficha;

    public Jugador() {
    }

    public Jugador(Ficha ficha) {
        this.ficha = ficha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
   
    public void ponerFicha(Tablero tablero){
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            System.out.print("Fila   : ");
            int fila = Integer.parseInt(br.readLine());
            System.out.print("Columna: ");
            int columna = Integer.parseInt(br.readLine());
            tablero.getTablero()[fila][columna] = " _"+this.ficha.getFicha()+"_ ";
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}