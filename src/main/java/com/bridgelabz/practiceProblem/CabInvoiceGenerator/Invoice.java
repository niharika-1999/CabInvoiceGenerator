package com.bridgelabz.practiceProblem.CabInvoiceGenerator;
/**
 * Class invoice used to generate Invoices
 * @author Niharika Rao
 *
 */

public class Invoice {
	public int totalRides;
	public double totalFare;
	public double avgFare;

	//Initialize the variables
	public Invoice(int totalRides, double totalFare) 
	{
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.avgFare = this.totalFare / this.totalRides;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		Invoice that = (Invoice) obj;
		return totalRides == that.totalRides &&
				Double.compare(that.totalFare, totalFare) == 0 &&
				Double.compare(that.avgFare, avgFare) == 0;
	}
}
	


