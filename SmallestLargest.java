//put your name here
public class SmallestLargest{
    public static void main(String[] args){
        int arr[]=new int[10];
        for(int i = 0; i<10;i++){
            arr[i]=(int) (Math.random()*100)+1;
        }
        System.out.println(smallestValue(arr));
        System.out.println(largestValue(arr));
    }
    public static int smallestValue(int [] a1){
        int snum = a1[0];
        for(int i =0;i<a1.length;i++){
            if(snum>a1[i]){
                snum=a1[i];
            }
        }
        return snum;
    }
    public static int largestValue(int [] a2){
        int bnum = a2[0];
        for(int i =0;i<a2.length;i++){
            if(bnum<a2[i]){
                bnum=a2[i];
            }
        }
        return bnum;
    }
}