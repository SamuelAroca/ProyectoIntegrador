import javax.swing.*;

public class Ventana extends JFrame {

    //Tablero canvas;

    int ANCHO = 1500;
    int ALTO = 800;

    public Ventana(){

        setTitle("Pruebas");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null);
        setResizable(true);
        //canvas = new Tablero();
        //add(canvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }
}
