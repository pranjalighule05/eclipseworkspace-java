package country;

public class Country extends Continent {
    String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);  // call Continent constructor
        this.countryName = countryName;
    }
}

