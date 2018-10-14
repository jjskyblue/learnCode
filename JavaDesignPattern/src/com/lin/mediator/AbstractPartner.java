package com.lin.mediator;

public abstract class AbstractPartner {
	public int Money;
	
	//主动注册到中介
	public AbstractPartner(Mediator m){
		m.attachCardPartner(this);
	}
	abstract public void changeMoney(int money);

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		Money = money;
	}

}
