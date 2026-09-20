public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        Truck truck = new Truck();
        return truck;
    }
}
