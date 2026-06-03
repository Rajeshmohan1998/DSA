/**
 * Problem : 1431. Kids With the Greatest Number of Candies
 */

import java.util.*;
class LC_1431{

    public static void main(String args[]){

        LC_1431 obj = new LC_1431();
        System.out.println(Arrays.toString(obj.greatestAmongAll(new int[]{12,1,12},10)));
    }

    public boolean[] greatestAmongAll(int[] candies, int extra_candies){

        int greatestKid = findGreatestKid(candies);

        int maxCandies = 0;
        boolean[] greatest= new boolean[candies.length];

        for(int i =0 ;i <candies.length;i++){

            if(candies[i] + extra_candies >=  greatestKid){
                greatest[i] = true;
            }else{
                greatest[i]=false;
            }
        }
        return greatest;
    }

    public int findGreatestKid(int[] candies){

        int max = 0;

        for (int i = 0;i< candies.length;i++){

            if(candies[i]>max){
                max = candies[i];
            }
        }
        return max;
    }
}