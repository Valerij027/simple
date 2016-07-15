package Enum.TrafficLight;

/**
 * Created by АбельянцX on 29.06.2016.
 */
public class DemoEnum {
    public static void main(String args[]){
        TrafficLightColorSimulator trafficLightColorSimulator=new TrafficLightColorSimulator(TrafficLightColor.GREEN);

        for(int i=0;i<9;i++){
            System.out.println(trafficLightColorSimulator.getColor());
            trafficLightColorSimulator.waitForChange();
        }
        trafficLightColorSimulator.cancel();

    }
}
