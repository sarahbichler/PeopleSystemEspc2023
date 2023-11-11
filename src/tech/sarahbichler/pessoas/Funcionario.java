package tech.sarahbichler.pessoas;

import java.time.LocalDate;

import tech.sarahbichler.composicao.Endereco;

public class Funcionario extends Pessoa{
	
		private int matricula;
		private String cargo;
		private double salario;
		private LocalDate dataAdmissao;
		
		public void cadatrar(int matricula, String cargo,
				double salario, LocalDate dataAdmissao,
				String nome, LocalDate dataNascimento,
				Endereco endereco, String telsContato) {
			this.matricula = matricula;
			this.cargo = cargo;
			this.salario = salario;
			this.dataAdmissao = dataAdmissao;
			cadatrar(nome, dataNascimento, endereco, telsContato);
		}
		
		public void reajustarSalario(double percentual) {
			double acrescimo = 1 + (percentual/100);
			this.salario = this.salario * acrescimo;
		}
		
		public void promover(String novoCargo) {
			this.cargo = novoCargo;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public LocalDate getDataAdmissao() {
			return dataAdmissao;
		}

		public void setDataAdmissao(LocalDate dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}

		public String getCargo() {
			return cargo;
		}

		public double getSalario() {
			return salario;
		}
		
		

	}