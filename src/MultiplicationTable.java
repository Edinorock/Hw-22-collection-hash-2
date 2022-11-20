import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private final Set<MultiplicationTask> multiplicationTasks = new HashSet<>();

    public MultiplicationTable() {
        Random random = new Random();
        while (multiplicationTasks.size() < 15) {
            multiplicationTasks.add(new MultiplicationTask(random.nextInt(9), random.nextInt(9)));}
    }

    @Override
    public String toString() {
        return "MultiplicationTable - {" +
                "MultiplicationTask - " + multiplicationTasks;
    }
}