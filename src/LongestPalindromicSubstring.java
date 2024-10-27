public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s="aoididio";

        int lengthLongestPalndrome=1;
        String t="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
               String src= s.substring(i,j);
               String fold= fold(src);
                if(src.equals(fold))
                   t= t.length()<src.length()?src:t;
            }
        }
        System.out.println(t);
    }

    public static String fold(String s){
        StringBuilder folded=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            folded.append(c);
        }
        return folded.toString();
    }
}
