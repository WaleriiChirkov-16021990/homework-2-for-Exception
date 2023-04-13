/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Input_float_data {
	private final Scanner scanner = new Scanner(System.in);
	private String input;
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public void inp(String message) {
		System.out.println(message);
		setInput(scanner.nextLine());
	}
	
	public boolean is_float() {
		return getInput().matches("\\d+\\.\\d+");
	}
}
