public class main {
    public static final int CARS_COUNT = 4;
    public static Car[] cars = new Car[CARS_COUNT];
    public static int CurentStage = 0;
    public static Race race = new Race(new Road(60), new Tunnel(), new Road(40),  new Road(40));
    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }

//            for (int i = 0; i < cars.length; i++) {
//                new Thread(cars[i]).start();
//                System.out.println(cars[i]);
//            }

        Thread Car0 = new Thread(cars[0]);
        Car0.start();
        Thread Car1 = new Thread(cars[1]);
        Car1.start();
        Thread Car2 = new Thread(cars[2]);
        Car2.start();
        Thread Car3 = new Thread(cars[3]);
        Car3.start();



        Car0.join();
        Car1.join();
        Car2.join();
        Car3.join();


        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");


//        for (int i = 0; i < race.getStages().size(); i++) {
//            race.getStages().get(i).go(cars[0]);
//            race.getStages().get(i).go(cars[1]);
//            race.getStages().get(i).go(cars[2]);
//            race.getStages().get(i).go(cars[3]);
//        }

        Thread Race0 = new RunRace(0);
        Thread Race1 = new RunRace(1);
        Thread Race2 = new RunRace(2);
        Thread Race3 = new RunRace(3);


        Race0.start();
        Race1.start();
        Race2.start();
        Race3.start();


        Race0.join();
        Race1.join();
        Race2.join();
        Race3.join();


        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}


