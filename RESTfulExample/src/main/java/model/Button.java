package model;

import enums.ButtonType;

import enums.Color;
import enums.DeviceType;

public class Button extends Component {
    private ButtonType type;
    private Color color;

    public Button() {

    }

    public Button(final String producer, final int power,
    		final double maxVoltage, final boolean isWorking,
    		final ButtonType type, final Color color) {
        super(producer, power, DeviceType.BUTTON, maxVoltage, isWorking);
        this.type = type;
        this.color = color;
    }

    @Override
    public final String toString() {
		return "Button [type=" + type + ", color=" + color + "]";
    }

    public final ButtonType getType() {
		return type;
    }

    public final void setType(final ButtonType type) {
	    this.type = type;
    }

    public final Color getColor() {
    	return color;
    }

    public final void setColor(final Color color) {
	    this.color = color;
    }

}


