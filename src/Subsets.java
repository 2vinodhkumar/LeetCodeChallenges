import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Subsets {
    public static void main(String[] args) {
        int[] n = {1,2,3};
       List<List<Integer>> rr= subsets(n);
//       rr.stream().forEach(x->{
//           x.stream().forEach(System.out::print);
//       });
//      for(List<Integer> e : rr){
//          System.out.println(("\n-------------"));
//          System.out.print("[");
//          for(Integer i: e){
//              System.out.print("\t"+i);
//          }
//          System.out.print("]");
//          System.out.println(("\n-------------"));
//
//        }
    }
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> r= new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            Stack<List<Integer>> s= new Stack<>();
            for(int j=i;j<nums.length;j++)
            {
                List<Integer> t= new ArrayList<>();
                if(s.empty()){
                    t.add(nums[j]);
                    s.push(t);
                }else {
                    List t2=s.pop();
                    t.addAll(t2);
                    t.add(nums[j]);
                    s.push(t2);
                    s.push(t);
                }

            }
//            System.out.println(i);
//            for(List<Integer> e : s){
//                System.out.println(("\n-------------"));
//                System.out.print("[");
//                for(Integer t: e){
//                    System.out.print("\t"+t);
//                }
//                System.out.print("]");
//                System.out.println(("\n-------------"));
//
//            }
//            s.stream().forEach(l->{
//                System.out.println("---------------");
//                System.out.print("[");
//               for(Integer t: l){
//                   System.out.print("\t"+t);
//               }
//                System.out.print("]");
//                System.out.println("---------------");
//            });
            r.addAll(s);
        }


        return r;
    }
}
