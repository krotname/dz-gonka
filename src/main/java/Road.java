public class Road extends Stage {
    private static boolean HaveWiner = false;

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    @Override
    public void go(Car c) {

        try {

            System.out.println(c.gName() + " начал этап " + (main.CurentStage) + ": " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.gName() + " закончил этап " + (main.CurentStage) + ": " + description);

            if ((!HaveWiner) && (main.CurentStage == 3)) {

                HaveWiner = true;

                System.out.println("WINNER - Машина " + c.gNumber());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
