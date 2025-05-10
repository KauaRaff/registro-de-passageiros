package passageiro;

public abstract class Passageiro {
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	
	public Passageiro() {
		this.nome = "";
		this.cpf = "";
		this.rg = "";
		this.telefone = "";
		
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
    public abstract void exibirInformacoesPassageiro();

	

}
