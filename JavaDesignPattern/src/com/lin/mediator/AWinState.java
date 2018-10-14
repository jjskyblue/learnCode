package com.lin.mediator;



public class AWinState implements IState {

	private AbstractPartner a;

	public AWinState(AbstractPartner partnerA) {
		this.a = partnerA;
	}
	@Override
	public void changeMoney(int money, Mediator m) {
		for (int i = 0; i < m.getPartners().size(); i++) {
			AbstractPartner partner  = m.getPartners().get(i);
			if(partner==a){
				a.changeMoney(money);
			}else{
				partner.changeMoney(-money);
			}
		}
		
		
	
		
	}


}
