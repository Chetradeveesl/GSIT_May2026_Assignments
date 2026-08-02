package Week5_31_07_2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program4_CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
		
		Set<Integer> set= new HashSet<Integer>(list1);
		Set<Integer> commonElements=new HashSet<Integer>();
		
		for(Integer i:list2)
		{
			if(set.contains(i))
			{
				commonElements.add(i);
			}
		}
		System.out.println(commonElements);
	}

}
