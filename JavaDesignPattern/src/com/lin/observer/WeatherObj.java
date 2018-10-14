package com.lin.observer;

/**
 * 观察者具体要获取的数据模型
 * @author Administrator
 *
 */
public class WeatherObj {

	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	private float temperature;
	private float humidity;
	private float pressure;
}
