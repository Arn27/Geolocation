import java.util.Random;
public class GeoLocation {
    private double lat;
    private double lon;
    private static int numLocations = 0;

    // Konstruktorius be parametrų
    public GeoLocation() {
        Random rand = new Random();
        this.lat = Math.round((-90 + 180 * rand.nextDouble()) * 1e6) / 1e6;
        this.lon = Math.round((-90 + 180 * rand.nextDouble()) * 1e6) / 1e6;
        numLocations++;
    }

    // Kopijavimo konstruktorius
    public GeoLocation(GeoLocation other) {
        Random rand = new Random();
        this.lat = Math.round((other.lat + (-0.1 + 0.2 * rand.nextDouble())) * 1e6) / 1e6;
        this.lon = Math.round((other.lon + (-0.1 + 0.2 * rand.nextDouble())) * 1e6) / 1e6;
        numLocations++;
    }

    // Konstruktorius su dviem parametrais
    public GeoLocation(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
        numLocations++;
    }

    public void print() {
        System.out.println("[" + lat + ", " + lon + "]");
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public static int getNumLocations() {
        return numLocations;
    }

    public static double distance(GeoLocation loc1, GeoLocation loc2) {
        double lat1 = Math.toRadians(loc1.lat);
        double lon1 = Math.toRadians(loc1.lon);
        double lat2 = Math.toRadians(loc2.lat);
        double lon2 = Math.toRadians(loc2.lon);

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.pow(Math.sin(dLat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dLon / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = 6371 * c; // Žemės spindulys 6371km

        return Math.round(distance * 10) / 10.0;
    }
}
