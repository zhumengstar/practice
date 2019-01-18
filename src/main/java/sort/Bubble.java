package sort;

/**
 * @author:zhumeng
 * @desc:
 **/
public class Bubble {

    public static void main(String arg[]){
        int nums[]={5,4,3,2,1};

        int len=nums.length;

        int swap=0;

        for (int i=0;i<nums.length;i++)
            System.out.print(nums[i]);
        System.out.println(nums.length);

        boolean flag=true;

        int time=0;
        for(int i=1;i<=len&&flag;i++)
        {
            flag=false;
            for(int j=0;j<len-i;j++)
            {
                if(nums[j]>nums[j+1]){
                    time++;
                    swap=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=swap;
                    flag=true;
                }
            }
        }
        for (int i=0;i<nums.length;i++)
        System.out.println(nums[i]);

        System.out.println(time);

    }
}
