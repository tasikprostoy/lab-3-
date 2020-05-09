package model;

import enums.DeviceType;

public abstract class Device {
    private String producer;
    private int power;
    private DeviceType deviceType;

    public Device() {

    }

    public Device(final String producer, final int power,
            final DeviceType deviceType) {
        this.producer = producer;
        this.power = power;
        this.deviceType = deviceType;
    }
    public String getHeaders() {
    	return "producer, power, deviceType";
	}
    public String toCSV() {
    	return producer + "," + power + "," + deviceType.toString();
    }

    public final String getProducer() {
        return producer;
    }

    public final void setProducer(final String producer) {
		this.producer = producer;
    }

    public final int getPower() {
		return power;
    }

    public final void setPower(final int power) {
		this.power = power;
    }

    public final DeviceType getDeviceType() {
		return deviceType;
    }

    public final void setDeviceType(final DeviceType deviceType) {
		this.deviceType = deviceType;
    }

}
