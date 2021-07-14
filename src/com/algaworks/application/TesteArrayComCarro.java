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
		double soma = 0.0; 
		
		Carro [] carros = new Carro[qtde]; 
		
		for(int i = 0; i < carros.length;i++) {
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
			//sc.nextLine(); 
			System.out.print("Valor do Mercado: ");
			double valorDeMercado = sc.nextDouble();
			soma += valorDeMercado; 
			carros[i].setFabricante(fabricante);
			carros[i].setModelo(modelo);
			carros[i].setCor(cor);
			carros[i].setAnoDeFabricacao(ano);
			carros[i].setTipoCombustivel(tipoCombustivel);
			carros[i].setValorDeMercado(valorDeMercado);
		}
		
		for(int i = 0; i < carros.length;i++) {
			System.out.println("==============================");
			System.out.printf("Dados do %dº automóvel:\n", (i+1));
			System.out.println("==============================");
			System.out.println("Fabricante: " +carros[i].getFabricante());
			System.out.println("Modelo: " +carros[i].getModelo());
			System.out.println("Cor: " + carros[i].getCor());
			System.out.println("Ano Fabricacao: " +carros[i].getAnoDeFabricacao());
			System.out.println("Tipo de combustivel: " +carros[i].getTipoCombustivel());
			System.out.println("Valor de mercado R$" +String.format("%.2f", carros[i].getValorDeMercado()));
			System.out.println();
		}
		System.out.println("Valor total R$" +String.format("%.2f", soma));
			/*private String fabricante; 
			private String modelo; 
			private String cor;
			private Integer anoDeFabricacao; 
			private String tipoCombustivel = "Total Flex"; 
			private Double valorDeMercado = 0.0; */
		sc.close();
	}

}
