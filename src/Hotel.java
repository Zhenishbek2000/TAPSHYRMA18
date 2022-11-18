import java.util.Arrays;

public class Hotel implements Rent {
    public Person[] people;

    public Hotel(Person[] people) {
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
        return "Hotel{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
