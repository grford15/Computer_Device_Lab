package device_management;

import Behaviours.Iinput;

public class Mouse implements Iinput {
    private String type;

    public Mouse(String type) {
        this.type = type;
    }


    public String inputData() {
        return "Click click click";
    }

    public String getType() {
        return type;
    }
}
