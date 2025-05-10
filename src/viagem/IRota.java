package viagem;

import passageiro.Passageiro;

public interface IRota {
	void adicionarTrecho(Trecho trecho);
	void adicionarPassageiroAoTrecho(Passageiro passageiro, Trecho trecho);
	void exibirRelatorioPassageiros();

}
