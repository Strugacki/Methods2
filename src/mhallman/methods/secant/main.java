package mhallman.methods.secant;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Secant secant = new Secant();
		Function function = new Function();
		double fx0;
		double fx1;
		double fx2;
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
		}else{
			System.err.println("Podano nieprawidłową wartość!!");
			System.exit(0);
		}
		System.out.println("Przedział to <"+secant.getPs()+","+secant.getPk()+">");
		fx0=function.value(secant.getPs());
		fx1=function.value(secant.getPk());
		for(int i=1;i<=numberOfLoop;i++){
		
		}

	}

}
