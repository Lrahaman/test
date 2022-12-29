package Day15;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
//1. declaration
		//Map hm=new HashMap();
		//HashMap hm=new HashMap();
		
HashMap<Integer,String> map = new HashMap<Integer,String>();

       // add data as pairs 1.
   map.put(25, "Rahim");
   map.put(30, "Karim");
   map.put(40, "Jaman");
   map.put(50, "David");
  System.out.println(map);// all data 2.
   System.out.println(map.size());// size number 3.
   map.remove(30);
   System.out.println("After removing :"+map);// 30 removed 3.
   System.out.println(map.get(25));// get value 4.
   
   
      // print only keys
   System.out.println(map.keySet());// only keys 5.
   System.out.println(map.values());// only values 6.
   
      // for  loop
//   for(int i=0;i<=map.size();i++) {  // size/get , not work get QQQQQ
//	   System.out.println(i);
  //  }
   
         // for each  // keys
//   for(int i:map.keySet()) {
//	   System.out.println(i);
//   }
   
       // only values so string data type
//  for(String i:map.values()) {
//	  System.out.println(i);
//  }
      // print both keys and values of different data type// QQQQQ.
  
   
   

	}//main

}//class
