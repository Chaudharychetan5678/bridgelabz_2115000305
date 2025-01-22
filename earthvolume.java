public class earthvolume {
    public static void main(String[] args) {
        
        double radiuskm = 6378; 
        double kmToMiles = 0.6213;

        double volume_km = (4/3) * Math.PI * Math.pow(radiuskm, 3);

        double radiusMiles = radiuskm * kmToMiles;
		
        double volume_miles = (4/3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f", volume_km, volume_miles);
    }
}
