package com.algaworks.application;

public class MainArray {

	public static void main(String[] args) {
		
		int [] notas = new int[4];
		
		/*notas[0] = 10; 
		notas[1] = 5; 
		notas[2] = 8;
		notas[3] = 9;
		notas[4] = 7;*/
		
		
		System.out.println("Quantidade de notas: " +notas.length);
		for(int i = 0; i < notas.length;i++) {
			System.out.println("Posição [" + i +"]: " +notas[i]);
		}
	}

}
