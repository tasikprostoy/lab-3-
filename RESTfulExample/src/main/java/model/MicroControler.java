package model;

import java.util.List;

import enums.DeviceType;
import enums.Voltage;

public class MicroControler extends Device  {
	private Voltage inputVoltage;
	private List<Component> connectedComponents;
	
    public MicroControler() {
		
	}
	
	public MicroControler(String producer, int power, 
			Voltage inputVoltage, List<Component> connectedComponents) {
		super(producer, power, DeviceType.MICROCONTROLER);
		this.inputVoltage = inputVoltage; 
		this.connectedComponents = connectedComponents;
}
    
	
	@Override
	public String toString() {
		return "MicroControler [inputVoltage=" + inputVoltage + "]";
	}

	public Voltage getInputVoltage() {
		return inputVoltage;
	}
	
	public void setInputVolage(Voltage inputVoltage) {
		this.inputVoltage = inputVoltage;
	}

	public List<Component> getConnectedComponents() {
		return connectedComponents;
	}

	public void setConnectedComponents(List<Component> connectedComponents) {
		this.connectedComponents = connectedComponents;
	}
	
	
}
