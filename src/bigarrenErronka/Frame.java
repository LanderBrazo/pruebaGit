package bigarrenErronka;

import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Frame extends JFrame {
      
	private static final long serialVersionUID = 1L;


		GridBagConstraints config = new GridBagConstraints();
   	 
   	 
    	static Ventana1 Ventana1 = new  Ventana1();
    	static Ventana2 Ventana2 = new  Ventana2();
    	static Ventana3 Ventana3 = new  Ventana3();    
    	static Ventana4 Ventana4 = new  Ventana4();    
    	static Ventana5 Ventana5 = new  Ventana5();    
   	 

    /**
     * Create the frame.
     */
    public Frame() {
    	setTitle("Makina Saltzailea");
    
    this.setSize(770,670);  
	this.setLocationRelativeTo(null);  
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	getContentPane().add(Ventana1);
	Ventana2.setVisible(false);
	getContentPane().add(Ventana2);
	Ventana3.setVisible(false);
	getContentPane().add(Ventana3);
	Ventana4.setVisible(false);
	getContentPane().add(Ventana4);
	Ventana5.setVisible(false);
	getContentPane().add(Ventana5);
	Ventana1.setBounds(0, 0, 750, 650);
	Ventana1.addMouseListener(new MouseAdapter() {
   	 @Override
   	 public void mouseClicked(MouseEvent arg0) {
   		 if(Ventana1.isVisible()){
       	 
        	Ventana2.setVisible(true);
        	Ventana3.setVisible(false);
        	Ventana4.setVisible(false);
        	Ventana5.setVisible(false);
        	Ventana1.setVisible(false);           	 
   	 
   		 }   	 
   		 
   	 }
	});
    
	//JPANEL2
	Ventana2.setBounds(0, 0, 750, 650);

	config.gridx=0;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;

	config.gridx=1;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;
    
  //JPANEL3
	Ventana3.setBounds(0, 0, 750, 650);

	config.gridx=0;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;

	config.gridx=1;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;
	 
  //JPANEL4
	
	Ventana4.setBounds(0, 0, 750, 650);
    
	config.gridx=0;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;

	config.gridx=1;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;
	
    
  //JPANEL5
	
	Ventana5.setBounds(0, 0, 750, 650);

	config.gridx=0;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;

	config.gridx=1;
	config.gridy=1;
	config.gridwidth=1;
	config.gridheight=1;
	config.ipadx=100;
	config.ipady=10;
	config.weighty=0.0;
	config.anchor=GridBagConstraints.CENTER;
	config.fill= GridBagConstraints.CENTER;
    }
    
}








