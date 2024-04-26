package GoF.BehavioralPatterns.ChainOfResponsibility;

public class ConcreteSupportHundlerLevel_3 extends SupportHundler{
    public ConcreteSupportHundlerLevel_3(int mask){
        this.mask = mask;
    }

    public void writeMessage(String msg){
        System.out.println("ConcreteSupportHundlerC Sending to stderr: " + msg);
    }
}