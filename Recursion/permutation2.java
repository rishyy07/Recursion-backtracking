public class permutation2 {
    public static void main(String[] args) {
        //agar duplicate char exist krte hai string mei to mtlb duplicate subseq bnengi jo ans khrab kregi  to ek loop extra laga denge bs jo check krega 
        //ki next char existing ke equal to nhi .. agar hai to break karjao or pata lagane ke liye ki break kia hai ya nahi.. agar kia hai to hme recursive call nhi lagani hai, 
        //or agar nhi kia to call lagado..iske liye ek boolean flag maintain krlo.
        String str="abca";
        perm(str,"");
    }
    public static void perm(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            boolean flag=true;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(j)==ch)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
               
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1);
                perm(s1 + s2, ans + ch);

            }
            
        }
    }
    
}
