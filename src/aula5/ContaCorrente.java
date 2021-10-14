package aula5;

public class ContaCorrente {

	private String nrConta, agencia, banco;
	private int nrAgencia, nrBanco, tipo;
	private float saldo;

	public ContaCorrente(String nrConta, String agencia, String banco, int nrAgencia, int nrBanco, int tipo,
			float saldo) {
		super();
		this.nrConta = nrConta;
		this.agencia = agencia;
		this.banco = banco;
		this.nrAgencia = nrAgencia;
		this.nrBanco = nrBanco;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public void Encerrar() {
		if (getSaldo() >= 0) {
			this.tipo = 4; // Conta Encerrada
			System.out.println("Saldo Atual: " + getSaldo());
			this.saldo = 0;
		}
	}

	public void Creditar(float valor) {
		if (this.tipo == 4) {
			System.out.println("Erro! Conta está cancelada");
		} else {
			this.saldo += valor;
			System.out.println("Saldo Atual: " + getSaldo());
		}
	}
	
	public void Debitar(float valor) {
		if (this.tipo == 4) {
			System.out.println("Erro! Conta está cancelada");
		} else {
			this.saldo += valor;
			System.out.println("Saldo Atual: " + getSaldo());
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [nrConta=" + nrConta + ", agencia=" + agencia + ", banco=" + banco + ", nrAgencia="
				+ nrAgencia + ", nrBanco=" + nrBanco + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public int getNrBanco() {
		return nrBanco;
	}

	public void setNrBanco(int nrBanco) {
		this.nrBanco = nrBanco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

}
