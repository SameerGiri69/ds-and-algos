
public class ThreeSumQuestion {
    int nums[] = {-1, 0, 1, 2, -1, -4};
    int count = 0;
    public int FindThreeSum()
    {
    for(int i = 0; i< nums.length; i++)
    {   
        for(int j = i+1; j<nums.length; j++)
        {
            for(int k = j + 1; k< nums.length; k++)
            {
                // System.out.println(nums[i]);
                // System.out.println(nums[j]);
                // System.out.println(nums[k]);
                if(nums[i] + nums[j] + nums[k] == 0)  count++; System.out.println(nums[i]); System.out.println(nums[j]);System.out.println(nums[k]);
            }
        }

    }
    return count;
}

public static void main (String [] args)
{
    ThreeSumQuestion obj = new ThreeSumQuestion();
    var res = obj.FindThreeSum();
    System.out.println(res);
}
}
