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

		System.out.println("****** Olá, Controlador(a)!");
		System.out.println("****** Vamos definir as informações sobre o aeroporto.");

		System.out.println();
		System.out.println("****** Qual é o aeroporto em que você está ?");
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
		
		System.out.println("****** Opção Escolhida => Aeroporto de ID [" + aeroportos[escolha].getId() + "]");
		System.out.println();

		System.out.println("****** O aeroporto em que você está possui as seguintes características: ");
		System.out.println(aeroportos[escolha]);

		return escolha;

	}

}
