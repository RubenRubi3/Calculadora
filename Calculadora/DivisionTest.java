package Calculadora;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void DivisionEnteros() {
		System.out.println("Division de enteros...");
		Division s = new Division(4, 2);
		assertTrue(s.dividir() == 2);
	}

	@Test
	public void DivisionNegativos() {
		System.out.println("Division de negativos...");
		Division s = new Division(-10, -5);
		assertTrue(s.dividir() == 2);
	}

	@Test
	public void DivisionMixtos() {
		System.out.println("Division de mixtos...");
		Division s = new Division(-8, +2);
		assertTrue(s.dividir() == -4);
	}

	public void DivisionCero() {
		System.out.println("Division por cero...");
		Division s = new Division(4, 0);
		assertTrue(s.dividir() == 0);
	}

}
