package br.com.funcoes.git;

import java.util.Locale;
import java.util.Scanner;

public class exame {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Medida de Glicose: ");
		double valorGlicose = sc.nextDouble();
		
		String glicose = classificacaoGlicose(valorGlicose);
		showResult(glicose);
		
		System.out.print("Medida de Triglicerídeos: ");
		double valorTriglicer = sc.nextDouble();
		
		String triglicerideos = classificacaoTriglicerideos(valorTriglicer);
		showResult(triglicerideos);
		
		System.out.print("Medida de Colesterol: ");
		double valorColesterol = sc.nextDouble();
		
		String colesterol = classificacaoColesterol(valorColesterol);
		showResult(colesterol);
		
		sc.close();
	}
	
	public static String classificacaoGlicose(double valorGlic) {
		String classificacao = null;
		if(valorGlic <= 100) {
			 classificacao = "Normal";
		}
		else if(valorGlic <= 140) {
			 classificacao = "Elevado";
		}
		else if(valorGlic > 140) {
			 classificacao = "Diabetes";
		}
		return classificacao;
	}
	
	public static void showResult(String glicose) {
		System.out.print("Classificação: "+  glicose);
		System.out.println();
	}
	
	public static String classificacaoTriglicerideos(double valortrig) {
		String classificacao = null;
		if(valortrig <=200) {
			classificacao = "Desejável";
		}
		else if(valortrig > 200) {
			classificacao = "Aumentado";
		}
		return classificacao;
	}
	
	public static void showResult1(String triglicerideos  ) {
		System.out.print("Classificação: " + triglicerideos );
	}
	
	public static String classificacaoColesterol(double valorColest ) {
		String classificacao = null;
		if(valorColest <= 200) {
			 classificacao = "Desejavel";
		}
		else if(valorColest <= 240) {
			 classificacao = "Limiar";
		}
		else if(valorColest > 240) {
			 classificacao = "Elevado";
		}
		return classificacao;
	}
	
	public static void showResult2(String colesterol  ) {
		System.out.print("Classificação: " + colesterol  );
	}
}
