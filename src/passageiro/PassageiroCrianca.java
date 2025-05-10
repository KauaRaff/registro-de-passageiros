package passageiro;

public class PassageiroCrianca extends Passageiro {
	private int idade;
	
	public PassageiroCrianca() {
		super();
		this.idade = 0;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public void passagemGratuita() {
		if(idade <= 5) {
			System.out.println("Gratuidade gerada na modalidade criança, pois a criança tem: " + getIdade() + " anos de idade.");
		} else {
			System.out.println("Infelizmente o passageiro não corresponde a idadade entre 1 mês a 5 anos de idade para a gratuidade.");

		}
		
	}

	@Override
	public void exibirInformacoesPassageiro() {
		System.out.println("Tipo: Criança");
		passagemGratuita();
		
	}

}
