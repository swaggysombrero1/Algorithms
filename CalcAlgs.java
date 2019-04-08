public class CalcAlgs{
    static NullPointerException n; //If I do this it helps (honestly not completely sure why)
    public int getMax(int[] a){
        try{
            if (a.length==0){
                throw n; //Makes the NullPointerException happen, don't need to do it this way but figured I might as well be consistent
            }
            int maxValue = a[0];
            for (int i=0; i<a.length; i++){
                if(a[i]>maxValue){
                    maxValue = a[i];
                }
            }
            return maxValue;
        } catch (NullPointerException n){
            System.out.println("This array is a null array, but here goes nothing! ");
            return -0; //I have to return an integer of some type, and I chose 0
        } 
    }

    public int getMin(int[] a){
        try{
            if (a.length==0){
                throw n; //Makes the NullPointerException happen
            }
            int minValue = a[0];
            for (int i=0; i<a.length; i++){
                if(a[i]<minValue){
                    minValue = a[i];
                }
            }
            return minValue;
        } catch (NullPointerException n){
            System.out.println("This array is a null array, but here goes nothing! ");
            return -0; //I have to return an integer of some type, and I chose 0
        }
    }
    //has to be static to access the NullPointerException n
    static public double getMean(int[] a){ //has to be a double because you say so/an average often is one
        try{
            if (a.length==0){
                throw n; //Makes the NullPointerException happen
            }
            double sumValue=0;
            for (int i=0; i<a.length; i++){ //This for loop sums up the entirety of the array
                sumValue=sumValue+a[i]; 
            }
            return sumValue/a.length; //divides the sum of the entire array by the length of the array (aka the mean)
        } catch (NullPointerException n){
            System.out.println("This array is a null array, but here goes nothing! ");
            return -0; //I have to return an integer of some type, and I chose 0
        }
    }

    static public void main(){
        int[] numbers = {5,10,2,4,8,7,13};
        int[] t1 = {152, 15, 3, 151, 19, 112};
        int[] t2 = {152, 1, 3011, 157, -11, 0};
        int[] t3 = {-152, -15, -3, -151, -19, 0};
        int[] a1 = {152, 15, 3, 151, 19, 112};
        int[] a2 = {};
        int[] a3 = {1,1,1,1,1,1,1,1,2};
        int[] a4 = {-152, -15, -3, -151, -19, 0};
        CalcAlgs test = new CalcAlgs();
        System.out.println("Maximum = "+test.getMax(new int[] {}));
        System.out.println("Maximum1 = "+test.getMax(t1));
        System.out.println("Maximum2 = "+test.getMax(t2));
        System.out.println("Maximum3 = "+test.getMax(t3));
        System.out.println("Minimum = "+test.getMin(numbers));
        System.out.println("Mean1 = "+test.getMean(a1));
        System.out.println("Mean2 = "+test.getMean(a2));
        System.out.println("Mean3 = "+test.getMean(a3));
        System.out.println("Mean4 = "+test.getMean(a4));
    }
}
