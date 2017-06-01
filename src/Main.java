import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.printf("Tax rate? : ");
		double tax = s.nextDouble();
		LinkedList prices = new LinkedList();
		int count = 0;
		double sum = 0;
		do{
			System.out.printf("Price #%d : ", (count+1));
			double price = s.nextDouble();
			if (price != 0.0){
				prices.add(price);
				sum += price;
			}
			else{
				break;
			}	
			count++;
		}while(true);
		System.out.println("\n--------------------------------------------\n\nReceipt");
		NumberFormat formatter = new DecimalFormat("#0.00");
		NumberFormat tForm = new DecimalFormat("#.000");
		for(int i = 0;i<prices.size();i++){
			System.out.println(formatter.format(prices.get(i)));
		}
		System.out.println(String.valueOf(formatter.format(sum)) + " subtotal");
		System.out.printf("%s tax\n%s grand total", String.valueOf(tForm.format(tax*sum)), String.valueOf(formatter.format(tax*sum + sum)));
	}

}
