import Behaviours.IOutput;
import Behaviours.Iinput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Keyboard keyboard;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        keyboard = new Keyboard("ASCII");
        computer = new Computer(8, 512, monitor, keyboard);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputdevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter() {
        Printer printer = new Printer("Epsom", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, keyboard);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, keyboard);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canUpdateOutputDevice() {
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, keyboard);
        Printer printer = new Printer("Epsom", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canInputDataViaKeyboard() {
        Keyboard keyboard = new Keyboard("ASCII");
        Computer computer = new Computer(8, 512, monitor, keyboard);
        assertEquals("Tap tap tap", computer.inputData());
    }

    @Test
    public void canInputDataViaMouse() {
        Mouse mouse = new Mouse("Wireless");
        computer = new Computer(6, 789, monitor, mouse);
        assertEquals("Click click click", computer.inputData()); 
    }
}
