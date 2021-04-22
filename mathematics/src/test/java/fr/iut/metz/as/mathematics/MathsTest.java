package fr.iut.metz.as.mathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import mathematics.Maths;

public class MathsTest {
	
	private IMaths maths;
	
	@Before
	public void setUp() {
		this.maths = new Maths();
	}
	
	@Test
	public void testAdditionNombrePositif() {
		Assert.assertEquals(maths.addition(2, 3), 5);
	}
	
	@Test
	public void testAdditionNombreNegatif() {
		Assert.assertEquals(maths.addition(-2, -3), -5);
	}
	
	@Test
	public void testAdditionNombreNegatifEtPositif() {
		Assert.assertEquals(maths.addition(2, -3), -1);
	}
	
	@Test
	public void testAdditionZeroEtPositif() {
		Assert.assertEquals(maths.addition(0, 3), 3);
	}
	
	@Test
	public void testAdditionZeroEtNegatif() {
		Assert.assertEquals(maths.addition(0, -3), -3);
	}
	
	@Test
	public void testAdditionNulle() {
		Assert.assertEquals(maths.addition(0, 0), 0);
	}	
	
	@Test
	public void testSoustractionNombrePositif() {
		Assert.assertEquals(maths.soustraction(2, 3), -1);
	}
	
	@Test
	public void testSoustractionNombreNegatif() {
		Assert.assertEquals(maths.soustraction(-2, -3), 1);
	}
	
	@Test
	public void testSoustractionNombreNegatifEtPositif() {
		Assert.assertEquals(maths.soustraction(2, -3), 5);
	}
	
	@Test
	public void testSoustractionZeroEtPositif() {
		Assert.assertEquals(maths.soustraction(0, 3), -3);
	}
	
	@Test
	public void testSoustractionZeroEtNegatif() {
		Assert.assertEquals(maths.soustraction(0, -3), 3);
	}
	
	@Test
	public void testSoustractionNulle() {
		Assert.assertEquals(maths.soustraction(0, 0), 0);
	}
	
	@Test
	public void testMultiplicationNombrePositif() {
		Assert.assertEquals(maths.multiplication(2, 3), 6);
	}
	
	@Test
	public void testMultiplicationNombreNegatif() {
		Assert.assertEquals(maths.multiplication(-2, -3), 6);
	}
	
	@Test
	public void testMultiplicationNombreNegatifEtPositif() {
		Assert.assertEquals(maths.multiplication(2, -3), -6);
	}
	
	@Test
	public void testMultiplicationZeroEtPositif() {
		Assert.assertEquals(maths.multiplication(0, 3), 0);
	}
	
	@Test
	public void testMultiplicationZeroEtNegatif() {
		Assert.assertEquals(maths.multiplication(0, -3), 0);
	}
	
	@Test
	public void testMultiplicationNulle() {
		Assert.assertEquals(maths.multiplication(0, 0), 0);
	}	
	
	@Test
	public void testDivisionNombrePositif() throws MathsExceptions  {
		Assert.assertEquals(maths.division(4, 2), 2, 0);
	}
	
	@Test
	public void testDivisionNombreNegatif() throws MathsExceptions  {
		Assert.assertEquals(maths.division(-4, -2), 2, 0);
	}
	
	@Test
	public void testDivisionNombreNegatifEtPositif() throws MathsExceptions  {
		Assert.assertEquals(maths.division(4, -2), -2, 0);
	}
	
	
	@Test(expected = MathsExceptions.class)
	public void testDivisionZero() throws MathsExceptions {
		try {
			maths.division(4,0);
		}catch (MathsExceptions e) {
			Assert.assertEquals(e.getMessage(), "Division par zéro impossible");
			throw e;
		}
	}
	
}
