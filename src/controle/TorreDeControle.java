package controle;

import java.util.Scanner;

import entities.Aeroporto;
import voo.Trajeto;

public class TorreDeControle {

	private Integer id;
	private Integer numeroControladores;

	public TorreDeControle() {
		;
	}

	public TorreDeControle(Integer id, Integer numeroControladores) {
		this.id = id;
		this.numeroControladores = numeroControladores;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroControladores() {
		return numeroControladores;
	}

	public void setNumeroControladores(Integer numeroControladores) {
		this.numeroControladores = numeroControladores;
	}

	public void definirContexto(Scanner sc) {

		Aeroporto airport = new Aeroporto();
		Trajeto routes = new Trajeto();
		Radar radar = new Radar();

		Aeroporto[] aeroportos = airport.criaAeroportos();
		Trajeto[] trajetos = routes.criaTrajetos();
		Radar[] radares = radar.criaCondicoesClimaticas();

		int idAeroporto = definirAeroporto(aeroportos, sc);
		int idCondicaoClimatica = definirCondicaoClimatica(radares, sc);

	}

	public int definirAeroporto(Aeroporto[] aeroportos, Scanner sc) {

		System.out.println("****** Ol�, Controlador(a)!");
		
		System.out.println();
		System.out.println("****** Vamos definir as informa��es sobre o aeroporto.");
		System.out.println("****** Qual � o aeroporto em que voc� est�?");
		System.out.println();

		for (int i = 0; i < aeroportos.length; i++) {

			if (i < 9) {
				System.out.println("[0" + (i + 1) + "] - " + aeroportos[i].getNomeAeroporto());
			} else {
				System.out.println("[" + (i + 1) + "] - " + aeroportos[i].getNomeAeroporto());
			}

		}
		
		System.out.println();
		System.out.print("****** Digite sua escolha: ");
		int escolha = sc.nextInt();
		escolha -= 1;
		
		System.out.println("****** Op��o Escolhida => Aeroporto de ID [" + aeroportos[escolha].getId() + "]");
		System.out.println();

		System.out.println("****** O aeroporto em que voc� est� possui as seguintes caracter�sticas: ");
		System.out.println(aeroportos[escolha]);

		return escolha;

	}
	
	public int definirCondicaoClimatica(Radar[] radar, Scanner sc) {

		System.out.println();
		System.out.println("****** Agora vamos definir as informa��es sobre o clima.");
		System.out.println("****** Como est� o clima hoje?");
		System.out.println();

		for (int i = 0; i < radar.length; i++) {

			if (i < 9) {
				System.out.println("[0" + (i + 1) + "] - " + radar[i].getCondicaoClimatica());
			} else {
				System.out.println("[" + (i + 1) + "] - " + radar[i].getCondicaoClimatica());
			}

		}
		
		System.out.println();
		System.out.print("****** Digite sua escolha: ");
		int escolha = sc.nextInt();
		escolha -= 1;
		
		System.out.println("****** Op��o Escolhida => Clima [" + radar[escolha].getCondicaoClimatica() + "]");
		System.out.println();

		return escolha;

	}

}
