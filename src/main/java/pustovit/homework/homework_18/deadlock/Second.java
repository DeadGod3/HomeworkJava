package pustovit.homework.homework_18.deadlock;

public class Second {

    //    DeadLock = когда два потока сталкиваются в момент обратботки, создания, процесса
    private First first;

    public void setFirst(final First first) {
        this.first = first;
    }

    public synchronized String getString() {
        return "Hello from second class";
    }

    public synchronized String getStringFromFirstClass() {
        return first.getString();
    }

}
