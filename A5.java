import java.util.ArrayList;
public class A5 {

	public static void main(String[] args) {
		ArrayList<String> colours=new ArrayList();
		colours.add("RED");
		colours.add("Green");
		colours.add("Orange");
		colours.add("Black");
		colours.add("White");
		System.out.println(colours);
		String element = colours.set(2, "Yellow");
		System.out.println(colours);
		

	}

}
