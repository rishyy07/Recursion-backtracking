public class tailrecusrion {
    public static void main(String[] args) {
        // this is tail recursion kyuki isme stack grow krte hue ans bnra hai hmara or
        // print bhi ho rha hai wapis aate hue koi statement nhi bchi execute krne ke
        // liye
        int n = 5;
        dec(n);
    }

    public static void dec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        dec(n - 1);
    }

}
