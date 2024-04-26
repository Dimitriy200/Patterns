package GoF.BehavioralPatterns.ChainOfResponsibility;

public abstract class SupportHundler {
    protected SupportHundler next;
    protected int mask;

    public SupportHundler setNextHundler(SupportHundler hundler){
        next = hundler;
        return hundler;
    }

    public void message(String msg, int priority){
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }

    abstract protected void writeMessage(String msg);
}