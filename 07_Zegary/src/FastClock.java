public class FastClock extends Clock {
    public FastClock(int hour, int minute) {
        super(hour, minute);
    }

    @Override
    public void tick() {
        minute += 2;
        if (minute >= 60) {
            minute %= 60;
            hour++;
            if (hour >= 24) {
                hour %= 24;
            }
        }
    }
}
