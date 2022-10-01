package week1.day1;

import org.openqa.selenium.devtools.v101.css.model.StyleSheetOrigin;

public class Factorialprogram {
public static void main(String[] args) {
	int i, Number=5,factorial =1;
	for (i=1;i<=Number;i++)
	{
		factorial=factorial*i;
	}
	
	System.out.println("Factorial of"+ Number +"is :"+factorial);
	
}
}
