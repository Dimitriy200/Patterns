import java.util.Collection;

public class Client {
    public static void main(String[] args) {
        Collection busses = Factory.getInstance().getBusDAO().getAllBusses();
        iterator = busses.iterator();
        System.out.println("========Все автобусы=========");

        while (iterator.hasNext()) {
            MyTable bus = (MyTable) iterator.next();
        }
    }
}