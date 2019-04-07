public class FindAStringArray{
    static public int FindAString(String[] a, String desired){
        int value= a.length;
        int maxL = a[0].length();
        int minL = a[0].length();
        for (int i=0; i<a.length; i++){
            if(a[i].length()>maxL){
                maxL = a[i].length();
            }
            if(a[i].length()<minL){
                minL = a[i].length();
            }
            if(a[i].equalsIgnoreCase(desired)){
                //value = a[i];
                return i;
            }
        }
        if (desired.length()>maxL||desired.length()<minL){
            return -2;
        } else {
            return -1;
        }
        //return -1;
    }
    
    public static void main (String[] args){
        String[] numbers = {"5","10","2","4","8","7","13"};
        System.out.println("It's in spot "+FindAString(numbers, "8"));
    }
}
