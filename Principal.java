
/**
 * Esta es la clase principal de la aplicación interactiva que quiero hacer desde siempre.
 * 
 * @author Sergio Recio Blázquez
 * @version 1.0 14 dic 2018
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal
{
    private JFrame ventana;

    /**
     * Método inicial
     */
    public static void main(String args[])
    {
        Principal una = new Principal();
    }

    /**
     * Constructor for objects of class Principal
     */
    public Principal()
    {
        ventana = new JFrame("Smith");
        ventana.setSize(300,200);
        JPanel c = (JPanel)ventana.getContentPane();
        c.setLayout(new FlowLayout());
        Smith ser = new Smith();
        ser.setSize(120,150);
        ser.setBackground(Color.GRAY);
        c.add(ser);
        JButton hola = new JButton("Hola");
        hola.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent ev){
                //JOptionPane.showMessageDialog(ventana, "¡¡¡Hola!!!");
				ser.pronunciar("Hola");
            }
        });
        c.add(hola);
        JButton adios = new JButton("Adios");
        adios.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent ev){
				ser.pronunciar("Adios");
				new Thread(new Runnable() {
					public void run() {
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                //JOptionPane.showMessageDialog(adios, "Adios.. :,(");
		                //System.exit(0);
					}
				}).start();
            }
        });
        c.add(adios);
        ventana.setVisible(true);
    }

}
