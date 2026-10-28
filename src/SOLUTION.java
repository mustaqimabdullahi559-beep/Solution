import java.util.Stack;

import java.util.Scanner;


public class SOLUTION {


        public static String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }

            StringBuilder result = new StringBuilder();

            for (char ch : stack) {
                result.append(ch);
            }

            return result.toString();
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String s = input.nextLine();

            String answer = removeDuplicates(s);

            System.out.println("Output: " + answer);

            input.close();
        }
    }

