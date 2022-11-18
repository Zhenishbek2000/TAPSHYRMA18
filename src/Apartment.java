import java.util.Arrays;

public class Apartment implements ComService{
    private Person[]famaly;

    public Apartment(Person[] famaly) {
        this.famaly = famaly;
    }

    public Person[] getFamaly() {
        return famaly;
    }

    public void setFamaly(Person[] famaly) {
        this.famaly = famaly;
    }


    @Override
    public String payForservice() {
        return "Oplatit kom usluga";
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "famaly=" + Arrays.toString(famaly) +
                '}';
    }
}
