package aula6;

public class FornecedorEmpresa extends Fornecedor {
	private String IE, CNPJ;

	public FornecedorEmpresa() {
		super();

	}

	public FornecedorEmpresa(String nome, String fone, String IE, String CNPJ) {
		super(nome, fone);
		this.CNPJ = CNPJ;
		this.IE = IE;

	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Override
	public String toString() {
		return super.toString()+"FornecedorEmpresa [IE=" + IE + ", CNPJ=" + CNPJ + "]";
	}

}
