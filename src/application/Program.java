package application;

import java.util.Scanner;

import controle.TorreDeControle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TorreDeControle tower = new TorreDeControle();

		tower.definirContexto(sc);
		
		sc.close();

	}

}
