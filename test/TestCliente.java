import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCliente {

	@Test
	void testCliente() {
		Cliente cl1 = new Cliente("Alberto", "Perez", "C/ Bacalao, N 5, Alcorcon, Madrid, Espa�a", "98765645C", "6666666x", 45);
		Cliente cl2 = new Cliente("maria", "Garcia", "C/ Estropajo, N 3, 2� I, Madrid, Madrid, Espa�a", "45592116B", "6777777x", 29);
		Cliente cl3 = new Cliente("Raul", "Martnez", "C/ Barco, N 55, 1� D, Madrid, Madrid, Espa�a", "67983527M", "6888888x", 34);
		
		Assertions.assertEquals("Alberto", cl1.getNombre());
		Assertions.assertEquals("Garcia", cl2.getApellidos());
		Assertions.assertEquals("C/ Barco, N 55, 1� D, Madrid, Madrid, Espa�a", cl3.getDireccion());
		Assertions.assertEquals("98765645C", cl1.getNif());
		Assertions.assertEquals("6777777x", cl2.getTelefono());
		Assertions.assertEquals(34, cl3.getEdad());
		
		cl2.setNombre("Maria");
		cl3.setApellidos("Martinez");
		cl1.setDireccion("C/ Bacalao, N 8, Alcorcon, Madrid, Espa�a");
		cl2.setNif("45592117W");
		cl3.setTelefono("6988888x");
		cl1.setEdad(46);
		
		
		Assertions.assertEquals("Maria", cl2.getNombre());
		Assertions.assertEquals("Martinez", cl3.getApellidos());
		Assertions.assertEquals("C/ Bacalao, N 8, Alcorcon, Madrid, Espa�a", cl1.getDireccion());
		Assertions.assertEquals("45592117W", cl2.getNif());
		Assertions.assertEquals("6988888x", cl3.getTelefono());
		Assertions.assertEquals(46, cl1.getEdad());
	}

}
