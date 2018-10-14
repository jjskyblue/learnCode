package com.lin.eventHandler;

public interface IAction {
	//注册监听器
	public void addListener(IListener l);
	//删除监听器
	public void removeListener(IListener l);
	
	public void notifyListeners();
	

}
