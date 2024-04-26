package GoF.BehavioralPatterns.ChainOfResponsibility;

public class ConcreteSupportHundlerLevel_1 extends SupportHundler{
    public ConcreteSupportHundlerLevel_1(int mask){
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("ConcreteSupportHundlerA Writing to stdout: " + msg);
    }
}