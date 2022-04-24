package model.entities;

public abstract class Airship {

	private Integer id;
	private String pilotName;
	private Double fuelLimit;
	private Double fuelLevel;
	private Integer engineType;
	private Integer passengerNumber;

	public Airship() {

	}

	public Airship(Integer id, String pilotName, Double fuelLimit, Double fuelLevel, Integer engineType,
			Integer passengerNumber) {
		this.id = id;
		this.pilotName = pilotName;
		this.fuelLimit = fuelLimit;
		this.fuelLevel = fuelLevel;
		this.engineType = engineType;
		this.passengerNumber = passengerNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	public Double getFuelLimit() {
		return fuelLimit;
	}

	public void setFuelLimit(Double fuelLimit) {
		this.fuelLimit = fuelLimit;
	}

	public Double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(Double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public Integer getEngineType() {
		return engineType;
	}

	public void setEngineType(Integer engineType) {
		this.engineType = engineType;
	}

	public Integer getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(Integer passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

}
