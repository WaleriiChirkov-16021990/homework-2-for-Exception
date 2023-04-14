public class Main {
	public static void main(String[] args) throws Exception {
//		Задание 1
		System.out.println(user_input());
		
//		Задание 2
//		так как не было ограничений что можно менять, я изменил код практически полностью .... )

//		int d = 0;
//		int [] array = new int[10];
//		{код рандомного заполнения массива от 0 до ....}
//		try {
//			int catchedRes1 =  d / array[8];
//			System.out.println("catchedRes1 = 0");
//		} catch (ArithmeticException e) {
//			System.out.println("Catching exception: " + e.getMessage());
//		}

//		или можно рандомизировать d и оставить формулу double catchedRes1 =  array[8] / d;
//		в ином случае исходный код не имее смысла, в любом случае деля на 0 мы получим пойманное исключение Арифметикэксепшн
//		и никогда не отработавшую 14 строчку. не стал кидать исключение, думаю уведомить пользователя будет достаточно

//		задание 2.1
		
//		public static void main(String[] args) throws Exception{
//			try {
//				int a = 90;
//				int b = 3;
//				System.out.println(a / b);
//				printSum(23, 234);
//				int[] abc = { 1, 2 };
//				abc[3] = 9;
//			} catch (NullPointerException ex) {
//				System.out.println("Указатель не может указывать на null!");
//			} catch (IndexOutOfBoundsException ex) {
//				System.out.println("Массив выходит за пределы своего размера!");
//			} catch (Exception ex) {
//				System.out.println("Что-то пошло не так...");
//			}
//		}
//		public static void printSum(Integer a, Integer b) {
//			System.out.println(a + b);
//		}

//		Задание 2.2
//		Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//		Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
		
		Not_null_input null_input = new Not_null_input();
		null_input.not_null_inp();
	
		
	}
	
	public static float user_input(){
		Input_float_data input = new Input_float_data();
		input.setInput("");
		while (!input.is_float()) {
			input.inp("enter float number: ");
		}
		System.out.println("Это победа.");
		return Float.parseFloat(input.getInput());
	}
}