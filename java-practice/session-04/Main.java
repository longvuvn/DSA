import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Session 04: Stack & Queue");

        // TODO 1: Kiểm tra ngoặc hợp lệ
        String s = "({[]})";
        System.out.println(isValid(s));

        // TODO 2: Queue bằng 2 stack
    }

    private static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
