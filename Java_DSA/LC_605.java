/* 
Leet code Problem 605 : Can Place flowerbed
 */

class LC_1431{

    public static void main(String args[]){

        System.out.println(LC_1431.isSpotAvailable(new int[]{1,0,0,0,1},2));

    }

    public static boolean isSpotAvailable(int[] flowerbed,int n){

        int counter = 0;
        for(int i = 0;i<flowerbed.length;i++){

            boolean leftEmpty = (i==0) || (flowerbed[i-1]==0);
            boolean rightEmpty = (i== flowerbed.length-1) || (flowerbed[i+1] ==0);

            if(leftEmpty && rightEmpty){
                flowerbed[i]=1;
                counter ++;
                return (counter ==n);
            }
        }
        return  (counter ==n);
    }


}