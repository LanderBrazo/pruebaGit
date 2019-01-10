package bigarrenErronka;
/**
 * 
 * @author Ander, Aintzane, Oier
 *
 */
public class Contador extends Thread {
   
	@Override
    public void run(){
		
    	for (int i=0;i<=5;i++) {
        	try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}	
    	}
    	Frame.Ventana1.setVisible(true);
        Frame.Ventana2.setVisible(false);
        Frame.Ventana3.setVisible(false);  
        Frame.Ventana4.setVisible(false);
        Frame.Ventana5.setVisible(false);
    }
    	
}