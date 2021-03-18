package collectionparttwo;

public class GenericFunction {
    public static void main(String[] args) {
        Integer arr[] = {10,20,30,40,10,30};
        Integer res = count(arr,10);
        System.out.println(res);
    }
    public static <T> int count(T arr[], T x) {
        int res = 0;
        for(T e: arr) {
            if(e.equals(x)) {
                res++;
            }
        }
        return res;
    }
}
