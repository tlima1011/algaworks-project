package com.algaworks.enums;

public enum TipoCombustivel {
	
	GASOLINA(1,"Gasolina"), 
	ALCOOL(2,"Alcool"), 
	HIBRIDO(3,"Híbrido"), 
	TOTALFLEX(4,"Total Flex"); 
	
	private int cod; 
	private String descricao; 
	
	private TipoCombustivel(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static TipoCombustivel toEnum(Integer cod) {
		if(cod == null) {
			return null; 
		}
		for(TipoCombustivel x : TipoCombustivel.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id: Inválido: " +cod);
	}
}
