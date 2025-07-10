package strings;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hola");
		sb.append(" mundo");
		sb.insert(5, " java ");
		sb.replace(0, 4, "Hi");
		sb.delete(3, 8);
		sb.reverse();
		
		System.out.println(sb);
		
	

	}

}
