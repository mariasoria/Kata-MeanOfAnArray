public class MeanOfAnArray {
    public static int meanOfAnArray(int [] array){
        int sum= 0;
        for (int elem: array) sum += elem;
        return sum/array.length;
    }
}
