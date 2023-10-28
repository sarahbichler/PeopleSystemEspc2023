package tech.sarahbichler.pessoas;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String telsContato;
	
	public Pessoa() {
		
	}
	
		
	public void cadastrar(String nome, String dataNascimento, String endereco, String telsContato, String cargo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
		
	}
	
	public void cadastrar(String matricula, String cargo, 
			String salario, String dataAdmissao, String nome,
String dataNascimneto, String endereco, String telsContato) {
		this.nome = (nome);
		this.dataNascimento = (dataNascimento);
		this.endereco = (endereco);
		this.telsContato = (telsContato);
		
	}
	
	
	public int obterIdade() {
		int idade = 0;
		return idade;
	}
	
	public void reajustarSalario(double percentual) {
		double salario = 5000;
		salario = salario * percentual;
		
	}
	
	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelsContato() {
		return telsContato;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void setTelsContato(String telsContato) {
		this.telsContato = telsContato;
	}

		
}

