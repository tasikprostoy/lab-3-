package model;


public class Component {
	private double maxVoltage;
	private boolean isWorking;
	
    public Component() {
		
	}
	
	public Component(double maxVoltage, boolean isWorking) {
		this.maxVoltage = maxVoltage;
		this.isWorking = isWorking;
		
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