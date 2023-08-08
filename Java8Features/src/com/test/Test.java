package com.test;

//class Check implements MyInterface {
//
//	@Override
//	public void m1(String x) {
//System.out.println(x);		    // this line is not necessary for Lambda Expression.Used it for Polymorphism.
//	}
//	
//}


//public class Test{
//
//	public static void main(String[] args) {
		
		
//		Check test = new Check();
//		test.m1("rrr");            // this is normal(Polymorphism) mthd.
//	
//		MyInterface obj=(x,y)-> System.out.println(x+y);		
//		obj.m1(9,6);	

//	}
//}


public class Test{
//
	public static void main(String[] args) {
//
//		MyInterface inter = (x)-> System.out.println(x);    // here single line of code thats why we don't use {} braces.
//		inter.m1("Hi this is functional interface mthd and using lambda expression");
//		
//		Check inter2 = new Check();
//		inter2.m1("Hi this is functional interface and using Polymorphism");
//	
//	
//	// lambda expression--
//		MyInterface rrrr =(x)->System.out.println(x);
//	rrrr.m1("Radharani krupa kkijiye");	
	
//	MyInterface hh = (x)-> System.out.println(x);
//	hh.m1("Radhe Radhe");
//	
//	
//	MyInterface gg = (x)->System.out.println(x);
//	gg.m1("KKKKK");
}
}


/*class Calculate implements MyInterface2{

	@Override
	public int m1(int a,int b) {
int c=0;
c=a+b;
return c;	}
	
}
*/     // above implements interface...no need to write for lamba expression.
//
//	public class Test{
//		
//	public static void main(String[] args) {
//		
		
//		Calculate docal = new Calculate();
//        System.out.println(docal.m1(4, 7));   // This is a normal way.
		
        
//          MyInterface2 obj = (a,b)->(a+b); 
//          System.out.println(obj.m1(9, 8));   // This is Lambda way.This is easy way.
//          
//          MyInterface2  obj2 = (a,b)->(a+b);
//          System.out.println(obj2.m1(12, 18));
//          
//          
//          MyInterface2 obj3 =(a,b)->(a+b);
//          System.out.println(obj3.m1(10, 18));
//	}
//	}
	
//() -> {}  Lambda expression symbol or syntax