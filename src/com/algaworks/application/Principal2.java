package com.algaworks.application;

import java.util.Locale;

import com.algaworks.domain.Carro;
import com.algaworks.domain.Proprietario;

public class Principal2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Proprietario joao = new Proprietario(); 
		joao.setNome("João da Silva Astrogildo");
		joao.setCpf("2424242424");
		joao.setCnh("222222/888");
		joao.setIdade(24);
		joao.setLougradouro("Rua Pinheiro da veiga, 21");
		joao.setBairro("Centro");
		joao.setCidade("Uberlandia legal");
		
		Carro palio = new Carro(); 
		palio.setAnoDeFabricacao(2001);
		palio.setCor("Prata");
		palio.setTipoCombustivel("Gasolina");
		palio.setValorDeMercado(20000.00); 
		palio.setFabricante("Fiat");
		palio.setModelo("Palio"); 
		palio.setDono(joao); 
		
		Carro celta = new Carro(); 
		celta.setAnoDeFabricacao(2001);
		celta.setCor("Preto");
		//celta.setTipoCombustivel("Total Flex");
		celta.setValorDeMercado(10000.00); 
		celta.setFabricante("Chevrolet");
		celta.setModelo("Celta"); 
		celta.setDono(joao); 
		
		joao.addCarros(palio);
		joao.addCarros(celta);
		
		System.out.println(palio);
		System.out.println();
		System.out.println(celta);
		System.out.println();
		
		System.out.println(joao);
		
		palio.ligar(); 
		palio.andar(); 
		celta.ligar(); 
	}
}
