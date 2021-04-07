public class RunRace extends Thread {
    private int NuberAvto;

    public RunRace(int NuberAvto) {
        this.NuberAvto = NuberAvto;
    }

    @Override
    public void run() {

        main.CurentStage = 1;
        main.race.getStages().get(0).go(main.cars[NuberAvto]);

        main.CurentStage = 2;
        main.race.getStages().get(1).go(main.cars[NuberAvto]);

        main.CurentStage = 3;
        main.race.getStages().get(2).go(main.cars[NuberAvto]);
    }
}
