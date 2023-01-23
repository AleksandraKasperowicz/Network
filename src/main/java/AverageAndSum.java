import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageAndSum {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays. asList(1, 2, 3, 4, 5, 6, 7));

        Runnable firstTask = () ->

            System.out.println("Suma: " + numbers.stream().mapToInt(Integer::intValue).sum());

        Runnable secondTask = () ->
            System.out.println("Średnia: " + numbers.stream().mapToInt(Integer::intValue).average().getAsDouble());

        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);

        System.out.println("Main thread: " + Thread.currentThread().threadId());

        firstThread.start();
        secondThread.start();

    }
}