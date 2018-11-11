package classeMetier;

public class CreditMetier implements ICreditBanque{

	@Override
	public double calculeMensualiteCredit(double capital, double taux, int duree) {
		double t = taux/100;
		double t1 = capital * t / 12;
		double t2 = 1-Math.pow(1+t/12, -duree);
		return t1/t2;
	}
	
	
}
