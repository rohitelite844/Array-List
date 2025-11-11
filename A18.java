import java.util.ArrayList;

public class A18 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		if(list1.isEmpty())
		{
			System.out.println("Checking the above array list is empty or not!");
			System.out.println("Yes it is empty.");
		}
		else
		{
			System.out.println("Checking the above array list is empty or not!");
		System.out.println("No it is not empty.");
		}
		 
		list1.removeAll(list1);
		System.out.println("Array list after remove all elements : "+list1);
		
		if(list1.isEmpty())
		{
			System.out.println("Checking the above array list is empty or not!");
			System.out.println("Yes it is empty.");
		}
		else
		{
			System.out.println("Checking the above array list is empty or not!");
		System.out.println("no it is not empty.");
		}

	}

}
