package mhallman.methods.secant;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Secant secant = new Secant();
		SimpleIterations simpleIter = new SimpleIterations();
		Tangent tangent = new Tangent();
		double startingPoint;
		double endPoint;
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
			endPoint=in.nextDouble();
			secant.setPk(endPoint);
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
			tangent.setStepNumber(numberOfLoop);
		}else{
			System.err.println("Podano nieprawid�ow� warto��!!");
			System.exit(0);
		}
		
		
		System.out.println("Przedzia�� to <"+secant.getPs()+","+secant.getPk()+">");
		System.out.println("Ilo�� iteracji: "+numberOfLoop);
		
		System.out.println();
		System.out.println("Metoda siecznych:");
		System.out.println();
		secant.solveSecant();
		System.out.println();
		System.out.println("Metoda iteracji:");
		System.out.println();
		simpleIter.solveIteration();
		System.out.println();
		System.out.println("Metoda stycznych:");
		System.out.println();
		tangent.solveTangent();
	}

}
