package ex01;

import java.awt.*;

/**
 * Classe che rappresenta una finestra grafica AWT con testo centrato.
 * <p>
 * Questa classe estende {@link Frame} e crea una semplice finestra con sfondo rosa
 * che visualizza un testo centrato "My first window in Java" in corsivo.
 *
 * @author Vhacman
 * @version 1.0
 */
public class    FirstWindow extends Frame {
    /**
     * Costruttore che inizializza e visualizza la finestra.
     * <p>
     * Configura le proprietà della finestra tra cui:
     * <ul>
     *     <li>Titolo: "Prima Window"</li>
     *     <li>Colore di sfondo: rosa</li>
     *     <li>Posizione: (100, 100)</li>
     *     <li>Dimensioni: 800x700 pixel</li>
     * </ul>
     * Aggiunge anche un listener per gestire la chiusura della finestra.
     */
    public FirstWindow() {
        super("Prima Window");
        setBackground(Color.pink);
        setLocation(100, 100);
        setSize(800, 700);
        addWindowListener(new WindowManager());
        show();
    }

    /**
     * Metodo che disegna il contenuto della finestra.
     * <p>
     * Disegna una stringa di testo centrata nella finestra utilizzando
     * un font Arial in corsivo di dimensione 20. Il testo viene posizionato
     * al centro sia orizzontalmente che verticalmente.
     *
     * @param g il contesto grafico utilizzato per il disegno
     */
    public void paint(Graphics g) {
        g.setColor(Color.black);
        Font fontItalic = new Font("Arial", Font.ITALIC, 20);
        g.setFont(fontItalic);
        String  testo = "My first window in Java";
        FontMetrics fm = g.getFontMetrics(fontItalic);
        int textWidth = fm.stringWidth(testo);
        int textHeight = fm.getHeight();

        int x = (getWidth() - textWidth) / 2;
        int y = (getHeight() - textHeight) / 2;

        g.drawString(testo, x, y);
    }

    /**
     * Metodo principale che avvia l'applicazione.
     * <p>
     * Crea e visualizza una nuova istanza della finestra.
     *
     * @param args argomenti della riga di comando (non utilizzati)
     */
    public static void  main(String[] args) {
        new FirstWindow();
    }
}