package model;

import enums.Color;

public class Led {
	private Color color;
	
    public Led() {
		
	}

	public Led(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
	    this.color = color;
	}
	
	
}
