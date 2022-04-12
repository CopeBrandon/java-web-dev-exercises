package studio.studio1;

public class Area {
    public static Double calcArea(double radius){
        double area = Math.PI * radius * radius;
        area*=100;
        area = Math.round(area);
        area/=100;
        return area;
    }
}
