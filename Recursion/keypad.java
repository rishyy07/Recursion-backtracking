import java.util.*;

public class keypad {
    static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        String digits = "23";
        List<String> list = new ArrayList<>();

        Combinations(digits, "", list);
        System.out.println(list);

    }

    public static void Combinations(String digits, String ans, List<String> list) {
        if (digits.length() == 0) {
            list.add(ans);
            return;
        }
        char ch = digits.charAt(0);
        int num = ch - '0';
        String press = map[num];
        for (int i = 0; i < press.length(); i++) {
            Combinations(digits.substring(1), ans + press.charAt(i), list);
        }
    }

}
