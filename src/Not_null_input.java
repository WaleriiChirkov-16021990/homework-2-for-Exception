/*
Задание 2.2
//		Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//		Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;


public class Not_null_input {
	private String input;
	public void not_null_inp() throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			setInput(scanner.nextLine());
			if (!is_not_null()) {
				throw new NullPointerException();
			} else {
			System.out.println(getInput());
			}
		} catch (NullPointerException nullPointerException) {
			throw new Exception("пустые строки вводить нельзя");
		}
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	private boolean is_not_null(){
		return getInput().matches(".");
	}
	
	
}
