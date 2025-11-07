import java.util.ArrayList;
public class A6 {

	public static void main(String[] args) {
		ArrayList<String> colours= new ArrayList();
		colours.add("RED");
		colours.add("Green");
		colours.add("Orange");
		colours.add("Black");
		colours.add("White");
		System.out.println(colours);
		String element = colours.remove(2);
		System.out.println("After remove element");
		System.out.println(colours);
	}

}
