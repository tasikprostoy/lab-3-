package manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import enums.DeviceType;
import enums.SortingType;

import model.Device;

public class DeviceManager {
	private  List<Device> devices;
	
	public static class ProducerComparator implements Comparator<Device> {

		public int compare(Device arg0, Device arg1) {
			return arg0.getProducer().compareToIgnoreCase(arg1.getProducer());
		}
		
	}
	public class PowerComparator implements Comparator<Device> {

		public int compare(Device arg0, Device arg1) {
			return Integer.compare(arg0.getPower(), arg1.getPower());
		}
		
	}
	
    public DeviceManager() {
    	devices = new LinkedList<Device>();
    }
    
	public DeviceManager(List<Device> devices) {
		this.devices = devices;
	}
	
	public List<Device> sortByProducer(SortingType sortingType) {
		devices.sort(new ProducerComparator());
		if (sortingType == SortingType.DESC) {
			Collections.reverse(devices);
		}
		return devices;
	}
	
	public List<Device> sortByPower(SortingType sortingType) {
		devices.sort(new PowerComparator());
		if (sortingType == SortingType.DESC) {
			Collections.reverse(devices);
		}
		return devices; 
	}
	
	public List<Device> filterByType(final DeviceType deviceType) {
		devices.removeIf(device -> device.getDeviceType() != deviceType);
		return devices;
		
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
	

}
