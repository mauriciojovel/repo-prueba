package com.creativa.dummy.data.generator;

import java.util.Random;

public class IntegerDummyGenerator {
	/**
	 * Genera un numero aleatorio.
	 * aleatorio
	 * @param size tama&ntilde; del numero.
	 * @return
	 */
	public static String generate(int size) {
		int i = 0;
		String s = "";
		Random rand = new Random(System.currentTimeMillis());
		
		for(i = 0; i < size; i++) {
			s += rand.nextInt(9);
		}
		return s;
	}
}
