import java.util.Arrays;

public class SlidingSubarrayBeauty {

    public static void main(String[] args) {
        int[] nums = {1,-1,2,3,-5};
        int k=2;
        Arrays.stream(getKSizeSlidingSubarray(nums,k)).forEach(x->System.out.printf(Arrays.toString(x)));
    }

    public static int[][] getKSizeSlidingSubarray(int[] nums,int k){
        int nofSubArrays=(nums.length-k+1);
        int[][] slidingSubArray=new int[nofSubArrays][k];
        for(int l=0;l<=(nums.length-k);l++){
            for(int i=l,t=0;i<(l+k)&t<k;i++,t++){
                slidingSubArray[l][t]=nums[i];
            }

        }

        return  slidingSubArray;
    }
}
