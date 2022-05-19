
public class Check {
	private double menuPrice;
	private double salesTax;
	private double tip;

	public Check(double menuPrice) {
		this.menuPrice = menuPrice;
		this.salesTax = menuPrice * 0.15;
	}

	public double getMenuPrice() {
		return this.menuPrice;
	}

	public double getSalesTax() {
		return this.salesTax;
	}

	public double getTip() {
		return this.tip;
	}

	public void setTipByPct(double tipPct ) {
		if (tipPct >= 0 && tipPct <= 100) {
			this.tip = this.getMenuPrice() * (tipPct / 100);
		}
	}
}
