package model;

import enums.DeviceType;

public class Resistor extends Component {
    private double resist;

    public Resistor() {

    }

    public Resistor(final String producer, final int power,
            final double maxVoltage, final boolean isWorking, final double resist) {
        super(producer, power, DeviceType.RESISTOR, maxVoltage, isWorking);
        this.resist = resist;
    }

    @Override
    public final String toString() {
        return "Resistor [resist=" + resist + "]";
    }

    public final double getResist() {
        return resist;
    }

    public final void setResist(final double resist) {
        this.resist = resist;
    }

}
