import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Country {

    // create a list of countries based on java collection array list
    // we use traditional for loop to print the elements of the arrays

    static List<String> countriesList = List.of(
            "USA", "China", "UK", "Canada", "Russia", "India", "Australia");

    static List<String> countries = List.of(
            "KENYA", "UGANADA", "SOUTH AFRICA", "MALAWI", "EGYPT", "TUNISIA", "Australia");

    public static void main(String[] args) {
        // using traditional for loop
        for (int i = 0; i < countriesList.size(); i++) {
            System.out.println(countriesList.get(i));
        }

        // using enhanced for loop
        for (String country : countries) {
            System.out.println(country);
        }
// using list iterator 
ListIterator<String> itr= countriesList.listIterator();
while (itr.hasNext()) {
    String country = itr.next();
    System.out.println(country);
}
      
    }

}