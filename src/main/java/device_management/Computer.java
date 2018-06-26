package device_management;

import Behaviours.IOutput;
import Behaviours.Iinput;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput outputDevice;
    private Iinput inputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice, Iinput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.outputDevice = outputDevice;
    }

    public String inputData() {
        return this.inputDevice.inputData();
    }
}
