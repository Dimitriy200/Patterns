import java.sql.SQLException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import util.HibernateUtil;
import javax.swing.*;
import org.hibernate.Session;
import org.hibernate.Query;

import javax.management.Query;
import javax.swing.JOptionPane;

public class ConcreteMyTableDAO implements MyTableDAO {
    
    public void addBus(MyTable myTable) throws SQLException {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(myTable);
            session.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void updateBus(Long bus_id, MyTable bus) throws SQLException {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(bus);
            session.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public MyTable getBusById(Long bus_id) throws SQLException {
        Session session = null;
        MyTable bus = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            bus = (MyTable) session.load(MyTable.class, bus_id);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return bus;
    }

    public Collection getAllBusses() throws SQLException {
        Session session = null;
        List busses = new ArrayList<MyTable>();

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            busses = session.createCriteria(MyTable.class).list();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return busses;
    }

    public void deleteBus(MyTable bus) throws SQLException {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(bus);
            session.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Collection getBussesByDriver(Driver driver) throws SQLException {
        Session session = null;
        List busses = new ArrayList<MyTable>();

        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Long driver_id = driver.getId();
            Query query = session.createQuery(
                " select b "
                + " from Bus b INNER JOIN b.drivers driver"
                + " where driver.id = :driverId "
            )
            .setLong("driverId", driver_id);
            
            busses = (List<MyTable>) query.list();
            session.getTransaction().commit();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return busses;
    }

    public Collection getBussesByRoute(Route route){
        Session session = null;
        List busses = new ArrayList<MyTable>();
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Long route_id = route.getId();
            Query query = session.createQuery(
                "from Bus where route_id = :routeId")
                .setLong("routeId", route_id);

        busses = (List<MyTable>) query.list();
        session.getTransaction().commit();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return busses;
    }
}