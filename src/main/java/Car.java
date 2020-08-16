public class Car extends Thread {
    private static int CARS_COUNT;
    Object obj = new Object();

    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private int number;
    private String name;

    public Car(Car car) {

    }

    public int gNumber() {
        return number;
    }
    public String gName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Машина #" + CARS_COUNT;
        this.number = CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            synchronized (obj ) {
                System.out.println(this.name + " готовится");

            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}