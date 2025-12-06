package week1day2;

public class Fibonacciseries {
	public static void main(String[] args) {
		int range = 8;
        int number1 = 0;
        int number2 = 1;

        for (int i = 0; i < range; i++) 
        {
            System.out.print(number1 + " ");

            int number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
}
	}
}