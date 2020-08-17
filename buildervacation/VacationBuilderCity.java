package buildervacation;

// import java.time.LocalDate;

public class VacationBuilderCity extends VacationBuilder {	
	public VacationBuilderCity() {
		this.name = "City Vacation Builder";
	}
	public VacationBuilder addAccommodation() {
		this.accommodations.add(new AccommodationHotel());
		return this;
	}
	public VacationBuilder addAccommodation(String name) {
		this.accommodations.add(new AccommodationHotel(name));
		return this;
	}
	public VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
		Reservation reservation = new Reservation();
		reservation.setArrivalDate(year, month, day);
		reservation.setNights(nights);
		
		AccommodationHotel hotel = new AccommodationHotel(name);
		hotel.setReservation(reservation);
		hotel.setRoomNumber(location);
		this.accommodations.add(hotel);
		return this;
	}
	public VacationBuilder addEvent(String event) {
		this.events.add("See the " + event + " show");
		return this;
	}
}