package com.algaworks.application;

import com.algaworks.domain.Carro;
import com.algaworks.domain.Proprietario;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(); //Declaramos a variável 
		 // instanciamos a variável com objeto tipo carro
		c1.setFabricante("Fiat");
		c1.setModelo("Uno");
		c1.setCor("Vermelho");
		c1.setTipoCombustivel("Gasolina");
		c1.setAnoDeFabricacao(2021);
		
		Carro c2 = new Carro(); 
		c2.setFabricante("Volkswagen");
		c2.setModelo("Gol");
		c2.setCor("Preto");
		c2.setAnoDeFabricacao(2019);
		
		Carro c3 = new Carro(); 
		c3.setFabricante("Chevrolet");
		c3.setModelo("Celta");
		c3.setCor("Branco socado");
		c3.setAnoDeFabricacao(2000);
		
		Proprietario william = new Proprietario(); 
		william.setNome("William");
		william.setCnh("122121212");
		william.setIdade(22);
		william.setLougradouro("Rua Juarez xupeta, 3333");
		william.setCpf("333699888");
		
		william.addCarros(c1);
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c1.ligar();
	}
}
