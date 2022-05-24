package controller;

import java.util.ArrayList;
import java.util.List;

import model.entities.Airport;
import model.entities.Airship;
import model.entities.Bigger;
import model.entities.ControlTower;
import model.entities.FixedWing;
import model.entities.Flight;
import model.entities.Hangar;
import model.entities.MaintenanceHangar;
import model.entities.Operator;
import model.entities.ParkingHangar;
import model.entities.Radar;
import model.entities.Route;
import model.entities.Runway;
import model.entities.Smaller;
import model.entities.Terminal;
import model.enums.CapacityStatus;
import model.enums.FlightStatus;
import model.enums.WeatherCondition;

public class MainController {

	List<Airport> airports = new ArrayList<>();
	List<Operator> operators = new ArrayList<>();
	List<Terminal> terminals = new ArrayList<>();
	List<Runway> runways = new ArrayList<>();
	List<Hangar> hangars = new ArrayList<>();
	List<Airship> airships = new ArrayList<>();
	List<Flight> flights = new ArrayList<>();
	List<Route> routes = new ArrayList<>();

	public List<Airport> createAirports() {
		airports.add(new Airport(0001, "Guarulhos", 10, CapacityStatus.EMPTY,
				new ControlTower(0001, new Radar(0001, WeatherCondition.RAINY), createOperators()), null,
				createTerminals(), createRunways(), createHangars()));
		airports.add(new Airport(0002, "Congonhas", 5, CapacityStatus.EMPTY,
				new ControlTower(0002, new Radar(0002, WeatherCondition.CLEAR), createOperators()), null,
				createTerminals(), createRunways(), createHangars()));
		airports.add(new Airport(0003, "Viracopos", 12, CapacityStatus.EMPTY,
				new ControlTower(0003, new Radar(0003, WeatherCondition.FOGGY), createOperators()), null,
				createTerminals(), createRunways(), createHangars()));
		airports.add(new Airport(0004, "Santos Dumont", 6, CapacityStatus.EMPTY,
				new ControlTower(0004, new Radar(0004, WeatherCondition.CLEAR), createOperators()), null,
				createTerminals(), createRunways(), createHangars()));
		airports.add(new Airport(0005, "Galeão", 3, CapacityStatus.EMPTY,
				new ControlTower(0005, new Radar(0005, WeatherCondition.CLEAR), createOperators()), null,
				createTerminals(), createRunways(), createHangars()));

		return airports;

	}

	public List<Operator> createOperators() {
		operators.add(new Operator(0001, "Brendo"));
		operators.add(new Operator(0002, "Carlos"));
		operators.add(new Operator(0003, "Cathariny"));
		operators.add(new Operator(0004, "Caio"));
		operators.add(new Operator(0005, "Gabriel"));

		return operators;
	}

	public List<Terminal> createTerminals() {

		terminals.add(new Terminal(0001, 'A'));
		terminals.add(new Terminal(0002, 'B'));
		terminals.add(new Terminal(0003, 'C'));

		return terminals;
	}

	public List<Runway> createRunways() {

		runways.add(new Smaller(0001, 1500.00));
		runways.add(new Bigger(0002, 3000.00));

		return runways;
	}

	public List<Hangar> createHangars() {

		hangars.add(new MaintenanceHangar());
		hangars.add(new MaintenanceHangar());
		hangars.add(new ParkingHangar());

		return hangars;
	}

	public List<Airship> createAirships() {

		airships.add(new FixedWing(0001, "Wilson", 800.00, 679.00, 0001, 210, "Zenaro"));

		return airships;
	}

	public List<Route> createRoutes(Airport chosenAirport) {

		List<Airport> airports = createAirports();
		routes.add(new Route(0001, airports.get(3), chosenAirport));

		return routes;
	}

	public List<Flight> createFlights(Airport chosenAirport) {

		List<Route> routes = createRoutes(chosenAirport);
		List<Airship> airships = createAirships();

		flights.add(new Flight(0001, FlightStatus.FLYING, routes.get(0), airships.get(0)));

		return flights;
	}

}
