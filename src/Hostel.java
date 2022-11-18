import java.util.Arrays;

public class Hostel implements Rent {

    private Person[] people;

    public Hostel(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String payRent() {
        return "Oplatit arendu";
    }

    @Override
    public String toString() {
        return "Hostel{" + "people=" + Arrays.toString(people) + '}';
    }
}
