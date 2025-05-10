package viagem;

import passageiro.Passageiro;

public class ViagemPassageiro {
	
	private Passageiro passageiro;
	private Trecho trecho;
	
	public ViagemPassageiro(Passageiro passageiro, Trecho trecho) {
		this.passageiro = passageiro;
		this.trecho = trecho;
	}
	 
	public Passageiro getPassageiro() {
	        return passageiro;
	    }

	    public Trecho getTrecho() {
	        return trecho;
	    }

}
