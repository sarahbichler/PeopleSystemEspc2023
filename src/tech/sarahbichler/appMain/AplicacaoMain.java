package tech.sarahbichler.appMain;

import java.time.LocalDate;


import tech.sarahbichler.composicao.Endereco;
import tech.sarahbichler.composicao.Telefone;
import tech.sarahbichler.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.sarahbichler.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {
//		Funcionario objNovofunc01 = new Funcionario();
//		Cliente objNovoCli01 = new Cliente();
//		Endereco objEndCli01 = new Endereco();
//		LocalDate dataNasc01 = LocalDate.of(2000, 12, 1);
		
//		objEndCli01.cadastrarEnd("A rua", "O número", "O Cep", "A cidade", "O Estado", "O País");
//		objNovofunc01.cadastrar(01, "Prof", 15, "02/02/2022", "Dias", "18/09/1986", "Aqui", "99999999");
//		objNovoCli01.cadastrar("C01", "Lider da Projecta", "Junio", LocalDate.of(2000, 12, 1),
//			objEndCli01, "9191981981981981");
		
		
//		objNovoCli01.getNome();
//		objNovoCli01.getCodigo();
//		objNovoCli01.getEndereco().getCep();
//		objNovoCli01.obterIdade();
		
		
		
			ListaDeTelefonesNaoOrdenados minhaLista = new ListaDeTelefonesNaoOrdenados();
		
		Telefone telefone1 = new Telefone("11", "1234-5678");
		Telefone telefone2 = new Telefone("22", "9694-6198");
		Telefone telefone3 = new Telefone("33", "5847-2314");
		
		
//			MinhaLista.addTelefone(telefone1);
//			MinhaLista.addTelefone(telefone2);
//			MinhaLista.addTelefone(telefone3);
		
		System.out.println("Telefone antes da remoção:");
		minhaLista.exibirTelefones();
		
		// Remover o telefone2
		minhaLista.exibirTelefones();
		
		// Exibe os telefones se a lista não estiver vazia 
		if (!minhaLista.isEmpty()) {
			System.out.println("Telefone na lista");
			minhaLista.exibirTelefones();
		} else {
			System.out.println("A lista de telefones está vazia.");
		}
		
		
	}

}
