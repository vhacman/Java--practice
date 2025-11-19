import java.awt.*;
import java.awt.event.*;

public class    PrimaFinestra extends Frame {
    public PrimaFinestra() {
        super("Prima Finestra");
        setBackground(Color.pink);
        setLocation(100, 100);
        setSize(800, 700);
        addWindowListener(new GestoreFinestra());
        show();
    }

    class   GestoreFinestra extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.println("GestoreFinestra closing");
            System.exit(0);
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        Font fontCorsivo = new Font("Arial", Font.ITALIC, 20);
        g.setFont(fontCorsivo);
        String  testo = "la mia prima finestra in Java";
        FontMetrics fm = g.getFontMetrics(fontCorsivo);
        int larghezzaTesto = fm.stringWidth(testo);
        int altezzaTetso = fm.getHeight();

        int x = (getWidth() - larghezzaTesto) / 2;
        int y = (getHeight() - altezzaTetso) / 2;

        g.drawString(testo, x, y);
    }
    public static void  main(String[] args) {
        new PrimaFinestra();
    }
}