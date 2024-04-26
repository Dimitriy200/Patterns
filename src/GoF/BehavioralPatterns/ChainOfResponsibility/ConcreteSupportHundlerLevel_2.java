package GoF.BehavioralPatterns.ChainOfResponsibility;

public class ConcreteSupportHundlerLevel_2 extends SupportHundler{
    public ConcreteSupportHundlerLevel_2(int mask){
        this.mask = mask;
    }

    public void writeMessage(String msg){
        System.out.println("ConcreteSupportHundlerB Sending via email: " + msg);
    }
}