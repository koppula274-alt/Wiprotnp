public

import java.util.*;

public class CountryHashtable {

    Hashtable<String, String> M1 =
            new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(
            String country, String capital) {

        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> e : M1.entrySet()) {

            if (e.getValue().equalsIgnoreCase(capital))
                return e.getKey();
        }

        return null;
    }

    public Hashtable<String, String> reverseMap() {

        Hashtable<String, String> M2 =
                new Hashtable<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {

            M2.put(e.getValue(), e.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {

        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryHashtable obj =
                new CountryHashtable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.reverseMap());
        System.out.println(obj.getCountryList());
    }
}{

}
