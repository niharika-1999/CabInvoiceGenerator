package com.bridgelabz.practiceProblem.CabInvoiceGenerator;
/**
 * Cab Invoice Generator produce invoices to cab service
 * @author Niharika Rao
 *
 */
public class InvoiceGenerator {
	public InvoiceGenerator()
	{
		System.out.println("Welcome to Invoice Generator System");
	}
	
	public double calculateFare(double distance, double time)
	{
		double totalFare;
		totalFare = (10 * distance) + (time * 1);
		if(totalFare<=5)
			totalFare=5.0;
		return totalFare;
	}
	
	public double calculateFare(Ride[] rides) 
	{
		double totalFare = 0.0;
		for (Ride ride : rides) 
		{
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}
	

}
