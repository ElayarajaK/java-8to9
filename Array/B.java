public class B
{
	public static void main(String[]args)
	{
		int []arr=new int[10];
		
		System.out.println(arr.length);
		
		System.out.println(arr[5]);
		//System.out.println(arr[11]);
		
		//for(declareation;condtition chek; falsy)
			
		arr[5]=400;
		//arr[11]=900;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index is "+i+" and value is "+arr[i]);
			
		}
		
		System.out.println(10/0);
		
	}


}