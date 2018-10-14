package lin.com.state;

public class ConceteStateB implements State{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("current state:B");
		context.setState(new ConcreteStateA());
		
	}

}
