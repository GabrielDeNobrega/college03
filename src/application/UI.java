package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.MainController;
import model.entities.Airport;
import model.entities.Bigger;
import model.entities.FixedWing;
import model.entities.Flight;
import model.entities.Operator;
import model.enums.CapacityStatus;
import model.enums.WeatherCondition;

public class UI {

	final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void welcome() {
		System.out.println("*** Bem-Vindo Operador ***");
		System.out.println("*** Selecine o aeroporto no qual se encontra! ***");

	}

	public static List<Airport> printAirports() {
		int counter = 0;
		MainController control = new MainController();

		List<Airport> airports = control.createAirports();

		System.out.println();
		for (Airport airport : airports) {
			counter++;
			System.out.println("[" + counter + "] - " + airport);
		}

		return airports;

	}

	public static Airport selectAirport(Scanner sc, List<Airport> airports) {

		Integer id = sc.nextInt();

		for (Airport airport : airports) {
			if (id == airport.getId()) {
				return airport;
			}
		}
		return null;

	}

	public static void printChosenAirport(Airport chosenAirport) {

		System.out.println("Aeroporto Selecionado: " + chosenAirport);

	}

	public static void welcomeOperator() {
		System.out.println();
		System.out.println("*** Escolha qual operador você é! ***");

	}

	public static List<Operator> printOperators(Airport chosenAirport) {
		int counter = 0;
		int secondaryCounter = 0;
		List<Operator> operators = chosenAirport.getControlTower().getOperators();
		List<Operator> operatorsLimited = new ArrayList<>();

		for (Operator operator : operators) {
			counter++;
			if (counter > 5) {
				break;
			}
			operatorsLimited.add(operator);
		}

		System.out.println();
		for (Operator operator : operatorsLimited) {
			secondaryCounter++;
			System.out.println("[" + secondaryCounter + "] - " + operator);
		}

		return operatorsLimited;
	}

	public static Operator selectOperator(Scanner sc, List<Operator> operators) {

		Integer id = sc.nextInt();

		for (Operator operator : operators) {
			if (id == operator.getId()) {
				return operator;
			}
		}
		return null;

	}

	public static void printChosenOperator(Operator chosenOperator) {

		System.out.println("Operador(a) Selecionado: " + chosenOperator);

	}

	public static void printCurrentSituation(Airport airport) {

		LocalDate today = LocalDate.now();

		System.out.println();
		System.out.println("*** Situação Atual do Aeroporto ***");
		System.out.println();
		String weather = airport.getControlTower().getRadar().getCurrentWeather().toString();
		System.out.println("Clima Atual: " + weather);
		String ocupation = airport.getCurrentCapacity().toString();
		System.out.println("Ocupação Atual: " + ocupation);
		System.out.println("Data Atual: " + dtf.format(today));

	}

	public static void firstLandingRequest(Operator operator) {

		System.out.println();
		System.out.println("Ok, " + operator.getName() + ", há um piloto solicitando pouso!");
		System.out.println("Vamos ajudá-lo.");

	}

	public static void printLandingPlane(Airport chosenAirport) {

		MainController control = new MainController();

		List<Flight> flights = control.createFlights(chosenAirport);

		System.out.println();
		System.out.println("*** Voo Solicitando Pouso ***");
		System.out.println("Id: " + flights.get(0).getId());
		System.out.println("Status: " + flights.get(0).getFlightStatus());
		System.out.println("Route: " + flights.get(0).getRoute().getOrigin() + " ----> "
				+ flights.get(0).getRoute().getDestination());

		if (flights.get(0).getAirship() instanceof FixedWing) {
			System.out.println("Aeronave: Asa Fixa");
		} else {
			System.out.println("Aeronave: Helicóptero");
		}

	}

	public static void printLandingInstructions(Airport chosenAirport) {

		MainController control = new MainController();

		System.out.println();
		System.out.println("*** Instruções de Pouso ***");

		WeatherCondition weather = chosenAirport.getControlTower().getRadar().getCurrentWeather();

		if (weather == WeatherCondition.CLEAR) {

			System.out.println("Pouse na Pista: " + chosenAirport.getRunways().get(1));

		} else if (weather == WeatherCondition.FOGGY) {

			System.out.println("Pouse na Pista: " + chosenAirport.getRunways().get(0));

		} else {

			System.out.println("Pouse na Pista: " + chosenAirport.getRunways().get(0));

		}

		chosenAirport.setCurrentCapacity(CapacityStatus.HAS_SPACE);

	}

}
