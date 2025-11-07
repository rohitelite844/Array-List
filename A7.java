import java.util.ArrayList;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		ArrayList<String> colours=new ArrayList();
		colours.add("Red");
		colours.add("Green");
		colours.add("Orange");
		colours.add("Blue");
		colours.add("White");
		System.out.println(colours); 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to search on list:");
		String selement = sc.nextLine();
		
		if(colours.contains(selement)){
			System.out.println(selement+" is found in list");
		}
		else 
		{
			System.out.println("no");
		}
			
		
	}

}
