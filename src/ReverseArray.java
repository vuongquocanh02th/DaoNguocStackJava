import java.util.Stack;

public class ReverseArray {
    // Phương thức đảo ngược mảng sử dụng Stack
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Đưa tất cả các phần tử vào Stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // Lấy ra các phần tử từ Stack và đưa lại vào mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng trước khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverseArray(arr);

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
