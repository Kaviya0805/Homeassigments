package Week3day2;

public class Amazon extends Canarabank {

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void recordPaymentDetails() {
		// TODO Auto-generated  stub
		System.out.println("Abstarct  Amazon - Rec pay details");
	}
	public static void main(String[] args) {
		Amazon object1 = new Amazon();
		object1.recordPaymentDetails();
	}
}
