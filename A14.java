import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A14 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		list1.listIterator();
	
		for(String colours:list1){
			System.out.println(colours);		
		}
		
		System.out.println("After Swapping");
		Collections.swap(list1,1, 3);
		
		for(String colours : list1){
			System.out.println(colours);
		}
	}

}
