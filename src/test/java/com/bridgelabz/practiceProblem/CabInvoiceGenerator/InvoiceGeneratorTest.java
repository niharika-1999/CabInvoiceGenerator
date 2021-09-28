package com.bridgelabz.practiceProblem.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
	InvoiceGenerator invoice =  new InvoiceGenerator();
	
	@Test
	public void DistanceAndTimeShouldReturnTotalFare()
	{
		InvoiceGenerator invoice =  new InvoiceGenerator();
		double distance = 2.0;
		double time = 5.0;
		double fare = invoice.calculateFare(distance, time);
		Assert.assertEquals(25.0, fare, 0.0);
	}

	@Test
	public void LessDistanceAndTimeShouldReturnMinFare()
	{
		InvoiceGenerator invoice =  new InvoiceGenerator();
		double distance = 0.1;
		double time = 1.0;
		double fare = invoice.calculateFare(distance, time);
		Assert.assertEquals(5.0, fare, 0.0);
	}

	@Test
	public void MultipleRidesShouldReturnTotalFare()
	{
		Ride[] rides = { new Ride(2.0, 5.0),new Ride(0.1, 1.0)};
		Invoice summary = invoice.calculateFare(rides);
		Invoice expectedInvoice = new Invoice(2,30.0);
		Assert.assertEquals(expectedInvoice, summary);
	}
}






