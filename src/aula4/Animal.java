package aula4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Animal {
	private String nome, classe, familia;
	private int idade, caloria, forca;
	private boolean estado;

	public Animal() {
		this.nascer();

	}

	public void nascer() {
		nome = JOptionPane.showInputDialog("Nome: ");
		classe = JOptionPane.showInputDialog("Classe: ");
		familia = JOptionPane.showInputDialog("Familia: ");
		idade = 0;
		caloria = 10;
		forca = 10;
		estado = true;

	}

	public void morrer() {
		this.forca = 0;
		this.estado = false;
		JOptionPane.showMessageDialog(null, this.nome + " Morreu!");

	}

	public void comer() {
		if (estado && this.caloria <= 100 && this.forca >= 2) {
			this.caloria += 10;
			this.forca -= 2;
			JOptionPane.showMessageDialog(null, this.nome + " Comeu!");
		} else if (!estado) {
			JOptionPane.showMessageDialog(null, this.nome + " Morreu!");
		} else if (caloria >= 100) {
			JOptionPane.showMessageDialog(null, this.nome + " Esta Cheio!");
		} else {
			JOptionPane.showMessageDialog(null, this.nome + " Sem forca!");
		}
		JOptionPane.showMessageDialog(null, this.toString());
	}

	public void correr() {
		this.caloria -= 5;
		this.forca -= 5;
		JOptionPane.showMessageDialog(null, this.nome + " Correu!");

	}

	public void dormir() {
		this.forca += 10;
		this.caloria -= 2;
		JOptionPane.showMessageDialog(null, this.nome + " Dormiu!");
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", classe=" + classe + ", familia=" + familia + ", idade=" + idade
				+ ", caloria=" + caloria + ", forca=" + forca + ", estado=" + estado + "]";
	}

	// Para conseguir exibir apenas os atributos sem conseguir fazer a alteracao
	public String getNome() {
		return nome;
	}

	public String getClasse() {
		return classe;
	}

	public String getFamilia() {
		return familia;
	}

	public int getIdade() {
		return idade;
	}

	public int getCaloria() {
		return caloria;
	}

	public int getForca() {
		return forca;
	}

	public boolean isEstado() {
		return estado;
	}

}
