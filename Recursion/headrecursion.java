public class headrecursion {
    public static void main(String[] args) {
        //this is head recursion kyuki wapis aate hue statements execute hui hai saari.
        int n=5;
        inc(n);
    }
    public static void inc(int n)
    {if(n==0)
        {
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
    
}
