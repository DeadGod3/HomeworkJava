package pustovit.homework.homework_18.deadlock;

public class First {

    //    DeadLock = когда два потока сталкиваются в момент обратботки, создания, процесса
    private Second second;

    public void setSecond(final Second second) {
        this.second = second;
    }

    public synchronized String getString() {
        return "Hello from first class";
    }

    public synchronized String getStringFromSecondClass() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return second.getString();
    }

}
