package model.entities;

public class FixedWing extends Airship {

	private String copilotName;

	public FixedWing() {
		super();
	}

	public FixedWing(Integer id, String pilotName, Double fuelLimit, Double fuelLevel, Integer engineType,
			Integer passengerNumber, String copilotName) {
		super(id, pilotName, fuelLimit, fuelLevel, engineType, passengerNumber);
		this.copilotName = copilotName;
	}

	public String getCopilotName() {
		return copilotName;
	}

	public void setCopilotName(String copilotName) {
		this.copilotName = copilotName;
	}

}
