package exercises.ch7;

public class SmartPhone extends Computer{
    double batterySize;
    double battery;
    public SmartPhone(double cpuSpeed, double memoryCap, double batterySize,int id) {
        super(cpuSpeed, memoryCap,id);
        this.os="Android";
        this.batterySize = batterySize;
        this.battery = batterySize;
    }

    public double getBatterySize(){return this.batterySize;}
    public double getBattery(){return this.battery;}
    public void runUnplugged(double calcs){
        if(this.battery==0){
            System.out.println("Your Smartphone is out of battery...");
        } else {
            double batteryReduced=(calculate(calcs)*memory+calculate(calcs));
            if(battery-batteryReduced<=0){
                batteryReduced = battery;
                System.out.println("You ran out of battery!");
            }
            battery-=batteryReduced;
            batteryReduced = Math.round(batteryReduced / batterySize * 100);
            System.out.println("You used " + batteryReduced + "% of your battery.");
        }
    }
}
