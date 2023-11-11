package tech.sarahbichler.pessoas;

import java.time.LocalDate;

import tech.sarahbichler.composicao.Endereco;

public class Cliente extends Pessoa{
	private String codigo;
	private String profissao;
	
	public void cadatrar(String codigo, String profissao,
			String nome, LocalDate dataNascimento,
			Endereco endereco, String telsContato) {
		this.codigo = codigo;
		this.profissao = profissao;
		cadatrar(nome, dataNascimento, endereco, telsContato);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}