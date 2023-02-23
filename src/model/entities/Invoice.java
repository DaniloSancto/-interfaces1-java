package model.entities;

public class Invoice {

	private Double basicPaymant;
	private Double tax;

	public Invoice() {
	}

	public Invoice(Double basicPaymant, Double tax) {
		this.basicPaymant = basicPaymant;
		this.tax = tax;
	}

	public Double getBasicPaymant() {
		return basicPaymant;
	}

	public void setBasicPaymant(Double basicPaymant) {
		this.basicPaymant = basicPaymant;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return getBasicPaymant() + getTax();
	}
}
