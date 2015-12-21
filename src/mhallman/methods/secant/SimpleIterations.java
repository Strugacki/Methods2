package mhallman.methods.secant;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleIterations {
	private double startingPoint;
	private int stepNumber;
	private double functionResult;
	private double result;
	int i=0;
	double mainZeroValue=0;
	private Function function = new Function();

	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public int getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(int stepNumber) {
		this.stepNumber = stepNumber;
	}

	public double getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(double startingPoint) {
		this.startingPoint = startingPoint;
	}	
	public void solveIteration() {
		do{
			functionResult = function.getTangentValue(startingPoint);
			startingPoint = round(functionResult,4);
			System.out.println("Kolejny wynik: "+startingPoint);
			i++;
		}while(mainZeroValue-startingPoint>0.0001);
		System.out.println("Potrzeba by³o tyle: "+i+" obrotów");
	}
	
	public double getMainZeroValue() {
		return mainZeroValue;
	}


	public void setMainZeroValue(double mainZeroValue) {
		this.mainZeroValue = mainZeroValue;
	}
}
