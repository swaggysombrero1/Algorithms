public class SearchAlgs{
    public int binaryFindValue(int[] a, int desired){
        int max = a.length-1; //(n-1)th element as the maximum
        int min = 0; //0th element as the minimum
        while (min<=max){//works until it has eliminated all of the options
            int i=(min+max)/2; //finds the number between the min and max values
            //System.out.println("i = "+i); used for testing
            //System.out.println("a = "+a[i]); used for testing
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
        return -2; //if a[i] never == desired, then returns -2
    }

    public int findAValue(int[] a, int desired){ //checks methodically, one by one (the lamer way)
        int value= a.length; //a.length is an impossible place for the desired variable to be
        int max = a[0]; //need to have a max/min
        int min = a[0];
        for (int i=0; i<a.length; i++){ //repeats for the entirety of the length of the array
            if(a[i]>max){
                max = a[i];//sets max equal to the value at a[i]
            }
            if(a[i]<min){
                min = a[i]; //sets min equal to the value at a[i]
            }
            if(a[i]==desired){
                value = a[i];
                return i; //returns the place in the array (starting with 0th)
            }
        }
        if (desired>max||desired<min){
            return -2; //if desired is outside of the range of the array, returns -2
        } else {
            return -1; //if desired is within the range but not present, returns -1
        }
    }

    public static void main(String[] args){
        int[] test = {1,2,3,4,5,6,7,8,9,10};
        int[] test1 = {5,10,2,4,8,7,13};
        SearchAlgs t = new SearchAlgs();
        System.out.println("The boring way found it in spot "+t.findAValue(test, 13));
        System.out.println("Binary found it in spot "+t.binaryFindValue(test, 13));
        System.out.println("The boring way found it in spot "+t.findAValue(test1, 13));
        System.out.println("Binary found it in spot "+t.binaryFindValue(test1, 13));
    }
}
