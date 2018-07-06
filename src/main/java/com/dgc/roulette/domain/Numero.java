package com.dgc.roulette.domain;

import java.util.List;

public class Numero {

	private int numero;
	private char cor;
	private int linha;
	private int coluna;
	private char evenOdd;
	private List<Integer> vizinhos;
	private int menorMaior;
	private int x12;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getCor() {
		return cor;
	}

	public void setCor(char cor) {
		this.cor = cor;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public char getEvenOdd() {
		return evenOdd;
	}

	public void setEvenOdd(char evenOdd) {
		this.evenOdd = evenOdd;
	}

	public List<Integer> getVizinhos() {
		return vizinhos;
	}

	public void setVizinhos(List<Integer> vizinhos) {
		this.vizinhos = vizinhos;
	}

	public int getMenorMaior() {
		return menorMaior;
	}

	public void setMenorMaior(int menorMaior) {
		this.menorMaior = menorMaior;
	}

	public int getX12() {
		return x12;
	}

	public void setX12(int x12) {
		this.x12 = x12;
	}

	public Numero(int numero, char cor, int linha, int coluna, char evenOdd, List<Integer> vizinhos) {
		super();
		this.numero = numero;
		this.cor = cor;
		this.linha = linha;
		this.coluna = coluna;
		this.evenOdd = evenOdd;
		this.vizinhos = vizinhos;
		if (numero == 0 || numero == 37) {
			this.x12 = 0;
		} else if (numero <= 12) {
			this.x12 = 1;
		} else if (numero <= 24) {
			this.x12 = 2;
		} else {
			this.x12 = 3;
		}
	}

}
