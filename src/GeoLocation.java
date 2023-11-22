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
        this.lat = other.lat + Math.round((-0.1 + 0.2 * rand.nextDouble()) * 1e6) / 1e6;
        this.lon = other.lon + Math.round((-0.1 + 0.2 * rand.nextDouble()) * 1e6) / 1e6;
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
}
