import java.util.Iterator;
import java.util.TreeSet;

public class CountryTreeset4 {

    TreeSet<String> T1 = new TreeSet<>();

    // Add country
    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    // Search country
    public String getCountry(String countryName) {

        Iterator<String> it = T1.iterator();

        while (it.hasNext()) {

            String country = it.next();

            if (country.equalsIgnoreCase(countryName))
                return country;
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("USA"));
        System.out.println(obj.getCountry("Canada"));
    }
}