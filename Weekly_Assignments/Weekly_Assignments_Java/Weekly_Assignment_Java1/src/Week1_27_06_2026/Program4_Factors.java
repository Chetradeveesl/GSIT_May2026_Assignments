package Week1_27_06_2026;

public class Program4_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24;
		System.out.println("Factors of 24");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.println(i);
		}
	}

}
