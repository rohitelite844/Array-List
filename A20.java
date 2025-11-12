import java.util.ArrayList;

public class A20 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		
		System.out.println(list1);
		list1.ensureCapacity(20);
		
		list1.add("Black");
		list1.add("Purple");
		list1.add("Yellow");
		list1.add("Pink");
		
		System.out.println("New Array List :");
    	System.out.println(list1);
		

	}

}
