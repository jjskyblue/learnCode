package com.lin.observer;

import java.util.ArrayList;

public class Subject implements ISubject {
	   //判断信息是否改变的标志
		private boolean change =false;
		//已经注册到主题中的观察者列表
		private ArrayList<IWatcher> watchers ;
		public Subject() {
			watchers =new ArrayList<>();
		}

		@Override
		public void attach(IWatcher watcher) {
			watchers.add(watcher);
			
		}

		@Override
		public void detach(IWatcher watcher) {
			if(watchers!=null){
				if(watchers.contains(watcher)){
					watchers.remove(watcher);
				}
			}
			
		}

	 	@Override
	 	public void notifyWathcers(Object ars) {
	 	// TODO Auto-generated method stub
	 			if(isChange()){
	 				for (IWatcher watcher : watchers) {
	 					watcher.update(this,ars);
	 				}
	 				change =false;
	 			}
	 		
	 	}

		//拉方式，主题不主动提供数据
		public void notifyWathcers() {
			notifyWathcers(null);
		}

		public boolean isChange() {
			return change;
		}

		public void setChange() {
			this.change = true;
		}



}
