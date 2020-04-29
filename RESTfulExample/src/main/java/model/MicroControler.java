package model;

import java.util.List;

import enums.Voltage;

public class MicroControler {
	private Voltage inputVoltage;
	private List<Component> connectedComponents;
	
    public MicroControler() {
		
	}
	
	public MicroControler(Voltage inputVoltage, List<Component> connectedComponents) {
		this.inputVoltage = inputVoltage; 
		this.connectedComponents = connectedComponents;
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
