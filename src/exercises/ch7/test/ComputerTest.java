package exercises.ch7.test;

import org.junit.Test;

import exercises.ch7.Computer;

import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void computerProperlyAssignsVars(){
        Computer comp = new Computer(1,1, 1);
        assertEquals(1, comp.getCpuSpeed(), .001);
        assertEquals(1,comp.getMemoryCap(),.001);
    }
    @Test
    public void computerProperlyCalcs(){
        Computer comp = new Computer(1,1, 1);
        assertEquals(1,comp.calculate(1),.001);
    }
    @Test
    public void computerProperlyOpensTabs(){
        Computer comp = new Computer(1,1,1);
        comp.openTab();
        assertEquals(1,comp.getMemory(),.001);
    }
}
