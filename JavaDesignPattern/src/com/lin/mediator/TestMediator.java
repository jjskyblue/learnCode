package com.lin.mediator;

public class TestMediator {

	public static void main(String[] args) {
		
		Mediator  mediator = new Mediator();
		//实例化两个牌友
		AbstractPartner partnerA = new CardPartnerA(mediator);
		AbstractPartner partnerB = new CardPartnerB(mediator);
		IState awin = new AWinState(partnerA);
		//IState bwin = new Bwin
		awin.changeMoney(5, mediator);
		System.out.println("a---mone-->"+partnerA.getMoney());
		System.out.println("b---money-->"+partnerB.getMoney());

	}
}
