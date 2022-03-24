import javax.swing.*;
import java.awt.Color;

public class ProVitarrico {
    public static void main(String[] args) {
        JFrame frameMain = new JFrame("Proyecto Integrador");
        frameMain.setContentPane(new Registro().panelMain);
        frameMain.setSize(900,500);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }
}
