public class GetAvgArray{
    static public int getAvg(int[] a){
        int sumValue=0;
        //sumValue = a[0];
        for (int i=0; i<a.length; i++){
            sumValue=sumValue+a[i];
        }

        return sumValue/a.length;
    }

    static public void main(){
        int[] numbers = {5,10,2,4,8,7,13};
        boolean correct;
        if(getAvg(numbers) ==7){
            correct=true;
            System.out.println("True");
        } else{
            correct=false;
            System.out.println("False");
        }
    }
}
