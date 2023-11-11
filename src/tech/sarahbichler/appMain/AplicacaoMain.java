package tech.sarahbichler.appMain;

import java.time.LocalDate;

import tech.sarahbichler.composicao.Endereco;
import tech.sarahbichler.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Cliente cli1 = new Cliente();
		Endereco end1 = new Endereco();
		LocalDate nascCli1 = LocalDate.of(2000, 12, 1);
		
		
		
		cli1.cadatrar(null, null, end1, null);
		cli1.cadatrar("5425", "vendedor", "eduardo", nascCli1, end1, "839999999");
	}

}
