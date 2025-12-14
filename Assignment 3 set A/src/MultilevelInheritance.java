
// Multilevel Inheritance Example
class Continent {
    String continentName;

    Continent(String continentName) {
        this.continentName = continentName;
    }

    void displayContinent() {
        System.out.println("Continent: " + continentName);
    }
}

class Country extends Continent {
    String countryName;

    Country(String continentName, String countryName) {
        super(continentName);  // call parent constructor
        this.countryName = countryName;
    }

    void displayCountry() {
        System.out.println("Country: " + countryName);
    }
}

class State extends Country {
    String stateName;

    State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    void displayState() {
        System.out.println("State: " + stateName);
    }
}

class Place extends State {
    String placeName;

    Place(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName, stateName);
        this.placeName = placeName;
    }

    void displayPlace() {
        System.out.println("Place: " + placeName);
    }

    void displayAll() {
        displayPlace();
        displayState();
        displayCountry();
        displayContinent();
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Place obj = new Place("Asia", "India", "Maharashtra", "Pune");
        obj.displayAll();
    }
}
