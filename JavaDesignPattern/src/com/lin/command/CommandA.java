package com.lin.command;



public class CommandA implements ICommand{
	private IReceiver reciver;

	public CommandA(IReceiver receiver) {
		// TODO Auto-generated constructor stub
		this.reciver = receiver;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		reciver.handle();
		if (reciver instanceof ReceiverA) {
			((ReceiverA) reciver).doA();
		}
		
	}

}
