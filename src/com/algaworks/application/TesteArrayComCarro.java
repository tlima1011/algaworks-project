package com.algaworks.application;

import java.util.Locale;
import java.util.Scanner;

import com.algaworks.domain.Carro;

public class TesteArrayComCarro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de carros: ");
		int qtde = sc.nextInt();

		Carro[] carros = new Carro[qtde];

		for (int i = 0; i < carros.length; i++) {
			carros[i] = new Carro();
			sc.nextLine();
			System.out.print("Fabricante automovel: ");
			String fabricante = sc.nextLine();
			System.out.print("Modelo do automovel: ");
			String modelo = sc.nextLine();
			System.out.print("Cor: ");
			String cor = sc.nextLine();
			System.out.print("Ano de fabricação: ");
			int ano = sc.nextInt();
			System.out.print("Tipo de Combustivel: ");
			sc.nextLine();
			String tipoCombustivel = sc.nextLine();
			// sc.nextLine();
			System.out.print("Valor do Mercado: ");
			double valorDeMercado = sc.nextDouble();
			carros[i].setFabricante(fabricante);
			carros[i].setModelo(modelo);
			carros[i].setCor(cor);
			carros[i].setAnoDeFabricacao(ano);
			carros[i].setTipoCombustivel(tipoCombustivel);
			carros[i].setValorDeMercado(valorDeMercado);
		}
		Carro c1 = new Carro(); 
		c1.dadosAutomoveis(carros); 
		
		
		sc.close();
	}
}
