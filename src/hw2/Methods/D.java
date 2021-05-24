package hw2.Methods;

public class D {
    int length;
    int width;
    int height;

    public int getVolume(int length, int width, int height) {
        int volume = length * width * height;
        return volume;

    }

    public static void volumeResalt() {
        System.out.println("Volume calculated.");
    }
}
