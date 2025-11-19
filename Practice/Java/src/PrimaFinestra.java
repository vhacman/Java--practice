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
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("La mia prima finestra in Java", 50, 50);
    }
    public static void  main(String[] args) {
        new PrimaFinestra();
    }
}