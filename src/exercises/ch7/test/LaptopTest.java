package exercises.ch7.test;
import org.junit.Test;
import exercises.ch7.Laptop;
import static org.junit.Assert.*;

public class LaptopTest {
    @Test
    public void laptopProperlyAssignsVariables(){
        Laptop laptop = new Laptop(1,1,1,1);
        assertEquals(1, laptop.getCpuSpeed(), .001);
        assertEquals(1, laptop.getMemoryCap(), .001);
        assertEquals(1, laptop.getBatterySize(), .001);
        assertEquals(1, laptop.getBattery(), .001);
    }
    @Test
    public void laptopProperlyRunsUnplugged(){
        Laptop laptop = new Laptop(1,1,1,1);
        laptop.runUnplugged(1);
        assertEquals(0, laptop.getBattery(),.001);
    }
    @Test
    public void laptopProperlyRunsWithTabs(){
        Laptop laptop = new Laptop(1,1,2,1);
        laptop.openTab();
        laptop.runUnplugged(1);
        assertEquals(0, laptop.getBattery(), .001);
    }
}
