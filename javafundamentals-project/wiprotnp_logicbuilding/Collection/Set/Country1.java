import java.util.HashSet;
import java.util.Iterator;

public class Country1 {

    HashSet<String> H1 = new HashSet<>();

    // Add country
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Search country
    public String getCountry(String countryName) {

        Iterator<String> it = H1.iterator();

        while (it.hasNext()) {
            String country = it.next();

            if (country.equalsIgnoreCase(countryName))
                return country;
        }

        return null;
    }

    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}