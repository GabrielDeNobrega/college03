package model.entities;

import model.enums.FlightStatus;

public class Flight {

	private Integer id;
	private FlightStatus flightStatus;

	private Route route;
	private Airship airship;

	public Flight() {

	}

	public Flight(Integer id, FlightStatus flightStatus, Route route, Airship airship) {
		this.id = id;
		this.flightStatus = flightStatus;
		this.route = route;
		this.airship = airship;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FlightStatus getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Airship getAirship() {
		return airship;
	}

	public void setAirship(Airship airship) {
		this.airship = airship;
	}

	public void requestLanding() {

	}

	public void requestTakeOff() {

	}

}
