package exercises.ch7;

public class Computer extends AbstractEntity{
    //cpuSpeed, memory, os, calculate(), openTab()
    //needs a constructor, getters and setters, and 2 methods
    double cpuSpeed;
    double memoryCap;
    String os;
    double memory = 0;
    public Computer(double cpuSpeed, double memoryCap, int id){
        super(id);
        this.cpuSpeed = cpuSpeed;
        this.memoryCap = memoryCap;
    }
    public double getCpuSpeed() {return cpuSpeed;}
    public void setCpuSpeed(double cpuSpeed) {this.cpuSpeed = cpuSpeed;}
    public double getMemory() {return this.memory;}
    public void setMemory(double memory){this.memory=memory;}
    public double getMemoryCap() {return memoryCap;}
    public void setMemoryCap(double memoryCap) {this.memoryCap = memoryCap;}
    public String getOs() {return os;}
    public void setOs(String os) {this.os = os;}

    public double calculate(double numProcesses){
        //takes in number of processes and calculates how long it would take in seconds
        return numProcesses/cpuSpeed;
    }
    public void openTab(){
        if(memory+1<=memoryCap){
            memory+=1;
        } else {
            System.out.println("You have too many tabs open!");
        }
    }
}
