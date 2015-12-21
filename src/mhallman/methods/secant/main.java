package mhallman.methods.secant;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Secant secant = new Secant();
		SimpleIterations simpleIter = new SimpleIterations();
		Tangent tangent = new Tangent();
		double startingPoint;
		double endPoint;
		double x0;
		double x1;
		double x2;
		int numberOfLoop=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj pocz�tek: ");
		if(in.hasNextDouble()){
			startingPoint=in.nextDouble();
			secant.setPs(startingPoint);
			simpleIter.setStartingPoint(startingPoint);
			tangent.setStartingPoint(startingPoint);
		}else{
			System.err.println("Podano nieprawid�ow� warto��!!");
			System.exit(0);
		}
		System.out.println();
		System.out.print("Podaj koniec przedzia�u: ");
		if(in.hasNextDouble()){
			secant.setPk(in.nextDouble());
			if(secant.getPs()==secant.getPk()/* || (secant.getPs()*secant.getPk() > 0)*/){
				System.err.println("Podano nieprawid�ow� warto��!!");
				System.exit(0);
			}
		}
		System.out.println();
		System.out.print("Podaj ilo�� obrot�w: ");
		if(in.hasNextInt()){
			numberOfLoop=in.nextInt();
			secant.setIterations(numberOfLoop);
			simpleIter.setStepNumber(numberOfLoop);
		}else{
			System.err.println("Podano nieprawid�ow� warto��!!");
			System.exit(0);
		}
		
		
		System.out.println("Przedzia�� to <"+secant.getPs()+","+secant.getPk()+">");
		System.out.println("Ilo�� iteracji: "+numberOfLoop);
		
		
		secant.solveSecant();
		simpleIter.solveIteration();
	}

}
