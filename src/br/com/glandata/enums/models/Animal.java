package br.com.glandata.enums.models;

import br.com.glandata.enums.TipoAnimal;

public class Animal {
	private String nome;
	private TipoAnimal tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoAnimal getTipo() {
		return tipo;
	}

	public void setTipo(TipoAnimal tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [Nome = " + nome + ", Tipo = " + tipo + "]";
	}
}
