package lesson1;

public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 10;
		char operation = '^';
		int result = 1;

		if(operation == '+') {
			result = a + b;
		} else if(operation == '-') {
			result = a - b;
		} else if(operation == '*') {
			result = a * b;
		} else if(operation == '/') {
			result = a / b;
		} else if(operation == '%') {
			result = a % b;
		} else if(operation == '^') {
			while(b >= 1) {
				result *= a;
				b--;
		    }
		}
		System.out.println("your result = " + result);
	}
}
