
 class Calculator {
    int a;

    public int add(int a, int b) {
        System.out.println("Adding two numbers: " + a + " and " + b);
        return a + b; // Method to add two integers
    }
}

    public class Demo extends Calculator {

        
        public static void main(String[] args) {
            // This is the main method where the program starts
            int num1 = 4;
            int num2 = 5;
            Calculator calc = new Calculator();
            // int result = num1 + num2; // Adding two integers
            calc.add(num1, num2); // Using the add method from Calculator class
            System.out.println("The result of addition is: "  + calc.add(num1, num2)); // Displaying the result
            // System.out.println("Hello, World!"); // This line is commented ou

        }
    }

