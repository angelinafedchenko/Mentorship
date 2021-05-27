package Tasks;

//Необходимо вывести на консоль такую последовательность чисел:
//
//1 2 4 8 16 32 64 128 256 512

public class Multi2 {
    public static void main(String[] args) {
         int num = 1;

         while (num <= 512) {
             System.out.println(num + " ");

             num *=2;
         }
    }
}
