public class Main {
	public static void main(String[] args) {
		System.out.println(user_input());
		
	}
	
	public static float user_input() {
		Input_float_data input = new Input_float_data();
		input.setInput("");
		while (!input.is_float()) {
			input.inp("enter float number: ");
		}
		System.out.println("Это победа.");
		return Float.parseFloat(input.getInput());
	}
}