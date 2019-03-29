public class GetMaxArray{
    int maxValue;
    //maxValue = numbers[0];
    public int getMax(int[] a){
        maxValue = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
}
