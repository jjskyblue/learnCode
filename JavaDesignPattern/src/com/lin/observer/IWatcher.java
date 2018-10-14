package com.lin.observer;
/*
 * 观察者接口负责更新自己。
 */
public interface IWatcher {
	public void update(ISubject subject,Object args);

}
