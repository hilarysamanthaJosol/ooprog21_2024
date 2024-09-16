public class FirstAddressExcercise {
    public static void main(String[] args) {
        System.out.println("First Java application");
        displayAddress("Apple Inc", "1 Infinite Loop", "Cupertino", "CA", "95014");
    }

    public static void displayAddress(String companyName, String streetAddress, String city, String state, String zipCode) {
        System.out.println(companyName);
        System.out.println(streetAddress);
        System.out.println(city + ", " + state + " " + zipCode);
        System.out.println("Company : " + companyName);
    }
}
