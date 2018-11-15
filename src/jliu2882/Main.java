package jliu2882;

public class Main {

    public static void main(String[] args) {
        int[] nums= {3,1,3,1,3};
        int[] nums2= {3,1,3,3};
        int[] nums3= {3,4,3,3,4};
        System.out.println(haveThree(nums));
        System.out.println(haveThree(nums2));
        System.out.println(haveThree(nums3));



    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==3){
                i++;
                count++;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }
}
