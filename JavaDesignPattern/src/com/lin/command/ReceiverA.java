package com.lin.command;


public class ReceiverA implements IReceiver{
	public void doA(){
		System.out.println("receiverA ---do A");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("receiverA ---handle-->");
		
	}

}
