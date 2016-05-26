/**
 * Created by АбельянцX on 18.05.2016.
 */
public class for_each_sum {
    public static void main(String args[]){
        int sum=0;
        int nums[][]=new int[3][4];
        for(int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = i + j;
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }
            for(int x[]:nums){
                int h =0;
                for (int y:x){
                    h+=y;
                }
                System.out.println(h);
            }
        }
    }

