public class Main {
    public static void main(String[] args) {
        String s = "abc";

        int n = s.length();


        String[] subsets = new String[(1 << n) -1];


        for(int i = 0 ; i < (1 << n) ; i++) {

            String sub = "Sub: ";

            for(int j = 0 ; j < n ; j++) {
                if((i & (1 << j)) != 0) {
                    sub+=s.charAt(j);
                }
            }

            System.out.println(sub);
        }
    }
}
