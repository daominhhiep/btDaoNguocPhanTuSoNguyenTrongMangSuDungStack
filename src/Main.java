import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Origin numbers: ");
        for (Integer number : numbers) {
            System.out.printf("%d, ", number);
        }
        for (Integer number : numbers) {
            integerStack.push(number);
        }
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = integerStack.pop();
        }
        System.out.println();
        System.out.println("Numbers after reverse: ");
        for (Integer number : numbers) {
            System.out.printf("%d, ", number);
        }
        System.out.println("\n");


        Stack<Character> characters = new Stack<>();
        String string = "abcefghjklm";
        System.out.println("Original String: ");
        System.out.println(string);
        for (Character ch : string.toCharArray()) {
            characters.push(ch);
        }
        System.out.println("String after reverse: ");
        for (int index = 0; index < string.length(); index++) {
            System.out.print(characters.pop());
        }
    }
}