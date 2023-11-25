package tech.sarahbichler.estruturas;

import tech.sarahbichler.composicao.Telefone;

public class ListaDeTelefonesNaoOrdenados {
	//Vetor de telefones onde criaremos nossa lista
	private Telefone[] telefones;
	//Controle do tamanho
	private int tamanho;
	//Capacidade inicial (pode ser alterada depois)
	private static final int CAPACIDADE_PADRAO = 10;
	int indexTel;
	
	//Construtor da lista
	public ListaDeTelefonesNaoOrdenados() {
		this.telefones = new Telefone[CAPACIDADE_PADRAO];
		this.tamanho = 0;
		indexTel = -1;
		
	}
	
	//Verificador de vazio
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	//Adicionar um telefone
	public void addTelefone(Telefone telefone) {
		//Lenght pega a capacidade atual em tempo de execução, 
		//Caso a CAPACIDADE PADRÃO seja alterada
		if(tamanho < telefones.length) {
			//o tamanho já é o "index + 1", portando iremos usar o tamanho para adicionar, depois  
			telefones[indexTel++] = telefone;
			indexTel = indexTel +1;
			this.tamanho = tamanho +1;
		}
		
		
	}
	
	public void removerTelefone(Telefone telefone) {
		int index = buscarTelefoneIndex(telefone);
		if(index != -1) {
			for (int i = index; i < tamanho; i++) {
				telefones[i] = telefones[i +1];

		}
		telefones[--tamanho] = null;
		
	}
	}
	
	private int buscarTelefoneIndex(Telefone telefone) {
		for(int i = 0; i < tamanho; i++) {
			if(telefones[i].equals(telefone)) {
				return i;
			}
		}	
		return -1;
		
	}
	
	
	public void exibirTelefones() {
		for(int i = 0; i < tamanho; i++) {
			System.out.println(telefones[i]);
		}
	}
	
}
