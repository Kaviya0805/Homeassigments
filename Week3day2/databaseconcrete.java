package Week3day2;

public class databaseconcrete implements Databaseconnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Dissconnecting");
	}

	@Override
	public void executeupdate() {
		// TODO Auto-generated method stub
		System.out.println("Executing the update");
	}
	public static void main(String[] args) {
	databaseconcrete object1 = new databaseconcrete();
	object1.connect();
	object1.disconnect();
	object1.executeupdate();
	}

}
