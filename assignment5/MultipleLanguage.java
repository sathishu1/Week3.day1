package week3.day1.assignment5;

public class MultipleLanguage implements Language,TestTool {
public static int a=5;
public int b=6;
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Studying Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Language chosen Java");
		System.out.println("Also python");
	}
	public void python()
	{
	this.java();
	}
public void ruby()
{
	System.out.println("Language chosen ruby");

}
public void staticlearn()
{
	MultipleLanguage.a=MultipleLanguage.a+5;
}

}
