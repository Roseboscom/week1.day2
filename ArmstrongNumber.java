package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int calculated=0,remainder,original=num;
		
		while(num>0)
		{
			remainder=num%10;
			num=num/10;
			calculated=calculated+(remainder*remainder*remainder);
		}
		
		if(calculated==original)
			System.out.println("The given number "+original+" is an Armstrong number");
		else
			System.out.println("The given number "+original+" is not an Armstrong number");	
		

	}

}
