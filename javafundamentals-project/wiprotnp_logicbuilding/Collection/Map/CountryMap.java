import java.util.*;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // 1. Save Country and Capital
    public HashMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    // 2. Get Capital
    public String getCapital(String country) {
        return M1.get(country);
    }

    // 3. Get Country
    public String getCountry(String capital) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capital))
                return entry.getKey();
        }
        return null;
    }

    // 4. Create Reverse Map
    public HashMap<String, String> reverseMap() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Get Country List
    public ArrayList<String> getCountryList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet())
            list.add(country);

        return list;
    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("Reverse Map : " + obj.reverseMap());

        System.out.println("Countries : " + obj.getCountryList());
    }
}