package bigarrenErronka;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;

public class Ventana3 extends JPanel {
	private static final long serialVersionUID = 1L;
	/**
	 * LEHIOAN SORTUTAKO ELEMENTUAK.
	 */
	JLabel lblZerrenda = new JLabel("ZERRENDA");
	JTextArea zerrenda = new JTextArea();
	JLabel lblPrezioTotala = new JLabel("PREZIO TOTALA:");
	JTextPane ordaintzeko_dirua = new JTextPane();
	JLabel label = new JLabel("\u20AC");
	JButton jarraitu = new JButton("Jarraitu");
	JButton ezeztatu = new JButton("Ezeztatu");
	JButton atzera = new JButton("Atzera");
	
	
    public Ventana3() {
     setBackground(SystemColor.control);
   	 setLayout(null);
   	 lblZerrenda.setRequestFocusEnabled(false);
   	 
   	 //LABEL ZERRENDA
   	 lblZerrenda.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
   	 lblZerrenda.setBounds(271, 44, 153, 49);
   	 add(lblZerrenda);
   	 zerrenda.setLineWrap(true);
   	 zerrenda.setRows(10);
   	 
   	 //TEXTAREA ZERRENDA
   	 zerrenda.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 20));
   	 zerrenda.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
   	 zerrenda.setBounds(88, 124, 505, 234);
   	 add(zerrenda);
   
   	 
   	 
   	 //LABEL PREZIO TOTALA
   	 lblPrezioTotala.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
   	 lblPrezioTotala.setBounds(133, 395, 201, 32);
   	 add(lblPrezioTotala);
   	 ordaintzeko_dirua.setFocusable(false);
   	 
   	 //TEXTPANE ORDAINTZEKO DIRUA
   	 ordaintzeko_dirua.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
   	 ordaintzeko_dirua.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
   	 ordaintzeko_dirua.setBounds(331, 395, 83, 32);
   	 add(ordaintzeko_dirua);
   	 String dirua=String.valueOf(Zerrenda.preziototala);
   	 ordaintzeko_dirua.setText(dirua);
   	 
   	 //LABEL EURO
   	 label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
   	 label.setBounds(424, 397, 24, 28);
   	 add(label);
   	 
   	 //JARRAITU BOTOIA
   	 jarraitu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
   	 jarraitu.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent arg0) {
   			 if(Frame.Ventana3.isVisible()){
                	Frame.Ventana4.setVisible(true);
                	Frame.Ventana5.setVisible(false);
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);           	 
             }
   			String prezioa = String.valueOf(Zerrenda.dezimal.format(Zerrenda.preziototala));
   			Metodoak.preziototala2=Zerrenda.preziototala;
	    	Frame.Ventana4.ordaindubehar.setText(prezioa); 
   		 }
   	 });
   	 jarraitu.setBounds(497, 464, 120, 40);
   	 add(jarraitu);
   	 
   	 //EZEZTATU BOTOIA
   	 ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
   	 ezeztatu.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 if(Frame.Ventana3.isVisible()){
                	Frame.Ventana1.setVisible(true);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
            	}
   			 Metodoak.berriroHasieratu();
   		 }
   	 });
   	 ezeztatu.setBounds(89, 464, 114, 40);
   	 add(ezeztatu);
   	 
   	 //ATZERA BOTOIA
   	 atzera.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent arg0) {
   			 if(Frame.Ventana3.isVisible()){
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(true);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
            	}
   			Zerrenda.zerrenda="";
   			Frame.Ventana3.jarraitu.setEnabled(true);
   		 }
   	 });
   	 atzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
   	 atzera.setBounds(294, 463, 114, 42);
   	 add(atzera);

    }
}








