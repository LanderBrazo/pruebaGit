package bigarrenErronka;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author Mañana
 *
 */
class MetodoakTest {
	
	@Test
	public void metodoakKoprobatu() {
	assertEquals(Metodoak.konprobatuLetra("1"),(false));
	assertEquals(Metodoak.konprobatuLetra("dfsdfs"),(true));
	assertEquals(Metodoak.konprobatuNegatibo(2),(true));
	assertEquals(Metodoak.konprobatuNegatibo(-1),(false));
	assertEquals(Metodoak.kanbioMetodoa(388.88),(""));
	}
	
}



