package com.rozembra.pamera.Cadastro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Dados {

	@NotEmpty(message = "Campo nome é obrigatório")
	@Size(min = 1, max = 100)
	private String nome;

	@NotEmpty(message = "Campo email é obrigatório")
	@Size(min = 1, max = 100)
	private String email;

	private long telefone;

	@NotNull(message = "Campo dataNasc é obrigatório.")
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private Date dataNasc;

	@NotEmpty(message = "Campo senha é obrigatório")
	private String senha;

	@NotEmpty(message = "Campo repetirSenha é obrigatório")
	private String repetirSenha;
	
	private String descricao;
	
	@Min(1)
	@Max(99)
	private int numero;
	
	@DecimalMin(value = "0.0", inclusive = true, message = "O valor deve ter exatamente duas casas decimais")
	private double peso;
	
	@DecimalMin(value = "0.00", inclusive = true, message = "O valor deve ter exatamente duas casas decimais")
	private double altura;
	
	private String genero;
	
	private List<String> interesses = new ArrayList<>();

	public Dados() {
		interesses.add("tecnologia");
		interesses.add("esportes");
		interesses.add("gastronomia");
		interesses.add("viagens");
		interesses.add("investimentos");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRepetirSenha() {
		return repetirSenha;
	}

	public void setRepetirSenha(String repetirSenha) {
		this.repetirSenha = repetirSenha;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<String> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}

}
