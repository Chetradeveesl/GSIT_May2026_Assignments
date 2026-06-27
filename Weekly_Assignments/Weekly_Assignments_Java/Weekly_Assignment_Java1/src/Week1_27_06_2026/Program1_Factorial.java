package Week1_27_06_2026;

public class Program1_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=6;
		if(fact==0)
		{
			System.out.println("Factorial of 0 = 1");
		}
		else
		{
		for(int num=1;num<6;num++)
		{
			fact=fact*num;
		}
		System.out.println("Factorial of 6 = "+fact);
		}
	}

}
