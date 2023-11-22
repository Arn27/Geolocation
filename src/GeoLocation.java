public class GeoLocation {
    private double lat;
    private double lon;
    private static int numLocations = 0;

    public GeoLocation(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
        numLocations++;
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
