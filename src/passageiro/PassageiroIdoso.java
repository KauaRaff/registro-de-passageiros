package passageiro;

public class PassageiroIdoso extends Passageiro {
	private int idade;
	
	public PassageiroIdoso() {
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
		if(idade >= 65) {
			System.out.println("Gratuidade gerada na modalidade Idoso, pois o passageiro tem: " + getIdade() + " anos de idade.");
			
		} else {
			System.out.println("Infelizmente o passageiro não corresponde a idade mínima de 65 anos de idade para a gratuidade.");
		}
	}

	@Override
	public void exibirInformacoesPassageiro() {
		System.out.println("Tipo: Idoso");
		passagemGratuita();
	}

}
