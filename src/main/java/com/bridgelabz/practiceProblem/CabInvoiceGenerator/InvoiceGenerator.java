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
		return totalFare;
	}

}
