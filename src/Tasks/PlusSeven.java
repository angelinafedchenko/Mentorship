package Tasks;

//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//
//7 14 21 28 35 42 49 56 63 70 77 84 91 98

public class PlusSeven {
    public static void main(String[] args) {
        int a = 7;
        while (a <= 98) {

            System.out.println(a + " ");
            a += 7;
            //a = a+7;

        }
    }
}
