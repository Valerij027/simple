package Vehicle;


public class Vehicle {
    private int passengers;//количество пассажиров
    private int fuelcap;//объём бака в галлонах
    private int mpg;// потребление топлива в милях на галлон

    Vehicle(int p,int f,int m){
        passengers=p;
        fuelcap=f;
        mpg=m;
    }

    int range(){//дальность
        return mpg*fuelcap;
    }

    double fuelneeded(int miles){
        return (double) miles/mpg;
    }

    int getPassengers(){return passengers;}
    int getMpg(){return mpg;}
    int getFuelcap(){return fuelcap;}
    void setPassengers(int p){passengers=p;}
    void setFuelcap(int f){fuelcap=f;}
    void setMpg(int m){mpg=m;}
}
