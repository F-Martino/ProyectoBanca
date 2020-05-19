import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase de tests que comprueban los constructores, getters y setters de la clase Cuenta.
 * @author Fernando Martino
 *
 */
class TestCuenta {

	@Test
	void testCuenta() {
		ArrayList<Double> lista1 = new ArrayList<>();
		lista1.add(4500.0);
		ArrayList<Double> lista2 = new ArrayList<>();
		lista2.add(15000.0);
		lista2.add(30000.0);
		lista2.add(58000.3);
		ArrayList<Double> lista3 = new ArrayList<>();
		lista3.add(5000.0);
		lista3.add(2324.9);
		
		Cuenta c1 = new Cuenta("999-786-444", 4500.0, 900.0, "05/06/2015",lista1);
		Cuenta c2 = new Cuenta("456-027-722", 58000.3, 1200.0, "23/10/2012",lista2);
		Cuenta c3 = new Cuenta("123-005-556", 2324.9, 450.5, "18/02/2017",lista3);
		
		Assertions.assertEquals("999-786-444", c1.getNumeroCuenta());
		Assertions.assertEquals(58000.3, c2.getSaldo());
		Assertions.assertEquals(450.5, c3.getLimite());
		Assertions.assertEquals("05/06/2015", c1.getFechaApertura());
		Assertions.assertEquals(lista2, c2.getSaldoDoceMeses());
		
		ArrayList<Double> listaAux = new ArrayList<>();
		listaAux.add(5045.0);
		listaAux.add(2624.5);
		c3.setSaldoDoceMeses(listaAux);
		c2.setNumeroCuenta("456-127-722");
		c3.setSaldo(3672.89);
		c1.setLimite(915.0);
		c2.setFechaApertura("24/10/2012");
		
		Assertions.assertEquals("456-127-722", c2.getNumeroCuenta());
		Assertions.assertEquals(3672.89, c3.getSaldo());
		Assertions.assertEquals(915.0, c1.getLimite());
		Assertions.assertEquals("24/10/2012", c2.getFechaApertura());
		Assertions.assertEquals(listaAux, c3.getSaldoDoceMeses());
	
		ArrayList<Tarjeta> tarjetas1 = new ArrayList<>();
		ArrayList<Tarjeta> tarjetas2 = new ArrayList<>();
		ArrayList<Tarjeta> tarjetas3 = new ArrayList<>();
		Tarjeta t1 = new Tarjeta("6438-9345-6567", 350.8, 0);
		Tarjeta t2 = new Tarjeta("7443-0662-1123", 670.4, 3);
		Tarjeta t3 = new Tarjeta("1234-5678-9405", 150);
		Tarjeta t4 = new Tarjeta("1000-5000-9900", 250);
		tarjetas1.add(t1);
		tarjetas2.add(t2);
		tarjetas2.add(t3);
		tarjetas3.add(t4);
		
		ArrayList<Double> lista4 = new ArrayList<>();
		Cuenta c4 = new Cuenta("000-000-006", 10000, 500, "18/07/2017", lista4, tarjetas1);
		c3.setTarjetas(tarjetas2);
		c1.nuevaTarjeta(t4);
		
		Assertions.assertEquals(tarjetas1, c4.getTarjetas());
		Assertions.assertEquals(tarjetas2, c3.getTarjetas());
		Assertions.assertEquals(tarjetas3, c1.getTarjetas());
		
		c1.nuevoMes(6076.89);
		ArrayList<Double> listaAux2 = new ArrayList<>();
		listaAux2.add(4500.0);
		listaAux2.add(6076.89);
		Assertions.assertEquals(listaAux2, c1.getSaldoDoceMeses());
		
		Assertions.assertEquals((4500.0 + 6076.89) / 2, c1.saldoMedio());
		Assertions.assertEquals((15000.0 + 30000.0 + 58000.3) / 3, c2.saldoMedio());
		Assertions.assertEquals((5045.0 + 2624.5) / 2, c3.saldoMedio());
		
		//4
		c2.nuevoMes(60000.7);
		//5
		c2.nuevoMes(60001.7);
		//6
		c2.nuevoMes(60002.7);
		//7
		c2.nuevoMes(60003.7);
		//8
		c2.nuevoMes(60004.7);
		//9
		c2.nuevoMes(60005.7);
		//10
		c2.nuevoMes(60006.7);
		//11
		c2.nuevoMes(60006.7);
		//12
		c2.nuevoMes(60007.7);
		//13
		c2.nuevoMes(60008.7);
		
		ArrayList<Double> listaAux3 = new ArrayList<>();
		listaAux3.add(30000.0);
		listaAux3.add(58000.3);
		listaAux3.add(60000.7);
		listaAux3.add(60001.7);
		listaAux3.add(60002.7);
		listaAux3.add(60003.7);
		listaAux3.add(60004.7);
		listaAux3.add(60005.7);
		listaAux3.add(60006.7);
		listaAux3.add(60006.7);
		listaAux3.add(60007.7);
		listaAux3.add(60008.7);
		
		double sum = 30000.0 + 58000.3 + 60000.7 + 60001.7 +60002.7 + 60003.7 + 60004.7 + 60005.7 + 60006.7 + 60006.7 + 60007.7 + 60008.7;
		Assertions.assertEquals(listaAux3, c2.getSaldoDoceMeses());
		Assertions.assertEquals((sum) / 12, c2.saldoMedio());
	}

}
