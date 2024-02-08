package adiiapplication;

import java.util.Vector;

public class VectorAdd2 {

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
	}

}

/*
 * O/P:
 * [One, Two, Three, Four]
 * One
Two
Three
Four
*/
