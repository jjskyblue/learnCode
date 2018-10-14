package lin.com.state;

import java.io.Console;

public class ConcreteStateA implements State {

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("current state:A");
		context.setState(new ConceteStateB());
		
	}

}
