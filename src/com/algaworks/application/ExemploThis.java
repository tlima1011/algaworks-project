package com.algaworks.application;

import com.algaworks.domain.Carro;

public class ExemploThis {

	public static void main(String[] args) {
		
		Carro carro = new Carro(); 
		carro.setModelo("Palio");
		System.out.println("Modelo antes: " +carro.getModelo());
		
		carro.alterarModel("Civic");
		System.out.println("Modelo depois: " + carro.getModelo());

	}

}
