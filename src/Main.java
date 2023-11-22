public class Main {
    public static void main(String[] args) {
        GeoLocation location1 = new GeoLocation(54.6872, 25.2797);
        GeoLocation location2 = new GeoLocation(55.1694, 23.8813);

        System.out.println("Vietovių skaičius: " + GeoLocation.getNumLocations());
        System.out.println("Pirmos vietovės platuma: " + location1.getLat() + ", ilguma: " + location1.getLon());
        System.out.println("Antros vietovės platuma: " + location2.getLat() + ", ilguma: " + location2.getLon());

    }
}