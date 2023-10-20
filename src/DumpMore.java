import java.util.ArrayList;
import java.util.List;

public class DumpMore {
    private final List<Bay> bays;
    public DumpMore () {
        bays = new ArrayList<>();
        bays.add(new VanBay("A", 5000));
        bays.add(new VanBay("B", 3000));
        bays.add(new SmallTruckBay("C", 7000));
        bays.add(new SmallTruckBay("D", 9000));
        bays.add(new BigTruckBay("E", 12000));
    }


    public void addVehicle(Vehicle vehicle) {
        for (Bay bay : bays) {
            if (vehicle.getWeightOfTruck() < bay.getMaxWeight()){
                addVehicle(vehicle);
            }
        }
    }
}