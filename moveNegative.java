import java.util.Arrays;

public class moveNegative {
    public static void main(String[] args) {
        int a[]={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        System.out.println("original array:" + Arrays.toString(a));

        moveElementToBeginners(a);
        System.out.println("Modified Array:" + Arrays.toString(a));




    } 

    public static  void moveElementToBeginners(int a[]){
        int left=0;
        int right=a.length-1;

        while(left<=right){
            if(a[left]<0){
                left++;

            }else if(a[right]>=0){
                right--;
            } else {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;

            }

        }

    }
    
}
