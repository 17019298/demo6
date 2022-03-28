package Basiccommands;
import java.util.Scanner;
public class ArrayEx1 {

	public static void main(String[] args) {


		String name[]= new String[7];
		 
		Scanner s= new Scanner(System.in);
		
		for( int i=0;i<7;i++)

			{
			System.out.println("enter name");
			name[i]= s.next();
			}
		for( int i=0;i<7;i++)
		{
         System.out.println(name[i]);
		}

	}

}
