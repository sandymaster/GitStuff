package gitDemo.gitSession;


class Add
{
	int a = 0;
	int b = 0;
	
	Add(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public int add()
	{
		return a+b;
	}
}
public class calc {

	
	public static void main(String[] args) {
		
		Add add = new Add(88,11);
		System.out.println(add.add());

		
		
	}

}
