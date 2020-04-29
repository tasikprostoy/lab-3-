package manager;

import java.util.List;

import model.Device;

public class DeviceManager {
	private  List<Device> devices;
    
	public DeviceManager(List<Device> devices) {
		this.devices = devices;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
	

}
