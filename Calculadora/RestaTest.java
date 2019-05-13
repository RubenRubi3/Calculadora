package Calculadora;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Entornos1.Suma;

public class RestaTest {

	@Test
	public void restaEnteros() {
		System.out.println("Resta de enteros...");
		Resta s = new Resta(3, 2);
		assertTrue(s.restar() == 1);
	}

	@Test
	public void restaNegativos() {
		System.out.println("Resta de negativos...");
		Resta s = new Resta(-2, -3);
		assertTrue(s.restar() == 1);
	}

	@Test
	public void restaMixtos() {
		System.out.println("Resta de mixtos...");
		Resta s = new Resta(-2, +5);
		assertTrue(s.restar() == -7);
	}

}
