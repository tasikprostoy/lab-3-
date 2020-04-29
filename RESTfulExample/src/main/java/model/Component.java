package model;

import enums.DeviceType;

public abstract class Component extends Device {
	private double maxVoltage;
	private boolean isWorking;
	
    public Component() {
		
	}
	
	public Component(String producer, int power, DeviceType deviceType, 
			double maxVoltage, boolean isWorking) {
		super(producer, power, deviceType);
		this.maxVoltage = maxVoltage;
		this.isWorking = isWorking;
		
	}
	
	@Override
	public String toString() {
		return "Component [maxVoltage=" + maxVoltage + ", isWorking=" + isWorking + "]";
	}

	public double getMaxVoltage() {
		return maxVoltage;
	}
	
	public void setMaxVoltage(double maxVoltage) {
	    this.maxVoltage = maxVoltage;
}

	public boolean getIsWorking() {
		return isWorking;
	}
	
	public void setIsWorking(boolean isWorking) {
	    this.isWorking = isWorking;
}

}