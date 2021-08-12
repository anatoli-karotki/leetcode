package design;

public class ParkingSystem {

    private static final int BIG_TYPE = 1;
    private static final int MED_TYPE = 2;
    private static final int SMALL_TYPE = 3;

    private int bigMax;
    private int bigCapacity;
    private int mediumMax;
    private int mediumCapacity;
    private int smallMax;
    private int smallCapacity;

    public ParkingSystem(int big, int medium, int small) {
        this.bigMax = big;
        this.bigCapacity = big;
        this.mediumMax = medium;
        this.mediumCapacity = medium;
        this.smallMax = small;
        this.smallCapacity = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case BIG_TYPE:
                if (bigCapacity == 0) return false;
                bigCapacity--;
                return true;
            case MED_TYPE:
                if (mediumCapacity == 0) return false;
                mediumCapacity--;
                return true;
            case SMALL_TYPE:
                if (smallCapacity == 0) return false;
                smallCapacity--;
                return true;
            default:
                break;
        }
        return false;
    }
}
