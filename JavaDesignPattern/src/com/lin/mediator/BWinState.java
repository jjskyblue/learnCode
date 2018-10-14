package com.lin.mediator;

public class BWinState implements IState {

	private AbstractPartner p;
	public BWinState (AbstractPartner p) {
		this.p = p;
	}
	@Override
	public void changeMoney(int money, Mediator m) {
		// TODO Auto-generated method stub
		
	}

}
