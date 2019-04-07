public class CalcAlgs{
    public int getMax(int[] a){

        if ( a.length==0){
            return 0;
        }
        int maxValue = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public int getMin(int[] a){
        int minValue = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]<minValue){
                minValue = a[i];
            }
        }
        return minValue;
    }

    static public double getAvg(int[] a){
        double sumValue=0;
        //sumValue = a[0];
        for (int i=0; i<a.length; i++){
            sumValue=sumValue+a[i];
        }
        return sumValue/a.length;
    }

    static public void main(){
        int[] numbers = {5,10,2,4,8,7,13};
        int[] t1 = {152, 15, 3, 151, 19, 112};
        int[] t2 = {152, 1, 3011, 157, -11, 0};
        int[] t3 = {-152, -15, -3, -151, -19, 0};
        CalcAlgs test = new CalcAlgs();
        System.out.println("Maximum = "+test.getMax(numbers));
        System.out.println("Minimum = "+test.getMin(numbers));
        System.out.println("Minimum = "+test.getAvg(numbers));
    }
}
