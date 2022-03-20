package array2d;

public class Array {
    public static void main(String[] args) {
        int[] [] number = new int[2][6];
        number[0][0]=10;
        number[0][1]=20;
        number[0][2]=30;
        number[0][3]=40;
        number[0][4]=50;
        number[0][5]=60;
        number[1][0]=70;
        number[1][1]=80;
        number[1][2]=90;
        number[1][3]=100;
        number[1][4]=110;
        number[1][5]=120;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 6; col++) {
                System.out.print(" "+number[row][col]);
            }
            System.out.println();
        }
    }
}
