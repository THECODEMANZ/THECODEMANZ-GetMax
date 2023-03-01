

public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int posMax = 0;
    public int negMax = (int) Double.NEGATIVE_INFINITY;
    public int max;
     
    public int max(int[] arr){
    
        for(int i = 0; i < arr.length; i++){
            
        
            
            if (arr[i] >= 0) {
                if(arr[i] > posMax){
                    posMax = arr[i];
                    max = posMax;
                }
                else{
                    max = posMax;
                }

            }else if(arr[i] < 0) {
                if(arr[i] > negMax){
                    negMax = arr[i];
                    max = negMax;
                }
                else{
                    max = negMax;
                }

            }
            
        
        }
        return max;
        
    }
    
}
