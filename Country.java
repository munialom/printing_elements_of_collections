import java.util.List;

public class Country {

    //create a list of countries based on java collection array list
    //we use traditional for loop to print the elements of the arrays


    static List<String> countriesList = 
    List.of(
     "USA","China","UK","Canada","Russia","India","Australia"
   );

   static List<String> countries = 
   List.of(
    "KENYA","UGANADA","SOUTH AFRICA","MALAWI","EGYPT","TUNISIA","Australia"
  );
  
    public static void main(String[] args) {
        
        for(int i = 0; i < countriesList.size(); i++) {
            System.out.println(countriesList.get(i));
         }


         for(String country : countries) {
            System.out.println(country);
        }
    }
    
}