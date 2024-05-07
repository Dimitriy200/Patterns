public class Factory {
    private static MyTableDAO busDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){

        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public MyTableDAO getBusDAO(){
        if (busDAO == null){
            busDAO = new BusDAOImpl();
        }
        return busDAO;
    }
}