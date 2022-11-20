import java.util.Objects;

public class MultiplicationTask {
    private final int num1;
    private final int num2;

    public MultiplicationTask(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiplicationTask multiplicationTask = (MultiplicationTask) o;
        return (num1 == multiplicationTask.num1 && num2 == multiplicationTask.num2)
                || (num1 == multiplicationTask.num2 && num2 == multiplicationTask.num1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1 * num2, num1 + num2);
    }

    @Override
    public String toString() {
        return String.format("\n %s * %s = ?",
                this.num1, this.num2);
    }
}