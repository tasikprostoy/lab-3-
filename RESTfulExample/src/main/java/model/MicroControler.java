package model;

import java.util.List;

import enums.DeviceType;
import enums.Voltage;

public class MicroControler extends Device  {
    private Voltage inputVoltage;
    private List<Component> connectedComponents;

    public MicroControler() {

    }

    public MicroControler(final String producer, final int power,
            final Voltage inputVoltage, final List<Component> connectedComponents) {
        super(producer, power, DeviceType.MICROCONTROLER);
        this.inputVoltage = inputVoltage;
        this.connectedComponents = connectedComponents;
}

    @Override
    public final String toString() {
        return "MicroControler [inputVoltage=" + inputVoltage + "]";
    }

    public final Voltage getInputVoltage() {
        return inputVoltage;
    }

    public final void setInputVolage(final Voltage inputVoltage) {
        this.inputVoltage = inputVoltage;
    }

    public final List<Component> getConnectedComponents() {
        return connectedComponents;
    }

    public final void setConnectedComponents(final List<Component> connectedComponents) {
        this.connectedComponents = connectedComponents;
    }

}
