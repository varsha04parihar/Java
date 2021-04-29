package Day2;

import java.util.Arrays;
import java.util.Scanner;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("declaration and instantiation");
		int arr[]=new int [5];//declaration and instantiation
		//initialization  

		arr[0]=10;		
		arr[1]=20;  
		arr[2]=70;  
		arr[3]=40;  
		arr[4]=50;  
		
		//length is the property of array
		int len=arr.length;
		System.out.println("Length of array is :"+len);
		
		//traversing array  
		for(int i=0;i<len;i++)  
		System.out.println(arr[i]); 
		
		System.out.println("\n");
		
		//declaration, instantiation & initialization
		System.out.println("declaration, instantiation & initialization");

		int arr2[]= {22,11,33};
		for(int i=0;i<arr2.length;i++)  
		System.out.println(arr2[i]);
		
		System.out.println("\n");

		System.out.println("printing array using for-each loop");

		int arr3[]={33,3,4,5};  
		//printing array using for-each loop  
		for(int i:arr3)  
		System.out.println(i);  
		System.out.println("\n");

		/*System.out.println("Array index out of bound");
		
		//Array index out of bound
		int arr4[]={50,60,70,80};  
		for(int i=0;i<=arr4.length;i++){  
		System.out.println(arr4[i]);  
		}  
		*/
		System.out.println("\n");
		System.out.println("largest and smallest element");
		int arr5[] ={25,65,23,12,36};
		int min=arr5[0];
		int max=arr5[0];
		System.out.println("\nArray is :");
		for(int i = 0; i <arr5.length ; i++)
		{
		System.out.print(arr5[i] + " ");
		}
		for(int i=1;i<arr5.length;i++)
		{
			if(arr5[i]>max)
			{
				max=arr5[i];
			}
			else if(arr5[i]<min)
				min=arr5[i];
		}
		System.out.println("Largest element is : "+max);
		System.out.println("Smallest element is : "+min);
		
		
		System.out.println("\n");
		System.out.println("2D Array");
		int rows = 5;
		int columns = 3;

		int[][] array = new int[rows][columns];

		for(int i = 0; i<rows; i++)
		    for(int j = 0; j<columns; j++)
		        array[i][j] = 0;

		for(int i = 0; i<rows; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(array[i][j]);
		    }
		    System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("Reverse of array");
		int arr7[] ={25,65,23,12,36,34,64,23,33};
		System.out.println("original array");
		for(int i = 0; i <arr7.length ; i++)
		{
		System.out.print(arr7[i] + " ");
		}
		
		System.out.println("\nreverse array");

		for(int i = arr7.length-1; i >= 0; i--)
		{
		System.out.print(arr7[i] + " ");
		
		}
		
		
		
		System.out.println("\n");
		System.out.println("Subarray");
		String[] arr8 = new String[] { "A", "B", "C", "D", "E", "F", "G", "H" };
        int beg = 1, end = 4;
 
        String[] subarray = new String[end - beg + 1];
        for (int i = 0; i < subarray.length; i++) {
            subarray[i] = arr8[beg + i];
        }
 
        System.out.println(Arrays.toString(subarray));
		
		/*
		int n;
		int[] arry1 = new int[10];

		System.out.println("Enter  the number of element u want to store");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter array element");

		for (int i = 0; i < n; i++) {
			arry1[i] = sc.nextInt();
		}
		//for (int i = 0; i < n; i++) {
		//	System.out.println(arr1[i]);
		//}

		int arry2[] = new int[n];

		for (int i = 0; i < n; i++) {
			arry2[i] = arry1[i];
		}

		System.out.println("Elements of First array: ");
		for (int i = 0; i <n; i++) {
			System.out.print(arry1[i] + " ");
		}

		System.out.println();

		System.out.println("Elements of Copy array: ");
		for (int i = n-1; i >=0; i--) {
			System.out.print(arry2[i] + " ");
		}
*/
		System.out.println("\n");
		System.out.println("Max Min Pairs");
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element u want to store. ");
		int n = sc.nextInt();
		int i,j;
		int array1[]=new int [n];
		System.out.println("Enter the array element");
		for( i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println("Display the array element");
		for( i=0;i<n;i++)
		{
			System.out.println(array1[i]);
		}
		
		//acending ordering the element
		for(i=0;i<=n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(array1[i]>array1[j])
				{
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		
		//min max pairing
		
		System.out.println("The min max pair element:-");
		
		for( i=0,j=n-1;i<=j;i++,j--)
		{
			if(i==j)
			{
				System.out.println(array1[i]);
			}
			System.out.println("Min-"+array1[i]+ "- max-" +array1[j] );
		}

	}

}
