class Solution {

    public void solve (int i, String digits,String ans,ArrayList<String> result, HashMap<Character,String> dail)
    {
        if(i==digits.length())
        {
            result.add(ans);
            return;
        }
        else
        {
            String pair = dail.get(digits.charAt(i));
            for(int j=0; j<pair.length(); j++)
            {
                solve(i+1, digits, ans + pair.charAt(j), result, dail);
            }
        }
    }

    public List<String> letterCombinations(String digits) 
    {
        ArrayList <String> result = new ArrayList<>();
        if(digits.length()==0)
        {
            return result;
        }

        HashMap<Character,String> dail = new HashMap<>();
        dail.put('2',"abc");
        dail.put('3',"def");
        dail.put('4',"ghi");
        dail.put('5',"jkl");
        dail.put('6',"mno");
        dail.put('7',"pqrs");
        dail.put('8',"tuv");
        dail.put('9',"wxyz");
        
        solve(0,digits,"",result,dail); //function calling

        return result;

        
        
    }
}