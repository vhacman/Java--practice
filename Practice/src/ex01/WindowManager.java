package ex01;

import java.awt.event.*;
//import java.awt.event.WindowEvent;

/**
 * Classe che gestisce gli eventi della finestra.
 * <p>
 * Questa classe estende {@link WindowAdapter} e fornisce la gestione
 * dell'evento di chiusura della finestra, terminando l'applicazione quando
 * l'utente chiude la finestra.
 *
 * @author Vhacman
 * @version 1.0
 */
public class   WindowManager extends WindowAdapter {
    /**
     * Metodo invocato quando l'utente tenta di chiudere la finestra.
     * <p>
     * Questo metodo stampa un messaggio di debug e termina l'applicazione
     * con codice di uscita 0.
     *
     * @param e l'evento di chiusura della finestra
     */
    public void windowClosing(WindowEvent e) {
        System.out.println("ex01.WindowManager closing");
        System.exit(0);
    }
}
