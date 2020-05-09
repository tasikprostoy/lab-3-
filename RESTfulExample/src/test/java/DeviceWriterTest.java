import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enums.ButtonType;
import enums.Color;
import model.Button;
import model.Device;
import model.Led;
import model.Resistor;
import writer.DeviceWriter;

public class DeviceWriterTest {
	 List<Device> devices = new LinkedList<>();
	 
	 @BeforeEach
	 public void setUP() {
	
		devices.add(new Led("Predator", 45, 5.5, true, Color.BLUE));
		devices.add(new Led("Predator", 63, 6.9, false, Color.GREEN));
		devices.add(new Resistor("Malecha", 25, 1.8, true, 300));
		devices.add(new Led("Lola", 76, 5.3, true, Color.YELLOW));
		
	 }
	 @Test
	 public void testWriteToFile() throws FileNotFoundException, IOException {
		DeviceWriter writer = new DeviceWriter();
		writer.writeToFile(this.devices);
	 }
}
