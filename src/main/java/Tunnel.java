import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    Semaphore sem = new Semaphore(2);

    public Tunnel() {

        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            try {

                    System.out.println(c.gName() + " готовится к этапу(ждет): " + description);
                        sem.acquire();
                        System.out.println(c.gName() + " начал этап " + (main.CurentStage) + ": " + description);

                        Thread.sleep(length / c.getSpeed() * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.gName() + " закончил этап " + (main.CurentStage) + ": " + description);
                sem.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
