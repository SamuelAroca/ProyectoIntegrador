import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;

public class PantallaMain extends JFrame{
    protected JPanel panelMain;
    protected JButton buttonRegistro;
    protected JButton buttonLogin;
    protected JLabel labelLogo;
    protected JLabel labelWhapp;
    protected JLabel labelVideo;

    public PantallaMain() {
        setContentPane(panelMain);


        labelWhapp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enlace("https://www.whatsapp.com/?lang=es");
            }
        });
        labelVideo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enlacePubli("https://youtu.be/WWbjMbjcvt0");
            }
        });

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame frameLog = new InicioSeccion();
                frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameLog.setSize(650,500);
                frameLog.setLocationRelativeTo(null);
                frameLog.setVisible(true);

            }
        });
    }

    public void enlace(String enlaceAAceder) {
        Desktop enlace = Desktop.getDesktop();
        try {
            enlace.browse(new URI(enlaceAAceder));

        }catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
    }

    public void enlacePubli(String enlaceAAceder) {
        Desktop enlace = Desktop.getDesktop();
        try {
            enlace.browse(new URI(enlaceAAceder));

        }catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
    }
}
