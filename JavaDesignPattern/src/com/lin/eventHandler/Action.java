package com.lin.eventHandler;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class Action implements IAction{

	private ActionConditionEvent conditionEvent;
	private ArrayList<IListener>listeners;
	
	private ListenerHandler listenerHandler;
	
	private ListenerHandler getListenerHanlder(){
		if(listenerHandler==null){
			listenerHandler = new ListenerHandler();
		}
		return listenerHandler;
	}


	public Action () {
		listeners=new ArrayList<>();
	}
	/**
	 * 通知监听状态改变的监听器，根据先进先出的原则调用，通知
	 */
	public void fireConditionChange(){
		//从后向前遍历，保证先进先出
		//for (int i=listeners.size()-2;i>=0;i-=2) {
		System.out.println("监听器列表-->"+listeners.size());
		//for(int i=0;i<listeners.size()-1;i++){
		for (IListener iListener : listeners) {
			
		
			//判断当前的listener是处理状态改变的监听器
			//IListener listener  = listeners.get(i);
			//System.out.println("遍历所以该类型的监听器-->"+iListener);
			if(iListener instanceof IConditionListener){
			//监听器处理状态改变
				//lazy load 在具体事例中执行
				conditionEvent = new ActionConditionEvent(this);
				((IConditionListener) iListener).actionCondition(conditionEvent);
			}
		}
	}
	
	@Override
	public void notifyListeners() {
	    
	}

	@Override
	public void addListener(IListener l) {
		listeners.add(l);
		System.out.println("add--listener----->"+l);
		
	}

	@Override
	public void removeListener(IListener l) {
		if(!listeners.isEmpty()){
			if(listeners.contains(l)){
				listeners.remove(l);
			}
		}
		
	}

	
}
