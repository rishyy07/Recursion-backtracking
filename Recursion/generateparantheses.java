import java.util.*;
public class generateparantheses {
    public static void main(String[] args) {
        int n=3;
        int ob=0;
        int cb=0;
        List<String> list=new ArrayList<>();
        generate(n,ob,cb,"",list);
        System.out.println(list);
    }
    public static void generate(int n,int ob,int cb,String ans, List<String> list){
    if(ob==n && cb==n)
    {
        list.add(ans);
        return;
    }
    if(ob>n ||cb>ob)
    {
        return;
    }
    {
        generate(n,ob+1,cb,ans+"(",list);
        generate(n,ob,cb+1,ans+")",list);
    }
    
}
}