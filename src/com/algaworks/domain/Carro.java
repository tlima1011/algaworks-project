package com.algaworks.domain;

public class Carro {
	
	private static int ultimoCodigo = 0;
	private int id; 
	private String fabricante; 
	private String modelo; 
	private String cor;
	private Integer anoDeFabricacao; 
	private String tipoCombustivel = "Total Flex"; 
	private Double valorDeMercado = 0.0; 
	boolean bicombustivel; 
	boolean parado = true; 
	
	private Proprietario dono = new Proprietario(); 
	
	public Carro() { 
		
	}
	
	public Carro(String fabricante, String modelo, String cor, Integer anoDeFabricacao, Double valorDeMercado, Proprietario dono) {
		this.id = ++ultimoCodigo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.valorDeMercado = valorDeMercado; 
		this.dono = dono;
	}

	public int getId() {
		return id;
	}

	/*private void setId(Integer id) {
		this.id = ultimoCodigo++;
	}*/
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Double getValorDeMercado() {
		return valorDeMercado;
	}

	public void setValorDeMercado(Double valorDeMercado) {
		this.valorDeMercado = valorDeMercado;
	}
	
	public Proprietario getDono() {
		return dono;
	}

	public void setDono(Proprietario dono) {
		this.dono = dono;
	}
	
	public void alterarModel(String modelo) {
		if(modelo != null) {
			this.modelo = modelo; 
		}
	}

	public void ligar() { 
		if(modelo == null) {
			return; 
		}
		System.out.println("Ligando o carro " +modelo);
	}
	
	
	public void andar() {
		System.out.println("Carro come?ando a andar com o carro " +modelo);
		this.parado = false; 
	}
	
	public void desligar() { 
		if(!parado) {
			System.out.println("Carro desligado");
		}
	}
		
	public void frear() {
		
	}
	
	public void dadosAutomoveis(Carro [] carros) { 
		double soma = 0.0; 
		for(int i = 0; i < carros.length;i++) {
			System.out.println("==============================");
			System.out.printf("Dados do %d? autom?vel:\n", (i+1));
			System.out.println("==============================");
			System.out.println("Fabricante: " +carros[i].getFabricante());
			System.out.println("Modelo: " +carros[i].getModelo());
			System.out.println("Cor: " + carros[i].getCor());
			System.out.println("Ano Fabricacao: " +carros[i].getAnoDeFabricacao());
			System.out.println("Tipo de combustivel: " +carros[i].getTipoCombustivel());
			System.out.println("Valor de mercado R$" +String.format("%.2f", carros[i].getValorDeMercado()));
			soma += carros[i].getValorDeMercado();
			System.out.println();
		}
		System.out.println("Valor total R$" +String.format("%.2f", soma));
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Carro\n"); 
		sb.append("Id: " + id +"\n"); 
		sb.append("Fabricante: " + fabricante +"\n"); 
		sb.append("Modelo: " + modelo +"\n"); 
		sb.append("Cor: " + cor +"\n"); 
		sb.append("Combust?vel: " +tipoCombustivel +"\n");
		sb.append("Ano de Fabrica??o: " + anoDeFabricacao + "\n");
		sb.append("===============================\n");
		sb.append("Dono do Automovel: " +dono.getNome() + "\n");
		sb.append("CNH: " +dono.getCnh() + "\n"); 
		sb.append("===============================\n");
		return sb.toString(); 
	}
}
