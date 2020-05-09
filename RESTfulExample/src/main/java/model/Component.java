package model;

import enums.DeviceType;

public abstract class Component extends Device {
    private double maxVoltage;
    private boolean isWorking;

    public Component() {

    }

    public Component(final String producer, final int power, final DeviceType deviceType,
    		final double maxVoltage, final boolean isWorking) {
		super(producer, power, deviceType);
		this.maxVoltage = maxVoltage;
		this.isWorking = isWorking;
    }
    
    @Override
    public String getHeaders() {
    	return super.getHeaders() + ", maxVoltage, isWorking";
	}
    
    @Override
    public String toCSV() {
    	return super.toCSV() + "," + maxVoltage + "," + isWorking;
    }

    public final double getMaxVoltage() {
		return maxVoltage;
    }

    public final void setMaxVoltage(final double maxVoltage) {
	    this.maxVoltage = maxVoltage;
    }

    public final boolean getIsWorking() {
		return isWorking;
    }

    public final void setIsWorking(final boolean isWorking) {
	    this.isWorking = isWorking;
    }

}
