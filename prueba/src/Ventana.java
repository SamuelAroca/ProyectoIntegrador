import javax.swing.*;

public class Ventana extends JFrame {

    Tablero canvas;

    public Ventana(){
        setTitle("Prueba");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        canvas = new Tablero();
        add(canvas);


    }


}
