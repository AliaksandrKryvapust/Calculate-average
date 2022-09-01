import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr =new int[]{1, 2, 3};
        System.out.println(find_average(arr)==2);
    }
    public static double find_average(int[] array){
    return Arrays.stream(array).average().getAsDouble();
    }
}
