package controller;

import java.util.ArrayList;
import java.util.List;

import model.entities.Airport;
import model.entities.Bigger;
import model.entities.ControlTower;
import model.entities.Hangar;
import model.entities.MaintenanceHangar;
import model.entities.Operator;
import model.entities.ParkingHangar;
import model.entities.Radar;
import model.entities.Runway;
import model.entities.Smaller;
import model.entities.Terminal;
import model.enums.CapacityStatus;

public class MainController {

	List<Airport> airports = new ArrayList<>();
	List<Operator> operators = new ArrayList<>();
	List<Terminal> terminals = new ArrayList<>();
	List<Runway> runways = new ArrayList<>();
	List<Hangar> hangars = new ArrayList<>();

	public void createAirports() {
		airports.add(new Airport(0001, "Guarulhos", 10, CapacityStatus.EMPTY,
				new ControlTower(0001, new Radar(0001, null), createOperators()), null, createTerminals(),
				createRunways(), null));
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
		hangars.add(new ParkingHangar());

		return hangars;
	}

}
