package viagem;

public class Trecho {
	private String origem;
	private String destino;
	private double distancia;
	
	public Trecho(String origem, String destino, double distancia) {
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
	}
	public Trecho() {
		
	}
	public String getOrigem() {
		return origem;
	}
	public String getDestino() {
		return destino;
	}
	public double getDistancia() {
		return distancia;
	}
	
	public String getDescricaoTrecho() {
		return origem + "->" + destino + " (" + distancia + "Km)";
	}

	
}
