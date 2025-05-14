public class AlarmClock extends Clock {
    private final int alarmHour;
    private final int alarmMinute;

    public AlarmClock(int hour, int minute, int alarmMinute, int alarmHour) {
        super(hour, minute);
        this.alarmMinute = alarmMinute;
        this.alarmHour = alarmHour;
    }

    @Override
    public void tick() {
        super.tick();
        if (hour == alarmHour && minute == alarmMinute) {
            System.out.println("Alarm ringing!");
        }
    }
}
