package com.lin.command;

public class Invoker {
	private ICommand command;
	public Invoker(){
		
	}
	public ICommand getCommand() {
		return command;
	}
	public void setCommand(ICommand command) {
		this.command = command;
	}
	public void runnCommand(){
		if (command != null) {
			command.excute();
		}
		
	}
	
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.setCommand(new CommandA(new ReceiverA()));
		invoker.runnCommand();
	}

}
