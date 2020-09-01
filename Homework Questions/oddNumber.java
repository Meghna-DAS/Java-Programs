import java.util.Random;

class oddNumber
{
    public static void main(String[] args) {
        int[] nums =new int[10];
        Random rand = new Random();
        for(int i=0; i<10 && nums[i] == 0 ; i++)
        {
            int num = rand.nextInt(100) + 1;
            if(num%2!=0)
            {
                nums[i]=num;
            }
            else
                i--;
            
        }
        System.out.print("Array Of Odd Numbers Between 1 to 100: ");
        for(int element:nums)
        {
            System.out.print(element + " ");
        }
    }
}