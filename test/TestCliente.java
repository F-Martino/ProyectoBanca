import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase de tests que comprueban los constructores, getters y setters de la clase Cliente.
 * @author Fernando
 *
 */
class TestCliente {

	@Test
	void testCliente() {
		Cliente cl1 = new Cliente("Alberto", "Perez", "C/ Bacalao, N 5, Alcorcon, Madrid, España", "98765645C", "6666666x", 45);
		Cliente cl2 = new Cliente("maria", "Garcia", "C/ Estropajo, N 3, 2º I, Madrid, Madrid, España", "45592116B", "6777777x", 29);
		Cliente cl3 = new Cliente("Raul", "Martnez", "C/ Barco, N 55, 1º D, Madrid, Madrid, España", "67983527M", "6888888x", 34);
		
		Assertions.assertEquals("Alberto", cl1.getNombre());
		Assertions.assertEquals("Garcia", cl2.getApellidos());
		Assertions.assertEquals("C/ Barco, N 55, 1º D, Madrid, Madrid, España", cl3.getDireccion());
		Assertions.assertEquals("98765645C", cl1.getNif());
		Assertions.assertEquals("6777777x", cl2.getTelefono());
		Assertions.assertEquals(34, cl3.getEdad());
		
		cl2.setNombre("Maria");
		cl3.setApellidos("Martinez");
		cl1.setDireccion("C/ Bacalao, N 8, Alcorcon, Madrid, España");
		cl2.setNif("45592117W");
		cl3.setTelefono("6988888x");
		cl1.setEdad(46);
		
		
		Assertions.assertEquals("Maria", cl2.getNombre());
		Assertions.assertEquals("Martinez", cl3.getApellidos());
		Assertions.assertEquals("C/ Bacalao, N 8, Alcorcon, Madrid, España", cl1.getDireccion());
		Assertions.assertEquals("45592117W", cl2.getNif());
		Assertions.assertEquals("6988888x", cl3.getTelefono());
		Assertions.assertEquals(46, cl1.getEdad());
		
		ArrayList<Cuenta> cuentas1 = new ArrayList<>();
		ArrayList<Cuenta> cuentas2 = new ArrayList<>();
		ArrayList<Cuenta> cuentas3 = new ArrayList<>();
		
		ArrayList<Double> lista1 = new ArrayList<>();
		lista1.add(4500.0);
		ArrayList<Double> lista2 = new ArrayList<>();
		lista2.add(15000.0);
		lista2.add(30000.0);
		lista2.add(58000.3);
		ArrayList<Double> lista3 = new ArrayList<>();
		lista3.add(5000.0);
		lista3.add(2324.9);
		
		Cuenta c1 = new Cuenta("999-786-444", 4500.0, 900.0, "05/06/2015", lista1);
		Cuenta c2 = new Cuenta("456-027-722", 58000.3, 1200.0, "23/10/2012", lista2);
		Cuenta c3 = new Cuenta("123-005-556", 2324.9, 450.5, "18/02/2017", lista3);
		cuentas1.add(c1);
		cuentas2.add(c2);
		cuentas2.add(c3);
		cuentas3.add(c3);
		
		Cliente cl4 = new Cliente("X", "Y", "Z", "T", "6", 54, cuentas1);
		cl2.setCuentas(cuentas2);
		cl3.nuevaCuenta(c3);
		
		Assertions.assertEquals(cuentas1, cl4.getCuentas());
		Assertions.assertEquals(cuentas2, cl2.getCuentas());
		Assertions.assertEquals(cuentas3, cl3.getCuentas());
	}

}
