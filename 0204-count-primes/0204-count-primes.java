// seize of eratoas


class Solution {
    public int countPrimes(int N)
    {
        if (N==0 || N==1 || N==2)
        {
            return 0;
        }

        boolean[] sieve = new boolean[N-2];
        int i, j;
        int sq = (int)Math.sqrt(N-1);
        for(i=0; (i+2)<=sq; i++)
        {
            if(sieve[i] != true)
            {
                for (j=(i+2)*(i+2)-2; j<N-2; j=j+(i+2))
                {
                    sieve[j] = true;
                }
            }
        }

        int count = 0;
        for (i=0;i<N-2;i++)
        {
            if(sieve[i]==false)
            {
                count++;
            }
        }
        return count;
    }
}

// // seize of sundaram
// class Solution {
//     public int countPrimes(int N)
//     {
//         int count=1;
//       //  N = sc.nextInt(); //N = 51  
//       if(N==0 || N==1 || N==2)
//       {
//         return 0;
//       }
//       int M = (N-2)/2; //M = 25 
//       int[] sieve_of_sundaram = new int[M]; 
     
//       for(int i=0 ; i<M ; i++)
//       {
//         sieve_of_sundaram[i] = i+1; 
//       }
//       int i=1,j=1,z=0;
//       while(true)
//       {
//         z = i+j+2*i*j;  
//         if(i==j && z>M)
//         {
//           break;
//         }
//         if(z<=M)
//         {
//           sieve_of_sundaram[z-1] = -1; 
//           j++;
//         }
//         else 
//         {
//           i++; 
//           j=i;
//         }
//       }
    
//     for(i=0 ; i<M ; i++)
//     {
//       if(sieve_of_sundaram[i] != -1)
//       {
//         count++;
//       }
//     }
//     return  count;
//     }
// }