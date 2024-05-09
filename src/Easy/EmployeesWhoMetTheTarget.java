package Easy;

public class EmployeesWhoMetTheTarget {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i : hours){
            if (i >= target){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] input = {5,1,4,2,2};
        int target = 6;
        int output = numberOfEmployeesWhoMetTarget(input, target);
        System.out.println(output);
    }
}
