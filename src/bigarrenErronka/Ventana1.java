package bigarrenErronka;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana1 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
    /**
	 * LEHIOAN SORTUTAKO ELEMENTUAK.
	 */
    JLabel txtOngiEotirriMaquina = new JLabel("Ongi Etorri");
    JLabel Icono = new JLabel("");
    JLabel lblMakinaSaltzailera = new JLabel("Makina Saltzailera");

	public Ventana1() {
		   	addMouseListener(new MouseAdapter() {
		   		 @Override
		   		 public void mouseClicked(MouseEvent e) {
		   			 
		   			 Ventana2 Ejecutar=new Ventana2 ();
		   			 Ejecutar.setVisible(true);
		   		 }
		   	});
        	this.setBackground(SystemColor.control);
        	setLayout(null);
       	 
        	  //LABEL ONGI ETORRI

        	txtOngiEotirriMaquina.setFont(new Font("Comic Sans MS", Font.PLAIN, 27));
        	txtOngiEotirriMaquina.setBounds(179, 76, 161, 44);
        	add(txtOngiEotirriMaquina);
       	 
        	//LABEL ICONO

        	Icono.setIcon(new ImageIcon(Ventana1.class.getResource("/fotos/termibus.png")));
        	Icono.setBounds(257, 271, 301, 139);
        	add(Icono);
       	 
        	 //LABEL MAKINA SALTZAILEA

        	lblMakinaSaltzailera.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
        	lblMakinaSaltzailera.setBounds(321, 131, 255, 44);
        	add(lblMakinaSaltzailera);
       	 
    	}
    }


	









