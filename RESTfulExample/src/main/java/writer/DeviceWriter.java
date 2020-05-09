package writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import model.Device;

public class DeviceWriter {
    public void writeToFile(List<Device> devices) throws FileNotFoundException, IOException {
	
        File file = new File("devices.csv");
        try(FileOutputStream fos = new FileOutputStream(file);
	        OutputStreamWriter osw = new OutputStreamWriter(fos);
	        BufferedWriter writer = new BufferedWriter(osw)){
        	    for(Device device : devices) {
        	    	writer.write(device.getHeaders() + "\n");
        	    	writer.write(device.toCSV() + "\n");
        	    }
        }

    }

}
