import java.util.*;

public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret=new ArrayList<>();
        
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    for(int k=j+1;k<nums.length;k++){
                        int sum=nums[i]+nums[j]+nums[k];
                        if(sum==0){
                            int[] arr={nums[i],nums[j],nums[k]};
                            Arrays.sort(arr);
                            List<Integer> list=new ArrayList<Integer>();
                            list.add(arr[0]);
                            list.add(arr[1]);

                            list.add(arr[2]);
  
                            if(!ret.contains(list))
                                ret.add(list);
                        }
                    }
                }
            }
            return ret;

    }
    
}
