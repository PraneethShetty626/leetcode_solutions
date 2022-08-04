import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] hs=sc.nextLine().split(" ");
        int[] height=new int[hs.length];
        for(int i=0;i<hs.length;i++){
            height[i]=Integer.parseInt(hs[i]);
        }

        //
        // Problem11 p=new Problem11();
        // System.out.println(p.max_two(height));
        // System.out.println(p.maxArea(height));
        //

        Problem15 p= new Problem15();

        System.out.println(p.threeSum(height));


    }
}
