package com.bridgelabz.practiceProblem.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
	@Test
	public void DistanceAndTimeShouldReturnTotalFare()
	{
		InvoiceGenerator invoice =  new InvoiceGenerator();
		double distance = 2.0;
		double time = 5.0;
		double fare = invoice.calculateFare(distance, time);
		Assert.assertEquals(25.0, fare, 0.0);
	}
	

}
