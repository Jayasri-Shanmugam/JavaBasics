package arraysamples;

public class Arraysample
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String strnames[]= {"Karthick","Jessy","Aadhi","Tara"};
		int age[]= {21,22,25,24,26};
		
		System.out.println("Accessing elements of Array");
		System.out.println();
		System.out.println("1st element: "+age[0]);
		System.out.println("2nd element: "+age[1]);
		System.out.println("3rd element: "+age[2]);
		System.out.println("4th element: "+age[3]);
		System.out.println("5th element: "+age[4]);
		System.out.println();
		System.out.println("1st name: "+strnames[0]);
		System.out.println("2nd name: "+strnames[1]);
		System.out.println("3rd name: "+strnames[2]);
		System.out.println("4th name: "+strnames[3]);
		
		System.out.println();
		System.out.println("Using for loop:");
		
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		
		System.out.println();
		System.out.println("Using for each loop:");
		
		
		for(String a:strnames)
		{
			System.out.println(a);
		}
		
		
		int[] numbers= {1,34,56,22,45,-12,5,6,8,12};
		
		
		int sum=0;
		
		Double average;
		
		for(int number:numbers)
		{
			sum+=number;
		}
		
		int arrayLength=numbers.length;
		
		average=((double)sum/(double)arrayLength);
		
		System.out.println();
		System.out.println("Sum="+sum);
		System.out.println("Average="+average);
		
		int[][] TD= {{7,4,8,0,2},{2,1},{2,3,4}};
		
		System.out.println();
		System.out.println("Length of first row:"+TD[0].length);
		System.out.println("Length of second row:"+TD[1].length);
		System.out.println("Length of third row:"+TD[2].length);

	}

}
