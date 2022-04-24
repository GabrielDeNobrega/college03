package model.entities;

import model.enums.WeatherCondition;

public class Radar {

	private Integer id;
	private WeatherCondition currentWeather;

	public Radar() {

	}

	public Radar(Integer id, WeatherCondition currentWeather) {
		this.id = id;
		this.currentWeather = currentWeather;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public WeatherCondition getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(WeatherCondition currentWeather) {
		this.currentWeather = currentWeather;
	}

}
