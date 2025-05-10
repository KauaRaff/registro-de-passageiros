package passageiro;

public class PassageiroNormal extends Passageiro {
	private double valorPassagem;
	
	public PassageiroNormal() {
		super();
		this.valorPassagem = 0.0;
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	@Override
	public void exibirInformacoesPassageiro() {
		System.out.println("Tipo: Normal");
		System.out.println("valor pago: R$ " + getValorPassagem());
	
		
	}

}
