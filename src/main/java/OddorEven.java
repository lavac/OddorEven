/**
 * Created by lavanya on 6/6/17.
 */


public class OddorEven {

    public boolean isOdd(int number) {
        return (number % 2 == 0);
    }


    public static void main() {
        OddorEven oddorEven = new OddorEven();
        oddorEven.isOdd(3);
        oddorEven.isOdd(4);
    }

}