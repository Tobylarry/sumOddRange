public class SumOddRange {

    public static void main(String[] args) {

       sumOdd(-4, 6);
    }
    public static boolean isOdd (int number){
        if (number%2 == 0 || number < 0){
            return false;
        }
        return true;
    }
    public static int sumOdd(int start, int end) {
        int count = 0;
        int sum = 0;
        if (start > end || start < 0 || end < 0){
            System.out.println(-1);
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (isOdd(i) && start > 0){
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
