package Tasks;

public class MinMaxAvg {
    public static void main(String[] args) {


        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array [0];
        double min = array [0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array [i])
                max = array [i];
            if (min > array [i])
                min = array [i];

            avg += array[i]/ array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);

    }
}
