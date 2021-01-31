package org.fmi.gherkin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.fmi.gherkin.model.Genre;
import org.fmi.gherkin.model.Movie;
import org.fmi.gherkin.model.Screening;
import org.joda.time.DateTime;

public class BookingService {

	private final List<Screening> screenings = new ArrayList<Screening>(
		Arrays.asList(
				new Screening(
					new Movie("Movie 16", 150, new Genre("Comedy")), 
					new DateTime(DateTime.parse("2020-12-25T16:00:00Z")),
					new ArrayList<Boolean>(
						Arrays.asList(true, false)))
	));
	
	private String movieName;
	private Integer seatNumber;

	private Integer screeningTime;
	
	
	public void openBookingScreen() {
		System.out.println("We are on the booking screen!");
	}

	public void insertScreeningName(String name) {
		this.movieName = name;
	}

	public void chooseSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String submitRequest() {
		
		Screening currentScreening = this.screenings
									.stream()
									.filter(s -> s.movie.getName().equals(this.movieName))
									.findFirst()
									.orElse(null);
		
		Boolean movieHasAScreeningPlanned = currentScreening != null;
		
		if(!movieHasAScreeningPlanned) {
			return "Няма такава прожекция!";
		}
		
		Boolean isLateForBooking = currentScreening.getStartingTime().getHourOfDay() - this.screeningTime < 1;
		Boolean seatIsTaken = currentScreening.getSeats().get(this.seatNumber - 1) == false;
		
		
		if(!isLateForBooking && !seatIsTaken) {
			return "Успешно резервирахте билет!";
		}
		
		if(isLateForBooking && !seatIsTaken) {
			return "Закъсняхте за този филм!";
		}
		
		if(isLateForBooking && seatIsTaken) {
			return "Закъсняхте за този филм и мястото е заето!";
		}
		
		if(!isLateForBooking && seatIsTaken) {
			return "Мястото е заето!";
		}
		
		return null;
	}

	public void setTime(Integer time) {
		this.screeningTime = time;
		
	}

	
}
