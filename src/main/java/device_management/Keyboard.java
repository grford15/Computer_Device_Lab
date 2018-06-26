package device_management;

import Behaviours.Iinput;

public class Keyboard implements Iinput {

    private String style;

    public Keyboard(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public String inputData() {
        return "Tap tap tap";
    }
}
