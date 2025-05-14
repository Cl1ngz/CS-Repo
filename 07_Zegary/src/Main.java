import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Clock> clocks = new ArrayList<>();
        clocks.add(new FastClock(23, 58));
        clocks.add(new SlowClock(23, 58));
        clocks.add(new AlarmClock(23, 58, 0, 0));

        System.out.println("Ticking clocks...");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nTick " + (i + 1) + ":");
            for (Clock clock : clocks) {
                clock.tick();
                clock.displayTime();
            }
        }
    }
}
