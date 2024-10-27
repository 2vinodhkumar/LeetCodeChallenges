import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestConsecutiveLen {

    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        LongestConsecutiveLen longestConsecutiveLen= new LongestConsecutiveLen();
        System.out.println(longestConsecutiveLen.longestConsecutive(nums));

        Set<Integer> s= new HashSet<>();
        System.out.println(s.add(1));
        System.out.println(s.add(1));
    }
    public int longestConsecutive(int[] nums) {

        //Finding an element in array is challenging, Using HashSet
        HashSet<Integer> numsInSet = new HashSet<>();
        for(int e: nums){
            numsInSet.add(e);
        }

        Integer longestConseLen=1;
        for(Integer e: numsInSet){
            if(!numsInSet.contains(e-1)){
                Integer currentLongestConseLen=1;
                Integer currentVal=e;
                Iterator it = numsInSet.iterator();
                while (numsInSet.contains(currentVal+1)){
                    currentLongestConseLen++;
                    currentVal=currentVal+1;
                    //numsInSet.remove(currentVal); with HashSet Exception in thread "main" java.util.ConcurrentModificationException
                }
               longestConseLen=Math.max(longestConseLen,currentLongestConseLen);
            }
        }
        return longestConseLen;
    }
}

