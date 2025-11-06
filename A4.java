import java.util.ArrayList;
public class A4 {

	public static void main(String[] args) {
		ArrayList<String> colours=new ArrayList();
		colours.add("RED");
		colours.add("Green");
		colours.add("Orange");
		colours.add("Black");
		colours.add("White");
		System.out.println(colours);
		String element = colours.get(0);
		System.out.println("First Element :"+element);
		String element1 = colours.get(1);
		System.out.println("Second Element :"+element1);
		
	}

}
