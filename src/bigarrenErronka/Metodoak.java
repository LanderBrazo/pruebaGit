package bigarrenErronka;
import java.text.DecimalFormat;
/**
 * 
 *  @author Ander, Aintzane, Oier
 *
 */
public class Metodoak {
	/**
	 *LEHENGO METODOA. Letrak sartzen direnean 
	 *False agertuko da eta berriro galdetuko du.
	 * @param zbk
	 * @return
	 *
	 */
			public static boolean konprobatuLetra(String zbk) {
				boolean balidatu=false;

		        try {
		            Double.parseDouble(zbk);
		            balidatu = false;
		        } catch (NumberFormatException letra) {
		            balidatu = true;
		        }
		        return balidatu;
				}
		/**
		 * //BIGARREN METODOA.Zenbaki negatibo bat sartu duen
		 * konprobatzen du.
		 * @param zbk
		 * @return
		 */
			public static boolean konprobatuNegatibo(double zbk) {
					boolean balidatu=false;
				if (zbk>0)
					balidatu=true;
				return balidatu;
			}
		/**
		 *HIRUGARREN METODOA. Zenbat kanbio itzuli behar duen kalkulatzen du.
		 * @param zbk
		 * @return
		 */
			public static String kanbioMetodoa(double zbk) {
				
				
				double kanbio= zbk;

				int aldatzailea = (int) (kanbio*100); // int-a parentesisen artean dagoena, double-a int-a bihurtzen du
				int itzultzeko = aldatzailea;
				String kanbioa="";
				String pantailaratu="";
				//DEZIMALEN FORMATOA.
				DecimalFormat dezimal = new DecimalFormat("#.00");
				
				pantailaratu=(" Itzultzeko " + dezimal.format(kanbio) + " eman behar da.\n");
				kanbioa=kanbioa+pantailaratu;
		        // para cada moneda
		        if (itzultzeko >= 20000) {
		        	pantailaratu=("200€-ko billeteak: " + itzultzeko / 20000+" \n");
		            kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 20000;
		        }
		        if (itzultzeko >= 10000) {
		        	pantailaratu=("100€-ko billeteak: " + itzultzeko / 10000+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 10000;
		        }
		        if (itzultzeko >= 5000) {
		        	pantailaratu=("50€-ko billeteak: " + itzultzeko / 5000+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 5000;
		        }
		        if (itzultzeko >= 2000) {
		        	pantailaratu=("20€-ko billeteak: " + itzultzeko / 2000+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 2000;
		        }
		        if (itzultzeko >= 1000) {
		        	pantailaratu=("10€-ko billeteak: " + itzultzeko / 1000+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 1000;
		        }
		        if (itzultzeko >= 500) {
		        	pantailaratu=("5€-ko billeteak: " + itzultzeko / 500+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 500;
		        }
		        if (itzultzeko >= 200) {
		        	pantailaratu=("2€-ko txanponak: " + itzultzeko / 200+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 200;
		        }
		        if (itzultzeko >= 100) {
		        	pantailaratu=("1€-ko txanponak: " + itzultzeko / 100+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 100;
		        }
		        if (itzultzeko >= 50) {
		        	pantailaratu=("50 zentimoko txanponak: " + itzultzeko / 50+"\n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 50;
		        }
		        if (itzultzeko >= 20) {
		        	pantailaratu=("20 zentimoko txanponak: " + itzultzeko / 20+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 20;
		        }
		        if (itzultzeko >= 10) {
		        	pantailaratu=("10 zentimoko txanponak: " + itzultzeko / 10+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 10;
		        }
		        if (itzultzeko >= 5) {
		        	pantailaratu=("5 zentimoko txanponak: " + itzultzeko / 5+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 5;
		        }
		        if (itzultzeko >= 2) {
		        	pantailaratu=("2 zentimoko txanponak: " + itzultzeko / 2+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = itzultzeko % 2;
		        }
		        if (itzultzeko >= 1) {
		        	pantailaratu=("1 zentimoko txanponak: " + itzultzeko+" \n");
		        	kanbioa=kanbioa+pantailaratu;
		            itzultzeko = 0;
		        }
		        return kanbioa;
			}
			
		
			static double preziototala2=Zerrenda.preziototala;//ordaintzeko zenbat gelditzen den jakiteko
			/**
			 * 
			 * @param zbk
			 */
			//LAUGARREN METODOA.Preziototala2-ri guk sartutako dirua kentzen dio
			public static void diruKonprobaketa(double zbk) {
				
				preziototala2=preziototala2-zbk;
			}
			/**
			 * BOSTGARREN METODOA. Dirua falta den konprobaketa.
			 * @return
			 */
			
			public static boolean diruFalta() {

				boolean diru_falta=false;

				if (preziototala2>0) {
					diru_falta=true;
					
				}
				return diru_falta;
			}
			
			/**
			 *SEIGARREN METODOA.Bariableak erreseteatzen dira.
			 */
			public static void berriroHasieratu() {
				
				Zerrenda.preziototala=0;
				preziototala2=Zerrenda.preziototala;
				Zerrenda.listazenbatu[0]=0;
				Zerrenda.listazenbatu[1]=0;
				Zerrenda.listazenbatu[2]=0;
				Zerrenda.listazenbatu[3]=0;
				Zerrenda.listazenbatu[4]=0;
				Zerrenda.listazenbatu[5]=0;
				Zerrenda.listazenbatu[6]=0;
				Zerrenda.listazenbatu[7]=0;		
				
				Zerrenda.zerrenda="";
				
				Frame.Ventana3.jarraitu.setEnabled(true);
				Frame.Ventana4.balidatu.setEnabled(true);
				Frame.Ventana4.ezeztatu.setEnabled(true);
				Frame.Ventana4.kanbioak.setText("");
			}
}







