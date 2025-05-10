package viagem;

import java.util.ArrayList;
import java.util.List;
import passageiro.Passageiro;

public class Rota implements IRota{
	private List<Trecho> trechos;
	private List<ViagemPassageiro> passageirosTrecho;
	
	public Rota() {
		this.trechos = new ArrayList<>();
		this.passageirosTrecho = new ArrayList<>();
	}

	@Override
	public void adicionarTrecho(Trecho trecho) {
		trechos.add(trecho);
		
	}

	@Override
	public void adicionarPassageiroAoTrecho(Passageiro passageiro, Trecho trecho) {
		passageirosTrecho.add(new ViagemPassageiro(passageiro, trecho));
		
	}

	@Override
	public void exibirRelatorioPassageiros() {
		System.out.println("=== RELATÓRIO DE PASSAGEIROS POR TRECHO ===");
		for(ViagemPassageiro vp : passageirosTrecho) {
			System.out.println("Trecho: " + vp.getTrecho().getDescricaoTrecho());
			Passageiro p = vp.getPassageiro();
			System.out.println("Nome: " + p.getNome());
			p.exibirInformacoesPassageiro();
			System.out.println("----------------------------------------------------------");
		}
		
	}
	
	

}
