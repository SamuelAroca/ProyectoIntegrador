import javax.swing.*;

public class ProVitarrico {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frameMain = new PantallaMain();
                frameMain.setSize(650,500);
                frameMain.setLocationRelativeTo(null);
                frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameMain.setVisible(true);
            }
        });
    }
}
