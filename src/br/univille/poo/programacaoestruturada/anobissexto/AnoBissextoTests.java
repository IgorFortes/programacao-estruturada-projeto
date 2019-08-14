package br.univille.poo.programacaoestruturada.anobissexto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnoBissextoTests {
	
	@Test
	public void anoNegativo() {
		boolean resultado = AnoBissexto.AnoBissexto(-10);
		assertEquals("Ano negativo nao pode ser bissexto",false,resultado);
	}

}
