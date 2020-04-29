package manager;

import java.util.List;

import enums.DeviceType;
import enums.SortingType;

import model.Device;

public class DeviceManager {
	private  List<Device> devices;
	
    public DeviceManager() {
    	
    }
    
	public DeviceManager(List<Device> devices) {
		this.devices = devices;
	}
	
	public List<Device> sortByProducer(SortingType sortingType) {
		return null;
	}
	
	public List<Device> sortByPower(SortingType sortingType) {
		return null;
	}
	
	public List<Device> filterByType(DeviceType deviceType) {
		return null;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
	

}
