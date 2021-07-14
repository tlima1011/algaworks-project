package com.algaworks.domain;

import java.util.ArrayList;

public class Proprietario {
	
	private static int ultimoCodigo = 0;
	private Integer idProprietario; 
	private String nome; 
	private String cpf;
	private Integer idade; 
	private String lougradouro; 
	private String bairro;
	private String cidade;
	private String cnh;
	
	private ArrayList <Carro> carros = new ArrayList<>(); 
	
	public Proprietario() { 
		
	}

	public Proprietario(String nome, String cpf, Integer idade, String lougradouro,
			String bairro, String cidade, String cnh) {
		this.idProprietario = ++ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.lougradouro = lougradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cnh = cnh;
	}

	public Integer getIdProprietario() {
		return idProprietario;
	}

	/*public void setIdProprietario(Integer idProprietario) {
		this.idProprietario = idProprietario;
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}
	
	public void addCarros(Carro carro) {
		carros.add(carro);
	}
	public void removeComment(Carro carro) {
		carros.remove(carro);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Proprietário \n"); 
		sb.append("Id Proprietario: #" + idProprietario +"\n"); 
		sb.append("Nome: " + nome + "\n"); 
		sb.append("CPF #" + cpf  + "\n");
		sb.append("Idade: " + idade  + "\n"); 
		sb.append("Lougradouro: " + lougradouro  + "\n");  
		sb.append("Bairro: " + bairro + "\n"); 
		sb.append("Cidade: " + cidade + "\n"); 
		sb.append("CNH #"+ cnh + "\n"); 
		sb.append("==================================================\n");
		sb.append("	 Dados de Carros\n");
		sb.append("==================================================\n");
		for (Carro carro : carros) {
			sb.append("Fabricante: " +carro.getFabricante() + "\n"); 
			sb.append("Modelo: " +carro.getModelo() + "\n");
			sb.append("Ano: " +carro.getAnoDeFabricacao() + "\n"); 
			sb.append("Cor: " +carro.getCor() + "\n"); 
			sb.append("Combustivel: " +carro.getTipoCombustivel() + "\n"); 
		}
		sb.append("==================================================\n");
		return sb.toString(); 			
	}
}
