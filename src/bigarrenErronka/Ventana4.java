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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
public class Ventana4 extends JPanel {
	private static final long serialVersionUID = 1L;
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
	/**
	 * LEHIOAN SORTUTAKO ELEMENTUAK.
	 */
	JTextField dirua= new JTextField();
	JLabel OrdainduBeharrekoa = new JLabel("Ordaindu Beharrekoa: ");
	JTextPane ordaindubehar = new JTextPane();
	JLabel euro = new JLabel("€");
    JLabel SartuDirua = new JLabel("Sartu Dirua:");
    JButton bukatu = new JButton("Bukatu");
    JTextArea kanbioak = new JTextArea();
    JButton balidatu = new JButton("Ordaindu");
    JLabel label = new JLabel("€");
    JButton ezeztatu = new JButton("Ezeztatu");

    public Ventana4() {
    	this.setBackground(SystemColor.control);
    	setLayout(null);
   	 
    	//LABEL ORDAINDU BEHARREKOA
    	OrdainduBeharrekoa.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    	OrdainduBeharrekoa.setBounds(107, 41, 233, 28);
    	add(OrdainduBeharrekoa);
   	 
    	//TEXTPANE ORDAINDU BEHARREKOA
    	ordaindubehar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    	ordaindubehar.setEditable(false);
    	ordaindubehar.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
    	ordaindubehar.setBounds(362, 41, 81, 28);
    	add(ordaindubehar);
   	 
    	//LABEL EURO
    	euro.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    	euro.setBounds(453, 45, 24, 20);
    	add(euro);
   	 
    	//LABEL SARTU DIRUA
    	SartuDirua.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    	SartuDirua.setBounds(168, 91, 132, 38);
    	add(SartuDirua);
    	
   	 
    	
    	//TEXTAREA KANBIOAK

    	kanbioak.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
    	kanbioak.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
    	kanbioak.setBounds(155, 178, 423, 309);
    	add(kanbioak);
    	bukatu.setBounds(457, 541, 121, 37);
    	add(bukatu);
   	 
    	//Diruaren Textua
    	
    	dirua.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
    	dirua.setBounds(362, 95, 81, 28);
    	add(dirua);
    	dirua.setColumns(10);
   	 
   	 
    	//BALIDATU BOTOIA
    	balidatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
    	balidatu.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent arg0) {
   			 String ordaindu=(String) dirua.getText();//Sartutako diru kantitatea testu moduan gordeko da
   			 System.out.println(Metodoak.preziototala2);
   			 //KONPROBATU LETRA
   			 boolean letra=Metodoak.konprobatuLetra(ordaindu);
   			 String mezua="";
   			 if (letra==false) {
   				double zbk= Double.parseDouble(ordaindu);//Zenbaki formatura pasatzen da
   				
   				//KONPROBATU ZENBAKI NEGATIBOA
   				boolean zenbakia=Metodoak.konprobatuNegatibo(zbk);
   				if (zenbakia==true){
	   				
   					//KONPROBATU DIRU FALTA
   					Metodoak.diruKonprobaketa(zbk);
   					
   					boolean diru_falta=Metodoak.diruFalta();
	   				if (diru_falta==true){
	   					mezua=(Zerrenda.dezimal.format(Metodoak.preziototala2)+" € falta zaizkizu");
	   					System.out.println(mezua);
	   					Frame.Ventana4.kanbioak.setText(mezua);
	   				}else {
	   					if (Metodoak.preziototala2<0) {
	   						
		   					Metodoak.preziototala2=Metodoak.preziototala2*(-1);
		   					System.out.println(Metodoak.preziototala2);
		   					String kanbioak=Metodoak.kanbioMetodoa(Metodoak.preziototala2);
		   					Frame.Ventana4.kanbioak.setText(kanbioak);
		   					Frame.Ventana4.balidatu.setEnabled(false);
		   					Frame.Ventana4.ezeztatu.setEnabled(false);
	   					}else if(Metodoak.preziototala2==0) {
	   						mezua="Eskerrik asko erosteagatik";
		   					Frame.Ventana4.kanbioak.setText(mezua);
		   					Frame.Ventana4.balidatu.setEnabled(false);
		   					Frame.Ventana4.ezeztatu.setEnabled(false);
	   					}
	   				}
   				}
   				 
   			}
   			Frame.Ventana4.dirua.setText("");	
   		 }
    	});
   			
  	 
    	//LABEL EURO
    	label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    	label.setBounds(453, 101, 24, 18);
    	add(label);
    	balidatu.setBounds(477, 129, 144, 38);
    	add(balidatu);
   	 
    	//EZEZTATU BOTOIA
    	ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
    	ezeztatu.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			
   			 if(Frame.Ventana4.isVisible()){
                	Frame.Ventana1.setVisible(true);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
            	}
   			Metodoak.berriroHasieratu();
   			 
   		 }
    	});
    	ezeztatu.setBounds(121, 541, 121, 37);
    	add(ezeztatu);
    
    	//BUKATU BOTOIA
    	bukatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
    	bukatu.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 if(Frame.Ventana4.isVisible()){
                	Frame.Ventana5.setVisible(true);
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);
                	Frame.Ventana4.setVisible(false);  
                	Contador contador=new Contador();
                	contador.start();
            	}
   			Frame.Ventana4.ezeztatu.setEnabled(true);
   			 Metodoak.berriroHasieratu();
   		 }
    	});
   	 
   	 
   	 
   	 
   	 
   	 
    }
}






