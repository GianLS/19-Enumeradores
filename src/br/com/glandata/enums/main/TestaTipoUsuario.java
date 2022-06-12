package br.com.glandata.enums.main;

import br.com.glandata.enums.PerfilUsuario;

public class TestaTipoUsuario {

	public static void main(String[] args) {
		PerfilUsuario perfilUsuario = PerfilUsuario.ADMIN;
		
		System.out.println(perfilUsuario.getDescricao());
	}

}
