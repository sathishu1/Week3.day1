package week3.day1.assignment5;

public class Automation extends MultipleLanguage{
	final int c=7;

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Studying Selenium for Automation");
	}
	public void thiselenium()
	{
		this.selenium();
	}
	public void superselenium()
	{
		super.selenium();
	}
	public void finalkey() {
		System.out.println(c);
	}
	
public static void main(String[] args) {
	Automation automation=new Automation();
	automation.selenium();
	automation.thiselenium();
	automation.superselenium();
	automation.java();
	automation.python();
	automation.ruby();
	automation.staticlearn();
	System.out.println(MultipleLanguage.a);
	Automation automation2=new Automation();
	automation2.staticlearn();
	System.out.println(MultipleLanguage.a);
	automation.finalkey();
}
}
