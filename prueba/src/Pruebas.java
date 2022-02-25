import javax.swing.*;
import java.awt.*;

public class Pruebas {



    public static void main(String[] args) {

        Ventana ventana = new Ventana();
        JMenuBar mb = new JMenuBar();
        Flow f = new Flow();
        JMenu m1 = new JMenu("Archivo");
        JMenu m2 = new JMenu("Ayuda");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Abrir");
        JMenuItem m22 = new JMenuItem("Guardar como");
        m1.add(m11);
        m1.add(m22);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Introducir texto");
        JTextField tf = new JTextField("Hola",3);
        JButton send = new JButton("Enviar");
        JButton reset = new JButton("Restablecer");






        ventana.setVisible(true);

    }
}
