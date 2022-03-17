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
		char telefone [] = new char[qtdClinente];
		int tipo [] = new int[qtdClinente];
		int minut [] = new int[qtdClinente];
		double valorConta [] = new double[qtdClinente];
		double precoBasico = 0;
		double precoExcedente = 0;

		for(int i = 0; i < qtdClinente; i++) {
			countClinte++;
			System.out.println("Dados do " + countClinte + "º Cliente: ");
			System.out.println("NOME: ");
			nome[i] = sc.next();
			System.out.println("TELEFONE: ");
			telefone[i] = sc.next(). charAt(0);
			System.out.println("TIPO: ");
			tipo[i] = sc.nextInt();
			System.out.println("MINUTOS: ");
			minut[i] = sc.nextInt();
		}

		System.out.println("Informe o preço basico e excedente de cada tipo de conta: ");

		double tipoAssinatura [][] = new double[3][2]; 

		for(int i = 0; i < 3; i++) {
			System.out.println("TIPO "+ i + " :");
			for(int j = 0; j < 2; j++) {
				tipoAssinatura[i][j] = sc.nextDouble();
			}
		}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				if(j == 0) {
					precoBasico = tipoAssinatura[i][j];
				}
				else if(j == 1 ) {
					precoExcedente = tipoAssinatura[i][j];
				}
			}
		}
		


		sc.close();

	}

}
