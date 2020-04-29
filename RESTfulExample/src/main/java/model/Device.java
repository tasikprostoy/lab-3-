package model;

import enums.DeviceType;

public class Device {
	private String producer;
	private int power;
	private DeviceType deviceType; 
	
    public Device() {
		
	}
	
	public Device(String producer, int power, DeviceType deviceType) {
		this.producer = producer;
		this.power = power;
		this.deviceType = deviceType;
	}
	
	public String getProducer() {
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public DeviceType getDeviceType() {
		return deviceType;
	}
	
	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}
	
	

}
