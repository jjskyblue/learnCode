package com.lin.eventHandler;

public class TestListener {
public static void main(String[] args) {
	DownloadAction downloadAction = new DownloadAction("下载操作");
	downloadAction.addListener(new IConditionListener() {
		
		@Override
		public void actionCondition(ActionConditionEvent e) {
			Object  obj =e.getSoure();
			System.out.println("this--->"+this);
			System.out.println("event object--->"+obj);
			if(obj instanceof DownloadAction){
				DownloadAction dAction = (DownloadAction)obj;
				System.out.println("conditionListener excute1-->"+dAction.getCurrentState());
			}
			
		}
	} );
	downloadAction.addListener(new IConditionListener() {
		
		@Override
		public void actionCondition(ActionConditionEvent e) {
			Object  obj =e.getSoure();
			System.out.println("event object--->"+obj);
			if(obj instanceof DownloadAction){
				DownloadAction dAction = (DownloadAction)obj;
				System.out.println("conditionListener excute2-->"+dAction.getCurrentState());
			}
			
		}
	});
	//触发状态改变监听器。
	downloadAction.changeState();
}
}
