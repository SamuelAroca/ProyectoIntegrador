import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSeccion extends JFrame{
    protected JPanel panelLogin;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel labelUser;
    private JLabel labelPassw;
    private JButton buttonLogin;
    private JLabel labelTitulo;
    private JLabel labelImagen2;
    private JButton buttonRegresar1;
    private JButton volverButton;


    public InicioSeccion() {
        setContentPane(panelLogin);

        buttonRegresar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame frameMain = new PantallaMain();
                frameMain.setSize(650,500);
                frameMain.setLocationRelativeTo(null);
                frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameMain.setVisible(true);
            }
        });
    }


}
