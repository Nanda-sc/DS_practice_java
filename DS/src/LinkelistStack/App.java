package LinkelistStack;

public class App {

	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		
		names.push("John");
		names.push("Ann");
		
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}

	}

}
