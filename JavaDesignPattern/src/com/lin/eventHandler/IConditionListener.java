package com.lin.eventHandler;

public  abstract class IConditionListener implements IListener {

	@Override
	public void action() {
		// TODO Auto-generated method stub
	}
	abstract public void actionCondition(ActionConditionEvent e);

}
