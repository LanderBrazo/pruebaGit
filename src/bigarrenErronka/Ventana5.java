package bigarrenErronka;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana5 extends JPanel {
	private static final long serialVersionUID = 1L;
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
	
	/**
	 * LEHIOAN SORTUTAKO ELEMENTUAK.
	 */
	JLabel lblEskerrikAskoErosteagatik = new JLabel("ESKERRIK ASKO EROSTEAGATIK");  
	JLabel lblZureProduktuakOrain = new JLabel("Zure produktuak orain aterako dira ");
	JLabel lblNewLabel = new JLabel("");


    public Ventana5() {
    	this.setBackground(SystemColor.control);
    	setLayout(null);
    	
    	//LABEL ESKERRIK ASKO
    	lblEskerrikAskoErosteagatik.setHorizontalAlignment(SwingConstants.CENTER);
    	lblEskerrikAskoErosteagatik.setBounds(151, 68, 430, 82);
    	lblEskerrikAskoErosteagatik.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
    	this.add(lblEskerrikAskoErosteagatik);
   	 	
    	//LABEL ZURE PRODUKTUAK
    	lblZureProduktuakOrain.setHorizontalAlignment(SwingConstants.CENTER);
    	lblZureProduktuakOrain.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
    	lblZureProduktuakOrain.setBounds(151, 188, 430, 65);
    	add(lblZureProduktuakOrain);
   	 
    	//LABEL LOGOA
    	lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
    	lblNewLabel.setIcon(new ImageIcon(Ventana5.class.getResource("/fotos/termibus.png")));
    	lblNewLabel.setBounds(222, 291, 301, 156);
    	add(lblNewLabel);
    }
}



