package Calculadora;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Entornos1.Suma;

public class SumaTest {

	@Test
	public void sumaEnteros() {
		System.out.println("Suma de enteros...");
		Suma s = new Suma(2, 3);
		assertTrue(s.sumar() == 5);
	}

	@Test
	public void sumaNegativos() {
		System.out.println("Suma de negativos...");
		Suma s = new Suma(-2, -3);
		assertTrue(s.sumar() == -5);
	}

	@Test
	public void sumaMixtos() {
		System.out.println("Suma de mixtos...");
		Suma s = new Suma(-2, +3);
		assertTrue(s.sumar() == 1);
	}

}
