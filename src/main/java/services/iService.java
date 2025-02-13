package services;

import java.sql.SQLException;
import java.util.*;

public interface iService <T>{
    void ajouter(T t) throws SQLException;
    void supprimer(int id) throws SQLException;
    void modifier(int id, T t) throws SQLException;
    List<T> recuperer() throws SQLException;
}
