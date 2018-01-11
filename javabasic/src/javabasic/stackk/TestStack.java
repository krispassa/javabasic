package javabasic.stackk;

public class TestStack {

	public static void main(String[] args) {

		TestStack  ts = new TestStack();
		ts.PushStack(2);
		ts.PushStack(4);
		ts.PushStack(6);
		//System.out.println(ts.isEmpty());
		ts.print();
		
	}
	int top = -1;
	int [] a = new int[5];
	
	 void PushStack(int k) 
	{
		if(top<a.length)
		{
			top++;
			a[top] = k;	
		}		
	}
	
	void PopStack()
	{
		if( isEmpty())
		{
			top --;
			
		}
		else
		{
			top = top;
		}
	}
	
	boolean isEmpty()
	{
		if(top>-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void print()
	{
		for( int i = 0; i<top;i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
