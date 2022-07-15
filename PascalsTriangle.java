package leetcode_solutions;

import java.util.*;;

public class PascalsTriangle {
    List<List<Integer>> PascalsTriangle_val(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();

        List<Integer> item = new ArrayList<>();
        item.add(1);
        ret.add(item);
        numRows--;
        int c = 0;
        while (c < numRows) {
            item = new ArrayList<>();
            item.add(1);
            for (int i = 0; i < ret.get(c).size() - 1; i++) {
                item.add(ret.get(c).get(i) + ret.get(c).get(i + 1));
            }
            item.add(1);
            ret.add(item);
            c++;
        }
        return ret;
    }
}
