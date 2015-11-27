import org.testng.annotations.Test;


public class Test1 {

	
	@Test
	public void Test1()
	{
      int a=2;
      int b=3;
      int addition=sum(a,b);
      int subtraction=sub(a,b);
      System.out.println(addition);
      System.out.println(subtraction);

      
	}
	
	public int sum(int a, int b)
	{
		int temp=a+b;
		return temp;
	}
	
	
	
	
	
	
	
	public int sub(int a, int b)
	{
		int temp=a-b;
		return temp;
	}
}
