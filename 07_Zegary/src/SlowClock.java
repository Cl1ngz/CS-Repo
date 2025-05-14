public class SlowClock extends Clock {
    private boolean shouldTick;

    public SlowClock(int hour, int minute) {
        super(hour, minute);
        shouldTick = false;
    }

    @Override
    public void tick() {
        if (shouldTick) {
            super.tick();
        }
        shouldTick = !shouldTick;
    }
}
