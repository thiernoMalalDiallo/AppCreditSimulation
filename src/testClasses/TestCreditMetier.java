package testClasses;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import classeMetier.*;

public class TestCreditMetier {

	private CreditMetier credit;
	
	@Before
	public void setUp() throws Exception {
		this.credit = new CreditMetier();
	}

	@Test
	public void testCalculeMensualiteCredit() {
		double capital = 200000;
		double taux = 4.5;
		int duree = 240;
		double resultatAttendu = 1265.2987;
		double resultatCalculer = this.credit.calculeMensualiteCredit(capital, taux, duree);
		assertEquals(resultatAttendu, resultatCalculer, 0.0001);
	}

}
