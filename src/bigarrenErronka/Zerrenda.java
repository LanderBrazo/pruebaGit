package bigarrenErronka;

import java.text.DecimalFormat;
/**
 * 
 * @author Ander, Aintzane, Oier
 *
 */
public class Zerrenda {
	
	/**
	 * Hurrengo metodoetan erabiliko diren bariable eta arrayak.
	 */
	static int []listazenbatu= new int[8];// listaizenak()
	static String []listaizenak= new String[8];//listazenbatu()
	static String zerrenda="";//zerrendaBete()
	static double preziototala;//prezioTotala()
	static DecimalFormat dezimal = new DecimalFormat("#.00");//koma ondoren bi zenbaki agertzeko.
	/**
	 * LEHENENGO METODOA. Produktuen izenak gordetzen ditu.
	 * @return
	 */
	public static String[] listaizenak() {
		
		listaizenak[0]="Ura";
		listaizenak[1]="Kola";
		listaizenak[2]="Laranja zukua";
		listaizenak[3]="Limoi zukua";
		listaizenak[4]="Te";
		listaizenak[5]="Barrita";
		listaizenak[6]="Toblerone";
		listaizenak[7]="Fruitu lehorrak";
		
		return listaizenak;
	}
	/**
	 * BIGARREN METODOA.Produktuen kantitateak gordetzen ditu.
	 * @param kont
	 */
	public static void listazenbatu(int kont) {

		for (int i=0;i<=kont;i++) {
			if (i==kont)
				listazenbatu[kont]=listazenbatu[kont]+1;
		}
	
	}
	/**
	 * HIRUGARREN METODOA.Produktuak eta kantitateak 
	 * string batean gordetzen ditu.
	 * @return
	 */
	public static String zerrendaBete() {
		
		for (int i=0;i<listazenbatu.length;i++) {
			if (listazenbatu[i]>0) {
				
				zerrenda=zerrenda+(listaizenak[i]+" x ");
				
				zerrenda=zerrenda+(listazenbatu[i]+" \n");
			}
		}
		
        return zerrenda;
	}
	
	/**
	 * LAUGARREN METODOA.
	 * @param produktu_prezioa
	 */
    public static void prezioTotala(double produktu_prezioa) {
    	
    	double bez=1.21;
    	produktu_prezioa=produktu_prezioa*bez;
    	preziototala=preziototala+produktu_prezioa;
    	
    	}
  
	}






