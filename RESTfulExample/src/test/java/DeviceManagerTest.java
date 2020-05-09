import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enums.ButtonType;
import enums.Color;
import enums.DeviceType;
import enums.SortingType;
import manager.DeviceManager;
import model.Button;
import model.Device;
import model.Led;
import model.Resistor;

public class DeviceManagerTest {
    private DeviceManager manager = new DeviceManager();
    @BeforeEach
    public void setUP() {
		List<Device> devices = new LinkedList<>();
		
		devices.add(new Led("Predator", 45, 5.5, true, Color.BLUE));
		devices.add(new Led("Predator", 63, 6.9, false, Color.GREEN));
		devices.add(new Button("Pikchu", 32,  5.4, true, ButtonType.PULL_DOWN, Color.BLACK));
		devices.add(new Resistor("Malecha", 25, 1.8, true, 300));
		devices.add(new Button("Pikachu", 23,  5.1, false, ButtonType.PULL_UP, Color.RED));
		devices.add(new Led("Lola", 76, 5.3, true, Color.YELLOW));
		
		manager.setDevices(devices);
    }
	
    @Test
    public void testSortByProducer() {
		List<Device> devices = manager.sortByProducer(SortingType.ASC);
		assertEquals(devices.get(0).getProducer(), "Lola");
		assertEquals(devices.get(1).getProducer(), "Malecha");
    }
	
    @Test
    public void testSortByPower() {
		List<Device> devices = manager.sortByPower(SortingType.DESC);
		assertEquals(devices.get(0).getPower(), 76);
		assertEquals(devices.get(1).getPower(), 63);
		assertEquals(devices.get(2).getPower(), 45);
    }
	
    @Test
    public void testFilterByType() {
		List<Device> devices = manager.filterByType(DeviceType.LED);
		assertEquals(devices.size(), 3);

    }
	
}
