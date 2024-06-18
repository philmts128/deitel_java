/**
* Author: Phil
*/


public class PassReference
{
    public static void main(String[] args)
    {
        int n = 222;

        System.out.printf("| original n = %d\n", n);
        PassReference.twice(n);
        System.out.printf("| doubled n = %d\n", n);

        int[] nums = {1,2,3,4,5};
        System.out.print("\n| original nums: ");
        PassReference.printArr(nums);

        System.out.print("\n| doubled nums: ");
        PassReference.twice(nums);
        PassReference.printArr(nums);

    }

    public static void twice(int n)
    {
        n *= 2;
    }

    public static void twice(int[] n)
    {
        for (int i = 0; i < n.length; ++i) {
            n[i] *= 2;
        }
    }

    public static void printArr(int[] n)
    {
        for (int i : n)
            System.out.printf("%d ", i);
    }
}
