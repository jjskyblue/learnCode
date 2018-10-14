package com.lin.observer;

public class TestObserver {

	public static void main(String[] args) {
		//创建具体的主题对象
		WeatherSubject weatherSubject = new WeatherSubject();
		IWatcher watcher1 = new ConcreteWatcher(weatherSubject);
		weatherSubject.setWeatherData();
	}
}
