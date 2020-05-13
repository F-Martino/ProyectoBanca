import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTarjeta {

	@Test
	void test() {
		Tarjeta t1 = new Tarjeta("6438-9345-6567", 350.8, 0);
		Tarjeta t2 = new Tarjeta("7443-0662-1123", 670.4, 3);
		Tarjeta t3 = new Tarjeta("1234-5678-9405", 150);
		
		Assertions.assertEquals("6438-9345-6567", t1.getNumeroTarjeta());
		Assertions.assertEquals(670.4, t2.getLimite());
		Assertions.assertEquals(3, t2.getNumeroUsos());
		Assertions.assertEquals(0, t3.getNumeroUsos());
		
		t2.setNumeroTarjeta("7443-0662-1173");
		t3.setLimite(200.7);
		t3.setNumeroUsos(14);
		t1.setNumeroUsos(8);
		
		Assertions.assertEquals("7443-0662-1173", t2.getNumeroTarjeta());
		Assertions.assertEquals(200.7, t3.getLimite());
		Assertions.assertEquals(14, t3.getNumeroUsos());
		Assertions.assertEquals(8, t1.getNumeroUsos());
	}

}
