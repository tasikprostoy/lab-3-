package model;

import enums.Color;
import enums.DeviceType;

public class Led extends Component {
	private Color color;
	
    public Led() {
		
	}

	public Led(String producer, int power, 
			double maxVoltage, boolean isWorking, Color color) {
		super(producer, power, DeviceType.LED, maxVoltage, isWorking);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Led [color=" + color + "]";
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
	    this.color = color;
	}
	
	
}
