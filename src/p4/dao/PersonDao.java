package p4.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


@Repository
public class PersonDao {

    @PersistenceContext
    private EntityManager em;



}
