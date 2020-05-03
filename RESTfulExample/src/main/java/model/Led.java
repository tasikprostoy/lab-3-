package model;

import enums.Color;
import enums.DeviceType;

public class Led extends Component {
    private Color color;

    public Led() {

    }

    public Led(final String producer, final int power,
            final double maxVoltage, final boolean isWorking, final Color color) {
        super(producer, power, DeviceType.LED, maxVoltage, isWorking);
        this.color = color;
    }

    @Override
    public final String toString() {
        return "Led [color=" + color + "]";
    }

    public final Color getColor() {
        return color;
    }

    public final void setColor(final Color color) {
        this.color = color;
    }

}
