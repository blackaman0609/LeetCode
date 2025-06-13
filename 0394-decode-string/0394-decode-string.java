class Solution {
    public String decodeString(String s)
    {
         int len = s.length(); 
         Stack<Integer> num = new Stack<>();
         Stack<String> str = new Stack<>();  
         int k=0,i; 
         for(i=0 ; i<=len-1 ; i++)
         { 
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                k = k * 10 + (ch-48); 
                continue;
            }
            if(ch=='[')
            {
                num.push(k); 
                k = 0; 
                str.push(String.valueOf(ch));  
                continue;
            }
            if(ch!=']')
            {
                str.push(String.valueOf(ch));  
                continue;
            }
            if(ch==']')
            {
                String temp=""; 
                while(!str.peek().equals("["))
                {
                     temp = str.pop() +temp;
                }
                str.pop(); 
                int count = num.pop(); 
                String res=""; 
                for(int j=1 ; j<=count ; j++)
                {
                    res = res+temp;
                } 
                str.push(res);
            }
         }
     String answer = ""; 
     while(!str.isEmpty())
     {
        answer = str.pop()+answer;
     }
     return answer;
    }
}