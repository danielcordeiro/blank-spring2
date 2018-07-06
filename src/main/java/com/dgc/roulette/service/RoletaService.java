package com.dgc.roulette.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.dgc.roulette.domain.Numero;

public class RoletaService {

	static HashMap<Character, Integer> result = new HashMap<>();
	static HashMap<Integer, Integer> linha = new HashMap<>();
	static HashMap<Integer, Integer> coluna = new HashMap<>();
	static HashMap<Integer, Integer> x12 = new HashMap<>();
	static int count = 0;

	public static void main(String[] args) {
//		simula();
		String resultado = "";
		do {
			count++;
			printar("Resultado: ");
			Scanner scanner = new Scanner(System.in);
			resultado = scanner.nextLine();

			Integer randomInt = Integer.valueOf(resultado);

			System.out.println(gerarSugestao(randomInt));
		} while (!resultado.equals("99"));
	}

	public static void simula() {

		Random randomGenerator = new Random();
		int x = 250;
		for (int idx = 1; idx <= x; ++idx) {
			count++;
			int randomInt = randomGenerator.nextInt(37);

			printar(gerarSugestao(randomInt));

		}
	}

	private static Integer mediaInt(Integer integer, int x) {
		if (integer == null) {
			return 0;
		}
		Float media = (new Float(integer) / x) * 100;
		return media.intValue();
	}
	private static String media(Integer integer, int x) {
		if (integer == null) {
			return "0%";
		}
		Float media = (new Float(integer) / x) * 100;
		return media.intValue() + "%";
	}

	private static Integer adiciona1(HashMap<Character, Integer> objMap, char obj) {
		if (objMap.get(obj) != null) {
			return objMap.get(obj) + 1;
		}
		return 1;
	}

	private static Integer adiciona1(HashMap<Integer, Integer> objMap, int obj) {
		if (objMap.get(obj) != null) {
			return objMap.get(obj) + 1;
		}
		return 1;
	}

	private static List<Numero> gerarRoleta() {
		List<Numero> roleta = new ArrayList<Numero>();
		roleta.add(new Numero(0, '0', 0, 0, '0', Arrays.asList(1, 2, 37)));
		roleta.add(new Numero(37, '0', 0, 0, '0', Arrays.asList(0, 1, 2)));
		roleta.add(new Numero(1, 'R', 1, 1, 'O', Arrays.asList(0, 2, 4)));
		roleta.add(new Numero(2, 'B', 1, 2, 'E', Arrays.asList(0, 37, 1, 5, 3)));
		roleta.add(new Numero(3, 'R', 1, 3, 'O', Arrays.asList(37, 2, 6)));
		roleta.add(new Numero(4, 'B', 2, 1, 'E', Arrays.asList(1, 5, 7)));
		roleta.add(new Numero(5, 'R', 2, 2, 'O', Arrays.asList(2, 4, 6, 8)));
		roleta.add(new Numero(6, 'B', 2, 3, 'E', Arrays.asList(3, 5, 9)));
		roleta.add(new Numero(7, 'R', 3, 1, 'O', Arrays.asList(4, 8, 10)));
		roleta.add(new Numero(8, 'B', 3, 2, 'E', Arrays.asList(5, 7, 9, 11)));
		roleta.add(new Numero(9, 'R', 3, 3, 'O', Arrays.asList(6, 8, 12)));
		roleta.add(new Numero(10, 'B', 4, 1, 'E', Arrays.asList(7, 11, 13)));
		roleta.add(new Numero(11, 'B', 4, 2, 'O', Arrays.asList(8, 10, 12, 14)));
		roleta.add(new Numero(12, 'R', 4, 3, 'E', Arrays.asList(9, 11, 15)));
		roleta.add(new Numero(13, 'B', 5, 1, 'O', Arrays.asList(10, 14, 16)));
		roleta.add(new Numero(14, 'R', 5, 2, 'E', Arrays.asList(11, 13, 15, 17)));
		roleta.add(new Numero(15, 'B', 5, 3, 'O', Arrays.asList(12, 14, 18)));
		roleta.add(new Numero(16, 'R', 6, 1, 'E', Arrays.asList(13, 17, 19)));
		roleta.add(new Numero(17, 'B', 6, 2, 'O', Arrays.asList(14, 16, 18, 20)));
		roleta.add(new Numero(18, 'R', 6, 3, 'E', Arrays.asList(15, 17, 21)));
		roleta.add(new Numero(19, 'R', 7, 1, 'O', Arrays.asList(16, 20, 22)));
		roleta.add(new Numero(20, 'B', 7, 2, 'E', Arrays.asList(17, 19, 21, 23)));
		roleta.add(new Numero(21, 'R', 7, 3, 'O', Arrays.asList(18, 20, 24)));
		roleta.add(new Numero(22, 'B', 8, 1, 'E', Arrays.asList(19, 23, 25)));
		roleta.add(new Numero(23, 'R', 8, 2, 'O', Arrays.asList(20, 22, 24, 26)));
		roleta.add(new Numero(24, 'B', 8, 3, 'E', Arrays.asList(21, 23, 27)));
		roleta.add(new Numero(25, 'R', 9, 1, 'O', Arrays.asList(22, 26, 28)));
		roleta.add(new Numero(26, 'B', 9, 2, 'E', Arrays.asList(23, 25, 27, 29)));
		roleta.add(new Numero(27, 'R', 9, 3, 'O', Arrays.asList(24, 26, 30)));
		roleta.add(new Numero(28, 'B', 10, 1, 'E', Arrays.asList(25, 29, 31)));
		roleta.add(new Numero(29, 'B', 10, 2, 'O', Arrays.asList(26, 28, 30, 32)));
		roleta.add(new Numero(30, 'R', 10, 3, 'E', Arrays.asList(28, 29, 33)));
		roleta.add(new Numero(31, 'B', 11, 1, 'O', Arrays.asList(28, 32, 34)));
		roleta.add(new Numero(32, 'R', 11, 2, 'E', Arrays.asList(29, 31, 33, 35)));
		roleta.add(new Numero(33, 'B', 11, 3, 'O', Arrays.asList(30, 32, 36)));
		roleta.add(new Numero(34, 'R', 12, 1, 'E', Arrays.asList(31, 35)));
		roleta.add(new Numero(35, 'B', 12, 2, 'O', Arrays.asList(32, 34, 36)));
		roleta.add(new Numero(36, 'R', 12, 3, 'E', Arrays.asList(33, 35)));
		return roleta;
	}

	public static String gerarSugestao(Integer randomInt) {
		Float y = new Float(count);
		Numero randomNum = null;

		List<String> sugestaoLinha = new ArrayList<>();

		Float valZeroF = 27 + (y / 100);
		Float val2F = 45f;
		Float valColunaF = 27 + (y / 100);

		int valZero = valZeroF.intValue();
		int val2 = val2F.intValue();
		int valColuna = valColunaF.intValue();
		int valLinha = 5;

		List<Numero> numeros = gerarRoleta();

		for (Numero numero : numeros) {
			if (numero.getNumero() == randomInt) {
				randomNum = numero;
				break;
			}
		}

		result.put(randomNum.getCor(), adiciona1(result, randomNum.getCor()));
		result.put(randomNum.getEvenOdd(), adiciona1(result, randomNum.getEvenOdd()));
		linha.put(randomNum.getLinha(), adiciona1(linha, randomNum.getLinha()));
		coluna.put(randomNum.getColuna(), adiciona1(coluna, randomNum.getColuna()));
		x12.put(randomNum.getX12(), adiciona1(x12, randomNum.getX12()));

		printar("Zero: " + media(result.get('0'), count));
		printar("-----");

		printar("Red: " + media(result.get('R'), count));
		printar("Black: " + media(result.get('B'), count));
		printar("-----");

		printar("Even: " + media(result.get('E'), count));
		printar("Odd: " + media(result.get('O'), count));
		printar("-----");

		printar("Coluna 1: " + media(coluna.get(1), count));
		printar("Coluna 2: " + media(coluna.get(2), count));
		printar("Coluna 3: " + media(coluna.get(3), count));
		printar("-----");

		printar("1 a 12: " + media(x12.get(1), count));
		printar("13 a 24: " + media(x12.get(2), count));
		printar("25 a 36: " + media(x12.get(3), count));
		printar("-----");

		for (int idx = 1; idx <= 12; ++idx) {
			Integer lx = mediaInt(linha.get(idx), count);
			if (lx < valLinha && count >= 24) {
				sugestaoLinha.add("Linha " + idx + ": " + lx +"%");
			}

			printar("Linha " + idx + ": " + lx+"%");
		}
		printar("-----");
		printar("-----");
		StringBuilder builder = new StringBuilder();
		builder.append("Ultimo: " + randomNum.getNumero() + ", " + randomNum.getCor() + ", Coluna: " + randomNum.getColuna());
		builder.append("\n");
		builder.append("Sugestão: ");
		builder.append("\n");
		if (count >= valZero && mediaInt(result.get('0'), count) == 0) {
			builder.append("0/00");
			builder.append("\n");
		} else {
			if (mediaInt(result.get('R'), count) <= val2) {
				builder.append("RED " + media(result.get('R'), count));
				builder.append("\n");
			}
			if (mediaInt(result.get('B'), count) <= val2) {
				builder.append("BLACK " + media(result.get('B'), count));
				builder.append("\n");
			}
			if (mediaInt(result.get('E'), count) <= val2) {
				builder.append("EVEN " + media(result.get('E'), count));
				builder.append("\n");
			}
			if (mediaInt(result.get('O'), count) <= val2) {
				builder.append("ODD " + media(result.get('O'), count));
				builder.append("\n");
			}
		}
		if (mediaInt(coluna.get(1), count) <= valColuna) {
			builder.append("COLUNA 1 " + media(coluna.get(1), count));
			builder.append("\n");
		}
		if (mediaInt(coluna.get(2), count) <= valColuna) {
			builder.append("COLUNA 2 " + media(coluna.get(2), count));
			builder.append("\n");
		}
		if (mediaInt(coluna.get(3), count) <= valColuna) {
			builder.append("COLUNA 3 " + media(coluna.get(3), count));
			builder.append("\n");
		}
		if (mediaInt(x12.get(1), count) <= valColuna) {
			builder.append("1 a 12");
			builder.append("\n");
		}
		if (mediaInt(x12.get(2), count) <= valColuna) {
			builder.append("13 a 24");
			builder.append("\n");
		}
		if (mediaInt(x12.get(3), count) <= valColuna) {
			builder.append("25 a 36");
			builder.append("\n");
		}
		for (String sugestao : sugestaoLinha) {
			builder.append(sugestao);
			builder.append("\n");
		}
		return builder.toString();
	}
	
	private static void printar(String texto) {
		System.out.println(texto);
	}

}
