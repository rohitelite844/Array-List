import java.awt.List;
import java.util.ArrayList;

public class A19 {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		
		System.out.println("Let trim to size the above array : " );
		list1.trimToSize();
		System.out.println(list1);
		

	}

}
