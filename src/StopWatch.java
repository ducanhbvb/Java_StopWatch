public class StopWatch {
    private long startTime;
    private long endTime;

    public void StopWarch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void Start() {
        this.setStartTime(System.currentTimeMillis());
    }

    public void Stop() {
        this.setEndTime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return (getEndTime() - getStartTime());
    }
}
