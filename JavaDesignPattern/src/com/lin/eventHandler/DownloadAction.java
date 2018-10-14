package com.lin.eventHandler;

public class DownloadAction extends Action {

	private boolean isChange =false;
	private String name;//表示动作的名称
	
	private String currentState="下载正常";
	public DownloadAction(String name) {
		super();
		this.name = name;
	}
	
	public void changeState(){
		currentState = "下载失败";
		System.out.println("download state change-->"+currentState);
		fireState();
	}
	public String getCurrentState(){
		return currentState;
	}
	
	public void fireState(){
		fireConditionChange();
	}

}
