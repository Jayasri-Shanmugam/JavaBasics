package BasicPackage;
import java.util.Scanner; 
class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
//		int largest;
		if(n1>=n2)
		{
			if(n1>=n3)
			{
				System.out.println("n1 is largest");
			}
			else
			{
//				largest=n3;
				System.out.println("n3 is largest");
			}

		}
		else
		{
			if(n2>=n3)
			{
				System.out.println("n2 is largest");
			}
			else
			{
				System.out.println("n3 is largest");
			}
		}
		
	}

}
