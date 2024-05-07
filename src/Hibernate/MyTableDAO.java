import java.util.Collection;
import java.sql.SQLException;

public interface MyTableDAO {
    public void addBus(MyTable bus) throws SQLException;
    public void updateBus(Long bus_id, MyTable bus) throws SQLException;
    public MyTable getBusById(Long bus_id) throws SQLException;
    public Collection getAllBusses() throws SQLException;
    public void deleteBus(MyTable bus) throws SQLException;
    public Collection getBussesByDriver(Driver driver) throws SQLException;
    public Collection getBussesByRoute(Route route) throws SQLException;
}