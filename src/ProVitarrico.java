import javax.swing.*;

public class ProVitarrico {
    public static void main(String[] args) {
        JFrame frameMain = new JFrame("Proyecto Integrador");
        frameMain.setContentPane(new PantallaMain().panelMain);
        frameMain.setSize(950,500);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }
}
