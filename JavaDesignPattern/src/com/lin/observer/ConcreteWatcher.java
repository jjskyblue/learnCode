package com.lin.observer;

public class ConcreteWatcher implements IWatcher{

	private ISubject subject;
	private WeatherObj weatherObj;
	//具体的观察者注册到主题中
	 public ConcreteWatcher(ISubject subject) {
		 this.subject = subject;
		 subject.attach(this);
	}
	 //观察者知道所有的信息，观察者和主题约定了数据的格式，观察者获取数据，但是不知道数
	 //据的具体格式。统一处理。
	 public void display(){
		 if(weatherObj!=null){
			 System.out.println(weatherObj.getHumidity()+","+weatherObj.getTemperature());
			 System.out.println("changed display!"); 
		 }
	
	 }
	@Override
	public void update(ISubject subject, Object args) {
		//采用拉的方式获取想要的数据，而不是主题发送来的数据。关键是要获取
		//对应主题的引用
		//处理数据
		if(subject instanceof WeatherSubject){
		    weatherObj =((WeatherSubject)subject).getWeatherObj();
			display();
		}
		
		
	}

}
