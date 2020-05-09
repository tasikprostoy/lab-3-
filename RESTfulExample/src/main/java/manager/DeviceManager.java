package manager;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import enums.DeviceType;
import enums.SortingType;

import model.Device;

public class DeviceManager {
    private List<Device> devices;
    public static class ProducerComparator implements Serializable, Comparator<Device> {

        private static final long serialVersionUID = 1L;

        public final int compare(final Device arg0, final Device arg1) {
            return arg0.getProducer().compareToIgnoreCase(arg1.getProducer());
        }

    }

    public class PowerComparator implements Comparator<Device> {

        public final int compare(final Device arg0, final Device arg1) {
            return Integer.compare(arg0.getPower(), arg1.getPower());
        }

    }

    public DeviceManager() {
        devices = new LinkedList<Device>();
    }

    public DeviceManager(final List<Device> devices) {
        this.devices = devices;
    }

    public final List<Device> sortByProducer(final SortingType sortingType) {
        devices.sort(new ProducerComparator());
        if (sortingType == SortingType.DESC) {
            Collections.reverse(devices);
        }
        return devices;
    }

    public final List<Device> sortByPower(final SortingType sortingType) {
        devices.sort(new PowerComparator());
        if (sortingType == SortingType.DESC) {
            Collections.reverse(devices);
        }
        return devices;
    }

	public final List<Device> filterByType(final DeviceType deviceType) {
        List<Device> buffer = new LinkedList<Device>(devices);
        buffer.removeIf(device -> device.getDeviceType() != deviceType);
        return buffer;

    }

    public final List<Device> getDevices() {
        return devices;
    }

    public final void setDevices(final List<Device> devices) {
        this.devices = devices;
    }

}
