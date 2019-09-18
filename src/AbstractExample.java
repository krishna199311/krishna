
public abstract class AbstractExample 
{
 abstract void does();
 

}

class AbstractExample2 extends AbstractExample
{
	public void does()
	{
		System.out.println("hi krishna");
	}
	public static void main(String[] args)
	{
		AbstractExample2 a = new AbstractExample2();	
		a.does();
	}
}
