package aula6;

public class FornecedorPessoa extends Fornecedor{
	private String CPF, RG;

	public FornecedorPessoa() {
		super();
		
	}

	public FornecedorPessoa(String nome, String fone, String CPF, String RG) {
		super(nome, fone);
		this.CPF = CPF;
		this.RG = RG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	@Override
	public String toString() {
		return super.toString()+ " FornecedorPessoa [CPF=" + CPF + ", RG=" + RG + "]";
	}

	
	
	

}
