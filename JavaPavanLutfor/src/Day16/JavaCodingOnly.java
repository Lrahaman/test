package Day16;

public class JavaCodingOnly {

	public static void main(String[] args) {

// 1. Swapping
		
		int a=200;
		int b=400;
		int c=a;//c=200
		    a=b;//a=400
		    b=c;//b=200
		    
		    System.out.println("The result is:"+ a+ "  "+b);
		    //2
		    int a1=11;int b1=22;
		    a1=a1+b1;//33
		    b1=a1-b1;//33-22
		    a1=a1-b1;
		    System.out.println("Here the result:"+a1+"  "+b1);
		    //2
		    int x=40;int y=60;
		    x=x+y;//40+60==100
		    y=x-y;//100-60=40
		    x=x-y;//100-40=60
		    System.out.println("Final result is:"+x +"  "+y);

	}

}
