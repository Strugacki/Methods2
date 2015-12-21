package mhallman.methods.secant;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Secant secant = new Secant();
		SimpleIterations simpleIter = new SimpleIterations();
		Tangent tangent = new Tangent();
		double startingPoint=0;
		double endPoint=0;
		int numberOfLoop=0;
		double zeroValue= -1.8414;
		double zeroValue1= 1.1462;
		double mainZeroValue = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj pocz¹tek: ");
		if(in.hasNextDouble()){
			startingPoint=in.nextDouble();
			secant.setPs(startingPoint);
			simpleIter.setStartingPoint(startingPoint);
			tangent.setStartingPoint(startingPoint);
		}else{
			System.err.println("Podano nieprawid³ow¹ wartoœæ!!");
			System.exit(0);
		}
		System.out.println();
		System.out.print("Podaj koniec przedzia³u: ");
		if(in.hasNextDouble()){
			endPoint=in.nextDouble();
			secant.setPk(endPoint);
			if(secant.getPs()==secant.getPk()/* || (secant.getPs()*secant.getPk() > 0)*/){
				System.err.println("Podano nieprawid³ow¹ wartoœæ!!");
				System.exit(0);
			}
		}
		if(zeroValue>=startingPoint && zeroValue<=endPoint){
			mainZeroValue = zeroValue;
			secant.setMainZeroValue(mainZeroValue);
		}
		else if(zeroValue1>=startingPoint && zeroValue1<=endPoint && mainZeroValue!=0){
			System.out.println("B³¹d");
			System.exit(0);
		}else if(zeroValue1>=startingPoint && zeroValue1<=endPoint){
			mainZeroValue = zeroValue1;
			secant.setMainZeroValue(mainZeroValue);
			simpleIter.setMainZeroValue(mainZeroValue);
			tangent.setMainZeroValue(mainZeroValue);
		}
		System.out.println("Wybrane miejsce zerowe: "+mainZeroValue);
		System.out.println();
		System.out.print("Podaj iloœæ obrotów: ");
		
		
		System.out.println("Przedzia³‚ to <"+secant.getPs()+","+secant.getPk()+">");
		System.out.println("Iloœæ iteracji: "+numberOfLoop);
		
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
