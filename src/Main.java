import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("Aman");
        Person person1 = new Person("Kairat");
        Person person2 = new Person("Azamat");
        Person person3 = new Person("Nurbek");
        Person[] people = {person, person2, person3, person1};

        Apartment apartment = new Apartment(people);
        System.out.println(apartment);
        int counter = 0;
        System.out.println(apartment.payForservice());
        for (Person p : apartment.getFamaly()) {
            apartment.getFamaly();
            counter++;
        }
        System.out.println(counter);


        Person person4 = new Person("Syimyk");
        Person person5 = new Person("Ilim");
        Person person6 = new Person("Bolot");
        Person person7 = new Person("Kuttubk");
        Person[] people1 = {person4, person5, person6, person7};
        Hotel hotel = new Hotel(people1);
        System.out.println(hotel);
        int counter1 = 0;
        System.out.println(hotel.payRent());
        for (Person h : hotel.getPeople()) {
            hotel.getPeople();
            counter1++;
        }
        System.out.println(counter1);


        Person person8 = new Person("Abu");
        Person person9 = new Person("Saltanat");
        Person person10 = new Person("Mirbek");
        Person person11 = new Person("Bektur");
        Person[] people2 = {person8, person9, person10, person11};
        Hostel hostel = new Hostel(people2);
        System.out.println(hostel);
        System.out.println(hostel.payRent());
        int counter2 = 0;
        for (Person hostelPerson : hostel.getPeople()) {
            hostel.getPeople();
            counter2++;
        }
        System.out.println(counter2);
        System.out.print("Adam atyn jazynyz :");
        Person[] people3 = {person, person1, person2, person3, person4, person5, person6, person7, person8, person9, person10, person11};
        findByName(scanner.nextLine(), people3);
    }


    public static void findByName(String name, Person[] people3) {
        for (Person person : people3) {
            if (person.getName().equals(name)) System.out.println(person);
        }
    }
}