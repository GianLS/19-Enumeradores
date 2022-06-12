package br.com.glandata.enums;

public enum PerfilUsuario {
	USER(1, "Usu�rio", "Pode realizar consultas"), ADMIN(2, "Adminsitrador", "Pode parametrizar o sistema"),
	GER(3, "Gerente", "Pode lan�ar informa��es cr�ticas");

	PerfilUsuario(int codigo, String nome, String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	private int codigo;
	private String nome;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
}
