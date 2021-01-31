
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.fmi.gherkin.service.BookingService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingSteps {

	BookingService bookingService = new BookingService();
	private String result;

	@Given("^Потребителя отваря екрана за резервиране на място$")
	public void openBookingScreen() throws Throwable {
	    this.bookingService.openBookingScreen();
	}

	@When("^Потребителя въведе име на прожекция \"([^\"]*)\"$")
	public void insertScreeningName(String name) throws Throwable {
	    this.bookingService.insertScreeningName(name);
	}

	@When("^Избира място \"([^\"]*)\"$")
	public void chooseSeat(Integer seatNumber) throws Throwable {
		this.bookingService.chooseSeatNumber(seatNumber);
	}
	
	@When("^Часът е \"([^\"]*)\"$")
	public void setTime(Integer time) throws Throwable {
	   this.bookingService.setTime(time);
	}

	@When("^Натисне върху бутона за изпращане$")
	public void submitRequest() throws Throwable {
	   this.result = this.bookingService.submitRequest();
	}
	
	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void вижда_съобщение(String expectedMessage) throws Throwable {
	   assertEquals(expectedMessage, this.result);
	}

}
