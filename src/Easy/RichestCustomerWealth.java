package Easy;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts){
        int sum=0;
        int highest = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if(sum > highest){
                highest = sum;
                sum = 0;
            }else {
                sum=0;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int [] [] input = {{2,8,7}, {7,1,3},{1,9,5}};
        System.out.println(maximumWealth(input));
    }
}
