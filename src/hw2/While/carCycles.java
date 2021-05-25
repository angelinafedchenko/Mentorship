package hw2.While;

public class carCycles {

    public static void main(String[] args) {
        Car range = new Car();

        int speed = 50;

        while (speed < 250) {

            speed = speed + 50;
            System.out.println("Increase speed. Your current speed is: " + speed);

            if (speed == 250) {

                System.out.println("Stop");
                range.checkOil();

                continue;
            }

        }


        int race = 3;

        do {
            race++;
            System.out.println("Participate in race.");

        } while (race < 6);

        System.out.println("Visit to service station is scheduled on: " + range.dateForService(1) + ". Current number of reces: " + race);



        for (int racers = 0; racers <= 10; racers++) {

            System.out.println("You are " + racers);
        }
    }
}
