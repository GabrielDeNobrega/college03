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

		Aeroporto[] aeroportos = airport.criaAeroportos();
		Trajeto[] trajetos = routes.criaTrajetos();

		int idAeroporto = definirAeroporto(aeroportos, sc);

	}

	public int definirAeroporto(Aeroporto[] aeroportos, Scanner sc) {

		System.out.println("****** Ol�, Controlador(a)!");
		System.out.println("****** Vamos definir as informa��es sobre o aeroporto.");

		System.out.println();
		System.out.println("****** Qual � o aeroporto em que voc� est� ?");
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

}
