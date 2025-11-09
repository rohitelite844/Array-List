import java.util.ArrayList;
import java.util.Collections;

public class A11 {

	public static void main(String[] args) {
		ArrayList<String> colours=new ArrayList();
		colours.add("Red");
		colours.add("Green");
		colours.add("Orange");
		colours.add("Blue");
		colours.add("White");
		
		System.out.println(colours);
		Collections.reverse(colours);
		System.out.println(colours);
	}

}
