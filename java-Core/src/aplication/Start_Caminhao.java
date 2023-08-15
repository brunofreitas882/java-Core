package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Caminhao;

public class Start_Caminhao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual a marca do caminhão?: ");
		String marca = sc.next();
		
		System.out.println("Informe quantos eixos tem o caminhão: ");
		int eixos = sc.nextInt();
		
		System.out.println("Informe quantas toneladas o caminhão suporta: ");
		int toneladas = sc.nextInt();
		
		
		Caminhao cam1 = new Caminhao(marca, eixos, toneladas);
		
		System.out.println(marca + " - " + eixos + " - " + toneladas);
		
		sc.close();
	}

}
