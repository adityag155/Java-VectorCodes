package adiiapplication;

import java.util.Vector;

public class VectorAddRemv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Vector list=new Vector();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println(list);		//[One, Two, Three, Four]
		
		for(int i=0;i<list.size();i++)
			System.out.println((String)list.get(i));
		
		list.add(1,"Five");
		System.out.println(list);		//[One, Five, Two, Three, Four]
		
		list.remove(1);
		System.out.println(list);		//[One, Two, Three, Four]
	
	}

}

/*
O/P:
[One, Two, Three, Four]
One
Two
Three
Four
[One, Five, Two, Three, Four]
[One, Two, Three, Four]
*/
