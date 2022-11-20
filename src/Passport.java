import java.util.Objects;
import java.time.LocalDate;

public class Passport {
    private final int number;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final LocalDate localDate;


    public Passport(int number, String surname, String name, String patronymic, LocalDate localDate) {
        this.number = number;

        if (surname == null || surname.isBlank()) {
            this.surname = "Укажите вашу фамилию";
        } else {
            this.surname = surname;
        }

        if (name == null || name.isBlank()) {
            this.name = "Укажите ваше имя";
        } else {
            this.name = name;
        }
        this.patronymic = patronymic;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport.Passport{" +
                "number=" + number +
                ", lastName='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + patronymic + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}