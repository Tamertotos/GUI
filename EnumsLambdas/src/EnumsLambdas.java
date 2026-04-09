import java.util.Arrays;
import java.util.Comparator;

public class EnumsLambdas {
    static void main() {
        Person[] persons = {
                new Person("Max", Sex.M, Size.XL,Country.NL),
                new Person("Jan", Sex.M, Size.S,Country.PL),
                new Person("Eva",Sex.F, Size.XS, Country.NL),
                new Person("Lina",Sex.F, Size.L, Country.DE),
                new Person("Mila",Sex.F, Size.S, Country.DE),
                new Person("Ola",Sex.F, Size.M, Country.PL)
        };


        Comparator<Person> sexThenSize = Comparator.comparing(Person::getSex).thenComparing(Person::getSize);
        Arrays.sort(persons,sexThenSize);
        printArray("Persons by sex and then size", persons);

        Arrays.sort(persons, (p1,p2) -> {
            int d = p1.getSize().compareTo(p2.getSize());
            if (d != 0) return d;
            d = p1.getName().compareToIgnoreCase(p2.getName());
            return d;
        });
        printArray("Persons by size and then name",persons);

        Country[] countries = Country.values();
        Arrays.sort(countries, (c1, c2) -> {
            int d = c1.toString().compareToIgnoreCase(c2.toString());
            return d;
        });
        printArray("Countries by name", countries);
    }

    public static <T>void printArray(String text, T[] array){
        System.out.println("\t*** " + text + " ***");
        for (T p1 : array){
            System.out.println(p1);
        }
    }
}
