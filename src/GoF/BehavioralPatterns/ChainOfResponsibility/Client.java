package GoF.BehavioralPatterns.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        SupportHundler supportHundler, supportHundler1, supportHundler2;

        supportHundler = new ConcreteSupportHundlerLevel_1(1);
        supportHundler1 = supportHundler.setNextHundler(new ConcreteSupportHundlerLevel_2(2));
        supportHundler2 = supportHundler1.setNextHundler(new ConcreteSupportHundlerLevel_3(3));

        supportHundler.message("message 1", 0);
        supportHundler.message("message 2", 1);
        supportHundler.message("message 3", 2);
    }
}