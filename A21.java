import java.util.ArrayList;
import java.util.Scanner;
public class A21 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Replace the first element with : ");
		String i = sc.nextLine();
		list1.get(0);
		list1.set(0, i);
		
		System.out.println("After Replacement :");
		System.out.println(list1);
	}

}
