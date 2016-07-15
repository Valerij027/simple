package Vehicle;

public class TruckDemo {
    public static void main(String args[]) {
        Truck semi = new Truck(2, 200, 7, 4444);
        double gallons = semi.fuelneeded(252);

        System.out.println("Грузовик может привезти "+semi.getCargocap()+"фунтов");
        System.out.println("Для преодаления 252 мили грузовику потребуется "+gallons +" галлон топлива");
    }
}
