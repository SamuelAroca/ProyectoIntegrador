import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PraticaJframe extends JFrame{

    
    public PraticaJframe(){

        int ANCHO = 400;
        int ALTO = 400;
        setTitle("PRUEBA VITARRICO"); //Establecemos el título de la ventana.
        
        this.setSize(ANCHO, ALTO); //Tamaño de la ventana
        setLocationRelativeTo(null); // Si le ponemos "null" se establece la ventana en el centro de la pnatalla.
        setResizable(true);
        this.getContentPane().setBackground(Color.cyan);
        setMinimumSize(new Dimension(200,200));

        iniciarComponetens();

        setDefaultCloseOperation(EXIT_ON_CLOSE);// Este método nos permite cerrar, ocultar, eliminar o nada en la ventana
    }

    //Crear panel

    private void iniciarComponetens(){
        JPanel panel = new JPanel(); //Creación del panel.

        panel.setLayout(null); //Desactivamos el diseño.
        

        panel.setBackground(Color.MAGENTA);
        this.getContentPane().add(panel); //Agregamos el panel a la ventana.
        

        JLabel etiqueta = new JLabel("klk mi gente", SwingConstants.CENTER); //Creamos una etiqueta de texto.
        //etiqueta.setText("Hola");
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Establecer alineación horizontal del texto.
        etiqueta.setOpaque(true); //Permiso de fondo etiqueta.
        etiqueta.setBounds(50, 50, 80, 45);
        etiqueta.setForeground(Color.WHITE); //Color de letra.
        etiqueta.setBackground(Color.BLACK);
        //Holas Jim


        panel.add(etiqueta);



    }
}
