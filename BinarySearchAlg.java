public class BinarySearchAlg{
    static public int findValue(int[] a, int desired){
        int max = a.length-1;
        int min = 0;
        while (min<=max){
            int i=(min+max)/2;
            System.out.println("i = "+i);
            System.out.println("a = "+a[i]);
            if (a[i]<desired){
                min = i+1;
            }
            if (a[i]>desired){
                max = i-1;
            }
            if (a[i]==desired){
                return i;
            }
        }
        return -2;
    }
    
    public static void main(String[] args){
        int[] test = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(findValue(test, 5));
    }
}
