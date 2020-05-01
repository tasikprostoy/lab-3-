package model;

import enums.ButtonType;

import enums.Color;
import enums.DeviceType;

public class Button extends Component {
	private ButtonType type;
	private Color color;
	
	public Button() {

	}
	
	public Button(String producer, int power,  
			double maxVoltage, boolean isWorking, ButtonType type, Color color) {
		super(producer, power, DeviceType.BUTTON, maxVoltage, isWorking);
	    this.type = type;
	    this.color = color;
	    
	}
	
	@Override
	public String toString() {
		return "Button [type=" + type + ", color=" + color + "]";
	}

	public ButtonType getType() {
		return type;
	}
	
	public void setType(ButtonType type) {
	    this.type = type;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
	    this.color = color;
	}
		
}


