package Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1{

	public static void main(String[] args) {
		// declaration
		//ArrayList mylist=new ArrayList();
		//
		
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		ArrayList<Integer> mylist1=new ArrayList<Integer>();
		// Adding data elements
		mylist.add(100);
		mylist.add(200);
		mylist.add(300);
		mylist.add(400);
		mylist.add(500);
		mylist.add(50);
		
		mylist1.add(1000);
		mylist1.add(2000);
		mylist1.add(3000);
		//System.out.println(mylist);// same as get method . 4 difference
		
		//System.out.println(mylist.remove(1));
		
		//System.out.println(mylist);
//		mylist.get(0);
//		System.out.println(mylist.get(3));
		
//		mylist.clear();
//		System.out.println(mylist);
		
		//3. for each Loop// not int?
//		for(Object a:mylist) {
//			System.out.println(a);
//		}

		//4. for loop  // get all elements
//		for(int i=0;i<mylist.size();i++) { // get() not work,size() work
//			System.out.println(mylist.get(i));
		
		
		//for loop get size number// size ()// total number
//			for(int i=0;i<mylist.size();i++) { 
//				System.out.println(i);
//		
//		}
		
		// 5. iterator // same 4.3
//		Iterator it=mylist.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		 //6. get specific item
//		System.out.println(mylist.get(3));
		
		
		// contains()// boolean
		System.out.println(mylist.contains(300));//value//null?  
		System.out.println(mylist.containsAll(mylist));
		System.out.println(mylist.equals(1));// QQQQQ
		
		System.out.println(mylist.equals(mylist1));
		
		
		//Collections.sort(mylist);
//		for(int i:mylist) {    // why object type, int not accept
//		
//		System.out.println(i);
//		
//		}
		
		

	}//m

	
	}//c


