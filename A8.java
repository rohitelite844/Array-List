import java.util.ArrayList;
import java.util.Collections;
public class A8 {

	public static void main(String[] args) {
      ArrayList<String> colours=new ArrayList();
        colours.add("RED");
	 	colours.add("Green");
		colours.add("Orange");
		colours.add("Black");
		colours.add("White");
		System.out.println("Unsorted colours :"+colours);
		Collections.sort(colours);
		System.out.println("Sorted colours :"+colours);
	}

}
