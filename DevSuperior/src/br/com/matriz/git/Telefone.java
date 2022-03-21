package br.com.matriz.git;

import java.util.Locale;
import java.util.Scanner;

public class Telefone {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdClinente = 0;
		int countClinte = 0;

		System.out.print("Informe a quantidade de Clientes: ");
		qtdClinente = sc.nextInt();

		String nome [] = new String[qtdClinente];
		int telefone [] = new int[qtdClinente];
		int tipoConta [] = new int[qtdClinente];
		int minut [] = new int[qtdClinente];
		double valorConta [] = new double[qtdClinente];
		double precoBasico = 0;
		double precoExcedente = 0;

		for(int i = 0; i < qtdClinente; i++) {
			countClinte++;
			System.out.println("Dados do " + countClinte + "º Cliente: ");
			System.out.print("NOME: ");
			nome[i] = sc.next();
			System.out.print("TELEFONE: ");
			telefone[i] = sc.nextInt();
			System.out.print("TIPO: ");
			tipoConta[i] = sc.nextInt();
			System.out.print("MINUTOS: ");
			minut[i] = sc.nextInt();
		}

		System.out.println("Informe o preço basico e excedente de cada tipo de conta: ");

		double tipoAssinatura [][] = new double[3][2]; 

//		for(int i = 0; i < 3; i++) { // tipo de conta (linha) 0, 1, 2
//			System.out.println("TIPO "+ i + " :");
//			for(int j = 0; j < 2; j++) {
//				// coluna 0 preço basico
//				// coluna 1 preço excedido
//				tipoAssinatura[i][j] = sc.nextDouble();
//			}
//		}

		for (int i = 0; i < 3; i++) {
			System.out.printf("Tipo %d%s\n", i, ":");

			for (int j = 0; j < 2; j++) {
				tipoAssinatura[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < qtdClinente; i++) {

			if (tipoConta[i] == 0) {

				valorConta[i] = minut[i] <= 90 ? tipoAssinatura[0][0]
						: tipoAssinatura[0][0] + ((minut[i] - 90) * tipoAssinatura[0][1]);

			}
			if (tipoConta[i] == 1) {
				valorConta[i] = minut[i] <= 90 ? tipoAssinatura[1][0]
						: tipoAssinatura[1][0] + ((minut[i] - 90) * tipoAssinatura[1][1]);

			}
			if (tipoConta[i] == 2) {
				valorConta[i] = minut[i] <= 90 ? tipoAssinatura[2][0]
						: tipoAssinatura[2][0] + ((minut[i] - 90) * tipoAssinatura[2][1]);

			}
			
			System.out.printf("%s, %d, Tipo: %d, Minutos: %d, Valor da conta = R$ %.2f\n ", nome[i], telefone[i], tipoConta[i], minut[i], valorConta[i]);

		}
		sc.close();

	}

}
