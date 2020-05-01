import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import enums.DeviceType;
import enums.SortingType;
import manager.DeviceManager;

public class DeviceManagerTest {
	private DeviceManager manager = new DeviceManager();
	@Test
	public void testSortByProducer() {
		assertNull(manager.sortByProducer(SortingType.ASC));
	}
	
	@Test
	public void testSortByPower() {
		assertNull(manager.sortByPower(SortingType.ASC));
	}
	
	@Test
	public void testFilterByType() {
		assertNull(manager.filterByType(DeviceType.LED));
	}
	
}
