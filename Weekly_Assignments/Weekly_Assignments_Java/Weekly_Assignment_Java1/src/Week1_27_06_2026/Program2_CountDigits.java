package Week1_27_06_2026;

public class Program2_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=987654,count=0;
		for(;number!=0;number=number/10)
		{
			count++;
		}
		System.out.println("Number of digits is "+count);
	}

}
