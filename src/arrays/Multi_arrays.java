package arrays;

public class Multi_arrays {

    public static void main(String[] args) {
        int[] number = {1, 2, 3};

        int[][] matrice = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][1]);
        System.out.println(matrice[0][0]);

        String [][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);
    }
}
