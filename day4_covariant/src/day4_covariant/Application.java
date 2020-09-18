package day4_covariant;

public class Application {
	public static void main(String args[])
	{
		SuperClass subclass=new Subclass();
		subclass.testCovariant();
	}
}
