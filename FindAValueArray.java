public class FindAValueArray{
    static public int FindAValue(int[] a, int desired){
        int value= a.length;
        int max = a[0];
        int min = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]==desired){
                value = a[i];
                return i;
            }
        }
        if (desired>max||desired<min){
            return -2;
        } else {
            return -1;
        }
    }
    
    public static void main (String[] args){
        int[] numbers = {5,10,2,4,8,7,13};
        System.out.println("It's in spot "+FindAValue(numbers, 13));
    }
}
