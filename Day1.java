// "static void main" must be defined in a public class.
public class Main {
    
    public static void main(String[] args) {
      
        int nums[] = {10, 15, 3, 7};
        
        int k = 17;
        
        // o(n^2)
        
        // O(nlogn)
        
//         Arrays.sort(nums);
        
//         int i=0;
//         int j=nums.length-1;
        
//         while(i<j)
//         {
//             if(nums[i] + nums[j] == k)
//             {
//                 System.out.print(true);
//                 return;
//             }
//             if(nums[i]+nums[j]>k)
//             {
//                 j--;
//             }
//             else
//             {
//                 i++;
//             }
//         }
//          System.out.print(false);
              
        // O(N) with extra space checking if sum - nums[i] in arrayList
        
       
        //O(N)
        
        int rem[] = new int[k];
        
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]<k)
            {
                int mod = nums[i]%k;
                rem[mod]++;
            }
        }
        
        for( i=1;i<k/2;i++)
        {
            if(rem[i]>0 && rem[k-i]>0)
            {
                System.out.println(true);
                break;
            }
        }
        
        if(i>=k/2)
        {
            if(k%2 == 0)
            {
                if(rem[k/2]>1)
                {
                    System.out.println(true);
                    return;
                }
                else
                {
                    System.out.println(false);
                    return;
                }
            }
            else
            {
                if(rem[k/2]>0 && rem[k-k/2]>0)
                {
                    System.out.println(true);
                    return;
                }
                else
                {
                    System.out.println(false);
                    return;
                }
            }
        }
        
        
        
        
        
    }
        
}