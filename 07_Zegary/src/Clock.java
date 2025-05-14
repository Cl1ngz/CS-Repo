public abstract class Clock {
    protected int hour;
    protected int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void tick() {
        minute++;
        if (minute >= 60) {
            minute %= 60;
            hour++;
            if (hour >= 24) {
                hour %= 24;
            }
        }
    }

    public void displayTime() {
        System.out.printf("Current time: %02d:%02d%n", hour, minute);
    }
}
