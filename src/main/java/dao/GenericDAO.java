package dao;

import entity.Project;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO <T, U> {
    // create
    void add(T t) throws SQLException;

    // read
    List<T> getAll() throws SQLException;

    T getById(U id) throws SQLException;

    // update
    void update(T t) throws SQLException;

    // delete
    void remove(T t) throws SQLException;
}
