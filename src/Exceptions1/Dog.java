package Exceptions1;

public class Dog {

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Dog buddy = new Dog("Baddy");
        buddy.putLeash();
        buddy.putMuzzle();
        try {
            buddy.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + buddy.isCollarPutOn + "\r\n Поводок надет? "
                    + buddy.isLeashPutOn + "\r\n Намордник надет? " + buddy.isMuzzlePutOn);
            e.printStackTrace();
        }

    }

    public void putCollar() {

        System.out.println("Ошейник надет!");
        this.isCollarPutOn = true;
    }

    public void putLeash() {

        System.out.println("Поводок надет!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {

        System.out.println("Dog go out!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура, идем гулять! " + name + " очень рад!");
        } else {
            throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
        }
    }

    public class DogIsNotReadyException extends Exception {

        public DogIsNotReadyException(String message) {
            super(message);
        }
    }
}