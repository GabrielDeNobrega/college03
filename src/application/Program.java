package application;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.entities.Airport;
import model.entities.Operator;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			Airport chosenAirport = null;
			Operator chosenOperator = null;

			UI.welcome();
			List<Airport> airports = UI.printAirports();

			while (chosenAirport == null) {
				chosenAirport = UI.selectAirport(sc, airports);
			}

			UI.printChosenAirport(chosenAirport);

			UI.welcomeOperator();

			List<Operator> operators = UI.printOperators(chosenAirport);

			while (chosenOperator == null) {
				chosenOperator = UI.selectOperator(sc, operators);
			}

			UI.printChosenOperator(chosenOperator);

		} catch (InputMismatchException e) {
			e.getMessage();
		}

	}

}
