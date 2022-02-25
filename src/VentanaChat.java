import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class VentanaChat extends JFrame implements ActionListener{
    
    private JTextArea area;
    private JScrollPane scroll;
    private JTextField texto;
    private JButton boton;

    public VentanaChat(){
        super("Guasap");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout()); //GridBagLayout Ordenar los componentes de una mejor forma
        GridBagConstraints gbc = new GridBagConstraints(); // Restrcciones de comportamiento de los componentes
        
        area = new JTextArea();
        scroll = new JScrollPane(area);
        texto = new JTextField(20);
        boton = new JButton("Enviar");

        boton.setBackground(Color.CYAN);

        gbc.gridx = 0; //Columna donde se quiere posiciconar el componente
        gbc.gridy = 0; //Fila de lo de arriba
        gbc.gridwidth = 2; //Columnas que se quiere ocupar
        gbc.gridheight = 1; //Cantidad de filas que se quiere ocupar
        gbc.weightx = 1.0; //Que tanto va a crecer componente cuando crezca la ventana 
        gbc.weighty = 1.0;
        gbc.fill = gbc.BOTH; //Modo en el que crece el componente
        add(scroll, gbc);

        gbc.gridx = 0; 
        gbc.gridy = 1; 
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = gbc.HORIZONTAL;
        add(texto,gbc);

        gbc.gridx = 1; 
        gbc.gridy = 1; 
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.fill = gbc.NONE;
        add(boton,gbc);

        boton.addActionListener(this); //Para que cuando se toque el botó se muestre lo que se escribe
        
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        //Qué pasa cuando se toca un botón
        if(e.getSource()==boton){
            area.append(texto.getText()+"\n");
            texto.setText(""); //Vaciar la caja de texto
        }
    }

}
