package mhallman.methods.secant;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Secant secant = new Secant();
		double x0;
		double x1;
		double x2;
		double[] nextValues;
		int numberOfLoop=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj początek przedziału: ");
		if(in.hasNextDouble()){
			secant.setPs(in.nextDouble());
		}else{
			System.err.println("Podano nieprawidłową wartość!!");
			System.exit(0);
		}
		System.out.println();
		System.out.print("Podaj koniec przedzialu: ");
		if(in.hasNextDouble()){
			secant.setPk(in.nextDouble());
			if(secant.getPs()==secant.getPk()/* || (secant.getPs()*secant.getPk() > 0)*/){
				System.err.println("Podano nieprawidłową wartość!!");
				System.exit(0);
			}
		}
		System.out.println();
		System.out.print("Podaj ilość obrotów: ");
		if(in.hasNextInt()){
			numberOfLoop=in.nextInt();
			nextValues = new double[numberOfLoop];
		}else{
			nextValues = new double[0];
			System.err.println("Podano nieprawidłową wartość!!");
			System.exit(0);
		}
		
		
		System.out.println("Przedział to <"+secant.getPs()+","+secant.getPk()+">");
		System.out.println("Ilość iteracji: "+numberOfLoop);
		
		x0=secant.getPs();
		x1=secant.getPk();
		
		for(int i=1;i<=numberOfLoop;i++){
			x2=secant.nextValue(x0,x1);
			x0=x1;
			x1=x2;
			nextValues[i]=x2;
			System.out.println("Kolejny wynik: "+x2);
		}
	}

}
