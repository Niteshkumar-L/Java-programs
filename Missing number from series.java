public class FindMissingNum{
    public static void main(String[] args) {
        //10 is missing
        int[] num = {1,2,3,4,5,6,7,8,9,11,12};
         
        int N = 12;
        int idealSum = (N * (N + 1)) / 2;
        int sum = calSum(num);
 
        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);
    }
 
    private static int calSum(int[] num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
}
