package dao;
import entity.Address;
import java.sql.SQLException;
import java.util.List;

/**
 * 24.08.2020
 */

public interface AddressDAO {
    // create
    void add(Address address) throws SQLException;

    // read all
    List<Address> getAll() throws SQLException;

        // read from id
    Address getById(Long id) throws SQLException;

    // update
    void update(Address address) throws SQLException;

    // delete
    void remove(Address address) throws SQLException;
}
