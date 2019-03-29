public class TestGetMaxArray{
    public TestGetMaxArray(){
        GetMaxArray test = new GetMaxArray();
        int[] numbers = {5,10,2,4,8,7,13};
        boolean correct;
        if(test.getMax(numbers) ==13){
            correct=true;
            System.out.println("True");
        } else{
            correct=false;
            System.out.println("False");
        }
        System.out.println(test.maxValue);
    }
    public static void main(String[] args){
        TestGetMaxArray t = new TestGetMaxArray();
    }
}
