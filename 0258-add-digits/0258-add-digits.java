class Solution {
    public int addDigits(int num) {
    
        if(num<10){ // if num is less than 10 than return itself num
            return num; 
        }
        while(num>=10){ // if num value is greater than 10 then this condition
            int sum=0;
            while(num>0){// overhere again check if num >0 then chek this 
            int digit = num%10;
            sum+=digit;
            num/=10;
            }
            num = sum; // assign the value to the num;
        }
        return num;  

    }
}