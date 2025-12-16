package Week3day2;

public class JavaConnection extends Mysqlconnection {
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected scuccessfully");
	}
	@Override
	public void disconnect() {
		System.out.println("disconnected successfully");
	}
	@Override
	public void executeupdate() {
		System.out.println("Executed update");
	}
	public static void main(String[] args) {
		JavaConnection object2 = new JavaConnection();
		object2.connect();
		object2.disconnect();
		object2.executeupdate();
		
	}
}
