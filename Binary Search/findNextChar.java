import java.util.*;

public class findNextChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        char ch = sc.next().charAt(0);
        char nextChar = binaryCheck(arr, ch);
        System.out.println(nextChar);
    }

    public static char binaryCheck(char[] arr, char ch) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == ch) {
                return (mid < arr.length - 1) ? arr[mid + 1] : ' ';
            } else if (arr[mid] < ch) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ' ';
    }
}
