package da2.sacs.u1;

import java.io.Serializable;

public class EquationPro implements Serializable {

	private double yValue;
	private double xValue;
	private double result;
	
	public double getyValue() {
		return yValue;
	}
	
	public void setyValue(double yValue) {
		this.yValue = yValue;
	}
	
	public double getxValue() {
		return xValue;
	}
	
	public void setxValue(double xValue) {
		this.xValue = xValue;
	}
	
	public double getResult(){
		double holder;
		result = (xValue-4*yValue);
		result = (2*result);
		holder = ((2*xValue)+(3*yValue));
		holder = (3*holder);
		result = result+holder;
		return result;
	}
	
}
