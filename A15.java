import java.util.ArrayList;

public class A15 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		
		ArrayList<String> list2=new ArrayList();
		list2.add("Red");
		list2.add("Blue");
		list2.add("Orange");
		list2.add("Pink");
        System.out.println(list2);
        
        System.out.println("After Join two list");
        list1.addAll(list2);
        System.out.println(list1);
        
	}

}
