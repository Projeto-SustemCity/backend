package com.generation.sustemcity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotBlank (message = "Obrigatório")
	private String nome;
	
	@NotNull (message = "Obrigatório")
	private String usuario;
	
	@NotNull (message = "Obrigatório")
	private String foto;
	
	@NotNull (message = "Obrigatório")
	@Size (min = 8,message = "O minimo de caracteres deverá ser 8")
	private String senha;
	
	@NotNull(message = "Identifique qual tipo de usuário se enquadra")
	private String tipoUsuario;

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}