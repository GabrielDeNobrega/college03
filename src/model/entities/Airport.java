package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.enums.CapacityStatus;

public class Airport {

	private Integer id;
	private String name;
	private Integer maxCapacity;
	private CapacityStatus currentCapacity;

	private ControlTower controlTower;

	List<Airship> airships = new ArrayList<>();
	List<Terminal> terminals = new ArrayList<>();
	List<Runway> runways = new ArrayList<>();
	List<Hangar> hangars = new ArrayList<>();

	public Airport() {

	}

	public Airport(Integer id, String name, Integer maxCapacity, CapacityStatus currentCapacity,
			ControlTower controlTower, List<Airship> airships, List<Terminal> terminals, List<Runway> runways,
			List<Hangar> hangars) {
		super();
		this.id = id;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.currentCapacity = currentCapacity;
		this.controlTower = controlTower;
		this.airships = airships;
		this.terminals = terminals;
		this.runways = runways;
		this.hangars = hangars;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public CapacityStatus getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(CapacityStatus currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public ControlTower getControlTower() {
		return controlTower;
	}

	public void setControlTower(ControlTower controlTower) {
		this.controlTower = controlTower;
	}

	public List<Airship> getAirships() {
		return airships;
	}

	public List<Terminal> getTerminals() {
		return terminals;
	}

	public List<Runway> getRunways() {
		return runways;
	}

	public List<Hangar> getHangars() {
		return hangars;
	}

}
