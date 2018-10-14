package lin.com.state;


public class Context {
	//已知几种状态
	//将状态保存为类的成员变量为强依赖，不好。
	private State stateA= new ConcreteStateA();
	private State stateB = new ConceteStateB();
	
	private State state;
	
	public  Context() {
	  this.state = stateA;
	}

	public Context(State state){
	    this.state =(this.state!=null)?state:stateA;
	}

	public void request(){
		this.state.handle(this);
	}
	public static void main(String[] args) {
		Context context = new Context();
		for (int i = 0; i < 5; i++) {
			context.request();
		}
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

}
