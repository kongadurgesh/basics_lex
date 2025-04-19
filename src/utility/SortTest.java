package utility;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    public void testSortTest() {
        ArrayList<String> companies = new ArrayList<>();
        companies.add("IBM");
        companies.add("Google");
        companies.add("Infosys");

        Collections.sort(companies);

        for (String company : companies) {
            System.out.println(company);
        }
    }
}
