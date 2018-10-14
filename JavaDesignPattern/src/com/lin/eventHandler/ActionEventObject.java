package com.lin.eventHandler;

import java.io.Serializable;

public class ActionEventObject implements Serializable {

	private Object soure;

	public ActionEventObject(Object o){
        if (o == null){
            throw new IllegalArgumentException("null source");
        }
	   this.soure =o;	
	}
	public Object getSoure() {
		return soure;
	}
	
}
