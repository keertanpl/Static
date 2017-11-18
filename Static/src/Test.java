

class A{
	public static int a1;
	private static int b1;
	public final int c1=1001;
	private final int d1;
	public class E
	{
		
	}
	public static class F{
	public void dispaly()
	{
		a1=10;//Only static data memebrs can be accessed inside this
		/* Can have 2 iner class (STtaic & Non static inner class,Also to create the ob jcet we need inner class)
		 * 
		 */
		//Git sample git  comment
		//Git sample git branch000001fghfghfgh
		//fsdfsdfsdfsdfdsfkkkkkkkkdsfsfds
		//gdhhhgfhfghfghfghgfhfghfghfg
	}
	}
	public A()
	{
		b1=2;
	//	c1=2;
		d1=5;
		
	}
	public void dd()
	{
		b1=1;
		a1=100;
		
	}
	public static void display()
	{
		System.out.println("Display Static");
		
	}
	public final void displayfinal()
	{
		System.out.println("Final method");
		
	}
	
}
final class  C
{
	public int c1;
	public void displayc()
	{
		System.out.println("C final class");
		System.out.println(c1);
	}
}

class B extends A
{
	
	public void dd()
	{
		A aaa=new A();
		A.E eee=new A().new E(); // Both are same
		
		A.E fff=new A.E();
		
System.out.println(this.a1);
		System.out.println("B extended dd");
		super.dd();
		
	}
	public static void display()
	{
		System.out.println("Display Static");
	
	
		
	}
	/*public final void displayfinal() //can't override final method
	{
		System.out.println("Final method");
		
	}*/
	
}
/*
class D extends C //can't inherit since C is final class
{
	
}*/




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B bb=new B();
bb.dd();
	B cc=new B();
	cc.dd();
	
	
	}

}
