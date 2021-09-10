package week1.day2;

public class Pallindrome {

	public static void main(String[] args) {
		int num = 454;
		int b = num;
		int reverse=0;
		while(num!=0)
		{
			int remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		
		if(reverse==b)
			System.out.println("The given number is a pallindrome");
		else
			System.out.println("The given number is not a  pallindrome");
		

	}

}
