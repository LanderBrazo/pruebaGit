package bigarrenErronka;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Ventana2 extends JPanel {
	 private static final long serialVersionUID = 1L;
	 Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
	
	    /**
		 * LEHIOAN SORTUTAKO ELEMENTUAK.
		 */
	    static int kont=0;
	    static double prezioa=0;
	    JLabel lblHauDaProduktuen = new JLabel("Hau da produktuen zerrenda: ");
	    JCheckBox chckbxUrbotilak = new JCheckBox("");
	    JCheckBox chckbxNewCheckBox = new JCheckBox("");
	    JCheckBox chckbxLaranjaFreskagarriak = new JCheckBox("");
	    JCheckBox chckbxLimoiFreskagarriak = new JCheckBox("");
	    JCheckBox chckbxTeIzoztua = new JCheckBox("");
	    JCheckBox chckbxTxokolatezkoBarritak = new JCheckBox("");
	    JCheckBox chckbxToblerone = new JCheckBox("");
	    JCheckBox chckbxFruituLehorrak = new JCheckBox("");
	    JButton btnNewButton = new JButton("Ur Botilak 1.5 \u20AC");
	    JButton btnKolaFreskagarriak = new JButton("Kola Freskagarriak 2\u20AC");
	    JButton btnLaranjaFreskagarriak = new JButton("Laranja Freskagarriak 2\u20AC");
	    JButton btnLimoiFreskagarriak = new JButton("Limoi Freskagarriak 2\u20AC");
	    JButton btnTeIzoztua = new JButton("Te Izoztua 1.80\u20AC");
	    JButton btnTxokolatezkoBarritak = new JButton("Txokolatezko Barritak 1.80\u20AC");
	    JButton btnToblerone = new JButton("Toblerone 2\u20AC");
	    JButton btnFruituLehorrak = new JButton("Fruitu Lehorrak 1\u20AC");
	    JButton btnJarraitu = new JButton("jarraitu");

    
    public Ventana2() {
	   	setMinimumSize(new Dimension(500, 500));
	   	setAutoscrolls(true);
	   	setPreferredSize(new Dimension(719, 569));
	   	setMaximumSize(new Dimension(32870, 32833));
	   	
	   	this.setBackground(SystemColor.control);
    	setLayout(null);
    	lblHauDaProduktuen.setBounds(236, 11, 287, 45);
   	 
   	 
    	 //LABEL PRODUKTUEN ZERRENDA

    	lblHauDaProduktuen.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    	add(lblHauDaProduktuen);
   	 
    	//LABEL URA
    	JLabel ura = new JLabel("");
    	ura.setBounds(28, 67, 105, 115);
    	ura.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/agua\u00E7.jpg")));
    	add(ura);
    	
    	//LABEL KOLA
    	JLabel kola = new JLabel("");
    	kola.setBounds(28, 187, 105, 106);
    	kola.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/Coca.jpg")));
    	add(kola);
    	
    	//LABEL LARANJA ZUKUA
    	JLabel laranja = new JLabel("");
    	laranja.setBounds(29, 301, 105, 106);
    	laranja.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/kas.jpg")));
    	add(laranja);
    	
    	//LABEL LIMOI ZUKUA
    	JLabel limoi = new JLabel("");
    	limoi.setBounds(28, 417, 105, 93);
    	limoi.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/limon.jpg")));
    	add(limoi);
    	
    	//LABEL TEA
    	JLabel te = new JLabel("");
    	te.setBounds(391, 67, 105, 115);
    	te.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/nestea.jpg")));
    	add(te);
    	
    	//LABEL TOBLERONE
    	JLabel toblerone = new JLabel("");
    	toblerone.setBounds(391, 178, 115, 93);
    	toblerone.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/toblerone.jpg")));
    	add(toblerone);
    	
    	//LABEL TXOKOLATE BARRITA
    	JLabel txoko = new JLabel("");
    	txoko.setBounds(369, 282, 105, 93);
    	txoko.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/twix.jpg")));
    	add(txoko);
    	//LABEL FRUITU LEHORRAK
    	JLabel fruitu = new JLabel("");
    	fruitu.setBounds(379, 384, 105, 115);
    	fruitu.setIcon(new ImageIcon(Ventana2.class.getResource("/fotos/frutos.jpg")));
    	add(fruitu);
    	btnNewButton.setBounds(212, 130, 136, 52);
    	add(btnNewButton);

    	
    	//LEHENENGO BOTOIA.URA
    	btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    	btnNewButton.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent arg0) {
   			 kont=0;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=1.50;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnNewButton);
    	btnKolaFreskagarriak.setBounds(164, 224, 184, 45);
    	
    	//BIGARREN BOTOIA.KOLA
    	btnKolaFreskagarriak.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    	btnKolaFreskagarriak.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 kont=1;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=2;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnKolaFreskagarriak);
    	btnLaranjaFreskagarriak.setBounds(155, 330, 193, 45);
    	
    	//HIRUGARREN BOTOIA.LARANAJA
    	btnLaranjaFreskagarriak.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    	btnLaranjaFreskagarriak.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 kont=2;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=2;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnLaranjaFreskagarriak);
    	btnLimoiFreskagarriak.setBounds(164, 438, 181, 45);
    	
    	//LAUGARREN BOTOIA.LIMOI
    	btnLimoiFreskagarriak.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    	btnLimoiFreskagarriak.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 kont=3;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=2;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnLimoiFreskagarriak);
    	btnTeIzoztua.setBounds(544, 106, 144, 52);
    	
    	//BOSTGARREN BOTOIA.TE
    	btnTeIzoztua.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    	btnTeIzoztua.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 kont=4;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=1.80;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnTeIzoztua);
    	btnTxokolatezkoBarritak.setBounds(495, 313, 193, 44);
    	
    	//SEIGARREN BOTOIA.TXOKOLATEA
    	btnTxokolatezkoBarritak.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
    	btnTxokolatezkoBarritak.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 kont=5;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=1.50;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnTxokolatezkoBarritak);
    	btnToblerone.setBounds(567, 210, 121, 45);
    	
    	//ZAZPIGARREN BOTOIA.TOBLERONEA
    	btnToblerone.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    	btnToblerone.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 kont=6;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=2;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnToblerone);
    	btnFruituLehorrak.setBounds(532, 417, 156, 44);
    	
    	//ZORTZIGARREN BOTOIA.FRUITUAK
    	btnFruituLehorrak.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    	btnFruituLehorrak.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 kont=7;
   			 Zerrenda.listazenbatu(kont);
   			 
   			 prezioa=1;
   			 Zerrenda.prezioTotala(prezioa);
   		 }
    	});
    	add(btnFruituLehorrak);
    	btnJarraitu.setBounds(335, 523, 117, 46);

    	
    	//JARRAITU BOTOIA
    	btnJarraitu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
    	btnJarraitu.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent e) {
   			if(Frame.Ventana2.isVisible()){
                	Frame.Ventana3.setVisible(true);
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);           	 
            }
	   		Zerrenda.listaizenak();
	    	Zerrenda.zerrendaBete();
	    	String prezioa = String.valueOf(Zerrenda.dezimal.format(Zerrenda.preziototala));
	    	Frame.Ventana3.ordaintzeko_dirua.setText(prezioa); 
	    	Frame.Ventana3.zerrenda.setText(Zerrenda.zerrenda);
	    	if (Zerrenda.zerrenda=="") {
	    		Frame.Ventana3.jarraitu.setEnabled(false);
	    	}
   		 }
    	});
    	add(btnJarraitu);
   	 
   	 }
	}











