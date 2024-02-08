package adiiapplication;

import java.util.Vector;

public class VectorAddRemv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector list=new Vector();
		
		list.add("Pune");
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Kolkata");
		list.add("Banglore");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
			System.out.println((String)list.get(i));
		
		list.add(1,"Nashik");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}

}
/*
 * O/P:
 *[Pune, Mumbai, Delhi, Kolkata, Banglore]
Pune
Mumbai
Delhi
Kolkata
Banglore
[Pune, Nashik, Mumbai, Delhi, Kolkata, Banglore]	//Add
*/