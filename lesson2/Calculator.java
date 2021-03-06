public class Calculator {
    private int a;
    private int b;
    private char operation;
    long result;

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void calculate() {
        switch(operation) {
            case '+':
                System.out.println("Your result = " + (a + b));
                break;
            case '-':
                System.out.println("Your result = " + (a - b));
                break;
            case '*':
                System.out.println("Your result = " + (a * b));
                break;
            case '/':
                System.out.println("Your result = " + (a / b));
                break;
            case '%':
                System.out.println("Your result = " + (a % b));
                break;
            case '^':
                result = 1;
                for(int i = 0; i < b; i++) {
                    result *= a;
                }
                System.out.println("Your result = " + result);    
        }
    }
}