package ptwo;

interface MusicSystem {

    void SwitchOnMS();

    /*
     * {
     * System.out.println("Music System Is ON");
     * }
     */
    void SwitchOffMS();
    /*
     * {
     * System.out.println("Music System Is OFF");
     * }
     */

}

interface AC {

    void SwitchOnAC();

    /*
     * {
     * System.out.println("AC Is ON");
     * }
     */
    void SwitchOffAC();
    /*
     * {
     * System.out.println("AC Is OFF");
     * }
     */

}

class Car implements MusicSystem, AC {

    String carName;
    String carModel;

    void ShowCarInfo() {
        System.out.println("Car Details Aare " + carName + " " + carModel);
    }

    @Override
    public void SwitchOnMS() {
        System.out.println("Music System Is ON");
    }

    @Override
    public void SwitchOffMS() {
        System.out.println("Music System Is OFF");
    }

    @Override
    public void SwitchOnAC() {
        System.out.println("AC Is ON");
    }

    @Override
    public void SwitchOffAC() {
        System.out.println("AC Is ON");
    }
}

public class TestAppInterface {

    public static void main(String[] args) {

        Car carOne = new Car();
        carOne.carName = "i10";
        carOne.carModel = "2019";
        carOne.ShowCarInfo();

        carOne.SwitchOnMS();
        carOne.SwitchOffMS();

        carOne.SwitchOnAC();
        carOne.SwitchOffAC();

    }

}
