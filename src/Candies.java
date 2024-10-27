import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
        int n=8,limit=3;
        int tmpN=n;
        int[] re=new int[3];
        for(int i=0;i<3;i++){
            if (tmpN>limit){
                re[i]=limit;
                tmpN=tmpN-limit;
            }else re[i]=tmpN;
        }
        Arrays.stream(re).forEach(System.out::println);
        for(int i=0;i<re.length;i++)
            for (int j=i+1;j<re.length-1;j++){
                int tmp=re[j];
                re[j]=re[j+1];
                re[j+1]=tmp;
            }
        Arrays.stream(re).forEach(System.out::println);
        int t=3;
        System.out.println((t+1)*(t+1)/2);
        System.out.println(candiesGet(3,3));
    }

    public static  long candiesGet(int n,int k){
        if (n <= k) {
            System.out.println("---------------------------");
            System.out.println(n+1);
            System.out.println(n+2);
            System.out.println((n+1)*(n+2));
            System.out.println((n+1)*(n+2)/2);
            System.out.println("---------------------------");

            return (n + 1) * (n + 2) / 2;
        }
        if (n <= 2 * k) {
            return (k + 1) * (k + 1)
                    - (n - k) * (n - k + 1) / 2
                    - (2 * k - n) * (2 * k - n + 1) / 2;
        }
        if (n <= 3 * k) {
            return (3 * k - n + 1) * (3 * k - n + 2) / 2;
        }
        return 0;
    }

}
