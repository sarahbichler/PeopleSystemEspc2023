package tech.sarahbichler.appMain;

import tech.sarahbichler.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa novaPessoa01 = new Pessoa();
		Funcionario novoFunc01 = new Funcionario();
		Cliente novoCli01 = new Cliente();
		
		novoFunc01.cadastrar("D15","desenvolvedora", "sarah", "02/08/1994", "15000", "02/10/2023", "João Pessoa", "9999.999");
		novoCli01.cadastrar("C10", "publicitaria", "Vanessa", "14/07/1996", "aqui", "9999.999");
	}

}
