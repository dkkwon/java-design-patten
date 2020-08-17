package buildervacation;

public class AccommodationTent extends Accommodation {
	int siteNumber;
	public AccommodationTent() {
		this.name = "Tent";
	}
	public AccommodationTent(String name) {
		this.name = name;
	}
	public void setSiteNumber(int n) {
		this.siteNumber = n;
	}
	public int getSiteNumber() {
		return this.siteNumber;
	}
	public String getLocation() {
		if (siteNumber == 0) return "";
		else return "Site number " + this.siteNumber;
	}
}