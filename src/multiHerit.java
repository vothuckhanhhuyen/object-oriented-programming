
public class multiHerit implements interface1, interface2 {
	@Override
	public void doSth() {
		interface1.super.doSth();
	}
}
