// "static void main" must be defined in a public class.
public class Main {
    
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5};
        
//         int larr[] = new int[nums.length];
        
//         int rarr[] = new int[nums.length];
        
//         larr[0] = 1;
            
//         rarr[nums.length-1] = 1;
    
//         for(int i=1;i<nums.length;i++)
//         {
//             larr[i] = larr[i-1]*nums[i-1];
//         }
        
//         for(int i=nums.length-2;i>=0;i--)
//         {
//             rarr[i] = rarr[i+1]*nums[i+1];
//         }
        
//         for(int i=0;i<nums.length;i++)
//         {
//             larr[i] = larr[i]*rarr[i];
//         }
        
//         for(int x : larr)
//         {
//             System.out.println(x);
//         }
        
        // No extra space
        
        int res[] = new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            res[i] = nums[i-1]*res[i-1];
        }
        
        int right=1;
        
        for(int i=nums.length-1;i>=0;i--)
        {
            res[i]*=right;
            right*=nums[i];
        }
        
        for(int x:res)
        {
            System.out.println(x);
        }
        
        
        
    }
        
}