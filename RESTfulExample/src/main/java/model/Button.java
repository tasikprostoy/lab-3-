package model;

import enums.ButtonType;

import enums.Color;

public class Button {
	private ButtonType type;
	private Color color;
	
	public ButtonType getType() {
		return type;
	}
	
	public void setType(ButtonType type) {
	    this.type = type;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setcolor(Color color) {
	    this.color = color;
	}
	
	public Button() {

	}
	
	public Button(ButtonType type, Color color) {
	    this.type = type;
	    this.color = color;
	}
}


