package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		double a = 8;
		double b = 3;
		
		double linkeSeite = (a*a);
		double mitte = (2*a*b);
		double rechteSeite = (b*b);
		
		double loesung = linkeSeite + mitte + rechteSeite;
		
		System.out.println(" Lösung ist = " + loesung);
	}

}
