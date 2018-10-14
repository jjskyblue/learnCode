package com.lin.observer;


public class WeatherSubject extends Subject {
	//判断信息是否改变的标志

	private WeatherObj weatherObj;
	//已经注册到主题中的观察者列表

    public void setWeatherData(){
	//new data weather data
			weatherObj = new WeatherObj();
			weatherObj.setHumidity(12.2f);
			weatherObj.setPressure(12);
			weatherObj.setTemperature(24f);
			weatherChange();
     }
 
     //事件改变
     public void weatherChange(){
    	   setChange();
	      //推方式，主题主动提供数据给观察者
	       notifyWathcers(weatherObj);
	       //拉方式，主题不主动提供数据，由观察者决定获取什么样的数据
	      // notifyObservers();

     }


 	public WeatherObj getWeatherObj() {
		return weatherObj;
	}



}
