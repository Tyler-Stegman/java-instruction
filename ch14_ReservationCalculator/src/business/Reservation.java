package business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private LocalDate arrivalDate, departureDate;

	public Reservation() {
		super();
	}

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public int price = 145;

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalDateFormatted(LocalDate arrivalDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(getArrivalDate());
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(getDepartureDate());
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public int getNumberOfNights() {
		int numberOfNights;
		numberOfNights = (int) ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return numberOfNights;
	}

	public NumberFormat getPricePerNightFormatted() {
		NumberFormat price = NumberFormat.getCurrencyInstance();
		return price;
	}

	public double getTotalPrice() {
		double totalPrice = getNumberOfNights() * price;
		return totalPrice;
	}

	public String getTotalPriceFormatted() {
		String totalPrice = NumberFormat.getCurrencyInstance().format(getTotalPrice());
		return totalPrice;

	}

	@Override
	public String toString() {
		return "Reservation [arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
	}

}
