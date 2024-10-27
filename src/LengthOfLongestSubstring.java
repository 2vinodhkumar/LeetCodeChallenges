import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring=new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("au"));
    }

    public int lengthOfLongestSubstring(String s){
        if(Objects.equals(s, ""))
            return 0;
        char[] chars= s.toCharArray();
        int legnthLongestSubstring=1;
        for(int i=0;i< chars.length;i++){
            Set<Character> distinctChars=new HashSet<>();
            int currentLength=0;
            for(int j=i;j<chars.length;j++){
                if(distinctChars.add(chars[j])){
                    currentLength++;
                    distinctChars.stream().forEach(x->System.out.print(x));
                    System.out.println("---");
                }else{
                    legnthLongestSubstring=Math.max(legnthLongestSubstring,currentLength);
                    System.out.println("Max"+legnthLongestSubstring);
                    break;
                }
            }
            legnthLongestSubstring=Math.max(legnthLongestSubstring,currentLength);
        }
        return legnthLongestSubstring;
    }
}
