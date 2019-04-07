public class SearchAlgs{
    public int binaryFindValue(int[] a, int desired){
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

    public int findAValue(int[] a, int desired){
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

    public static void main(String[] args){
        int[] test = {1,2,3,4,5,6,7,8,9,10};
        SearchAlgs t = new SearchAlgs();
        System.out.println("It's in spot "+t.findAValue(test, 13));
        System.out.println("Binary found "+t.binaryFindValue(test, 5));
    }
}
