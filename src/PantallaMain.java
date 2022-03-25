import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PantallaMain {
    protected JPanel panelMain;
    private JButton buttonRegistro;
    private JButton buttonLogin;
    private JLabel labelLogo;
    private JLabel labelWhapp;
    private JLabel labelVideo;
    private JLabel labelTectoVideo;


    public PantallaMain() {




        buttonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
