package br.com.glandata.enums.main;

import br.com.glandata.enums.TipoAnimal;
import br.com.glandata.enums.models.Animal;

public class TestaAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setNome("Arara");
		animal.setTipo(TipoAnimal.AVE);
		
		System.out.println(animal);
	}

}
