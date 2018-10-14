package com.lin.mediator;

import java.util.ArrayList;

/**
 * 
 * @author Administrator
 * 1负责管理牌友数，添加，删除
 * 2负责牌友赢钱输钱数。
 *
 */
public  class Mediator {
	public ArrayList<AbstractPartner> partners;
	public Mediator(){
		this.partners = new ArrayList<>();
	}
	
	public void attachCardPartner(AbstractPartner p){
		partners.add(p);
		
	}
	public void detacheCardPartner(AbstractPartner p){
		if(partners.size()>0){
			partners.remove(p);
		}
		
		
	}
	public  void changeMoney(int money){
		
	}

	public ArrayList<AbstractPartner> getPartners() {
		return partners;
	}


}
