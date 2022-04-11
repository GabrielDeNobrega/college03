package application;

import entities.Aeroporto;

public class Program {

	public static void main(String[] args) {
		
		Aeroporto airport = new Aeroporto();
		
		Aeroporto[] aeroportos;
		aeroportos  = airport.criaAeroportos();
		
		for (Aeroporto aeroporto : aeroportos) {
			System.out.println(aeroporto);
		}
		
		



	}

}
