package model;

import enums.DeviceType;

public class Resistor extends Component {
	private double resist;
	
    public Resistor() {
		
	}
	
	public Resistor(String producer, int power, DeviceType deviceType, 
			double maxVoltage, boolean isWorking, double resist) {
		super(producer, power, deviceType, maxVoltage, isWorking);
		this.resist = resist;
	}
    
	@Override
	public String toString() {
		return "Resistor [resist=" + resist + "]";
	}

	public double getResist() {
		return resist;
	}
	
	public void setResist(double resist) {
	    this.resist = resist;
}
	
}