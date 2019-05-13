package Calculadora;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplicacionTest {

	@Test
	public void MultiplicacionEnteros() {
		System.out.println("Multiplicacion de enteros...");
		Multiplicacion s = new Multiplicacion(3, 2);
		assertTrue(s.multiplicar() == 6);
	}

	@Test
	public void MultiplicacionNegativos() {
		System.out.println("Multiplicacion de negativos...");
		Multiplicacion s = new Multiplicacion(-4, -6);
		assertTrue(s.multiplicar() == 24);
	}

	@Test
	public void MultiplicacionMixtos() {
		System.out.println("Multiplicacion de mixtos...");
		Multiplicacion s = new Multiplicacion(-4, +2);
		assertTrue(s.multiplicar() == -8);
	}

	public void MultiplicacionCero() {
		System.out.println("Multiplicacion por cero...");
		Multiplicacion s = new Multiplicacion(4, 0);
		assertTrue(s.multiplicar() == 0);
	}

}
