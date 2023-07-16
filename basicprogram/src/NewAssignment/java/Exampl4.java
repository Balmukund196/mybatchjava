package NewAssignment.java;

public class Exampl4 {
	public static void main(String args[])  
	{  
		int rows=7;      
		//inner loop  
		for (int i= rows-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=0; j<=i; j++)  
		{  
		//prints star and space  
		System.out.print("*" + " ");  
		}  
		//throws the cursor in the next line after printing each line  
		System.out.println();  
		}  
		}  
		public class MirroredRightTrianglePattern   
		{  
		public static void main(String[] args)  
		{  
		int n=7;  
		//inner loop  
		for (int i= 0; i<= n; i++)  
		{  
		//outer loop  
		for (int j=1; j<=n-i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0;k<=i;k++)  
		{  
		System.out.print("*");  
		}   
		System.out.println("");  
		}  
		}
		}
		}
		
		  
