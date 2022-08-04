

class Problem11{

    
        public int maxArea(int[] height) {
            int area=0;
            for(int i=0;i<height.length;i++){
                for(int j=i+1;j<height.length;j++){
                    int w=j-i;
                    int h=Math.min(height[i], height[j]);

                    int a=w*h;

                    if(a>area){
                        area=a;
                    }
                }
            }
            return area;
        }

        //Two poinet approch

        public int max_two(int[] height){
            int area=0;

            int left=0;
            int right=height.length-1;
   
            while(left<right){
                int w=right-left;
                int h=Math.min(height[left], height[right]);

                int a=w*h; 

                if(a>area){
                    area=a;
                }
                if(height[left]>height[right]){
                    right--;
                }
                else{
                    left++;
                }
            }

            return area;
        }
    
}