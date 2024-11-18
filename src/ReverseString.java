import java.util.Stack;

public class ReverseString {
    // Phương thức đảo ngược chuỗi sử dụng Stack
    public static String reverseString(String str) {
        // Tạo Stack để lưu trữ các từ trong chuỗi
        Stack<String> wStack = new Stack<>();
        String[] words = str.split(" ");  // Tách chuỗi thành các từ

        // Đưa các từ vào Stack
        for (String word : words) {
            wStack.push(word);
        }

        // Đọc từ Stack và tạo lại chuỗi đảo ngược
        StringBuilder reversedStr = new StringBuilder();
        while (!wStack.isEmpty()) {
            reversedStr.append(wStack.pop()).append(" ");
        }

        // Loại bỏ dấu cách cuối chuỗi
        return reversedStr.toString().trim();
    }

    public static void main(String[] args) {
        String str = "Hello world this is a test";

        System.out.println("Chuỗi trước khi đảo ngược: ");
        System.out.println(str);

        String reversed = reverseString(str);

        System.out.println("Chuỗi sau khi đảo ngược: ");
        System.out.println(reversed);
    }
}
