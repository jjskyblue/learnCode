package com.lin.observer;
/**
 * 
 * Subject
 * 1主题可以是一个事件的源，多个观察者获取信息的源;
 * 2主题可以是多个观察者委托负责监听的对象，将监听事件源变化的功能让主题负责。
 *
 */
public interface ISubject {
	//注册观察者
	public void attach(IWatcher watcher);
	//删除观察者
	public void detach(IWatcher watcher);

	//通知所有观察者,推方式发送数据。
	public void notifyWathcers(Object ars);

}
