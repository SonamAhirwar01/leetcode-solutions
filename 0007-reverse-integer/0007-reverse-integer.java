class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!= 0){
            
            int LD= x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE /10 || 
            rev==Integer.MAX_VALUE/10 && LD > 7){
                return 0;
            }
            if(rev<Integer.MIN_VALUE /10 || 
            rev==Integer.MIN_VALUE/10 && LD < -8){
                return 0;
            }
            int temp= rev*10+LD;
            rev=temp;
        }return rev;
       
    } 
    
}