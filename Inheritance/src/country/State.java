package country;

public class State extends Country {
    String stateName;
    String placeName;
    
    public State(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName);
        this.stateName = stateName;
        this.placeName = placeName;
    }
   public void displayDetails() {
        System.out.println("\n--- Location Details ---");
        System.out.println("Continent: " + continentName);
        System.out.println("Country: " + countryName);
        System.out.println("State: " + stateName);
        System.out.println("Place: " + placeName);
    }
}