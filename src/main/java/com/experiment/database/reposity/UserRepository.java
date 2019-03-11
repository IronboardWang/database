package com.experiment.database.reposity;

import com.experiment.database.entity.Address;
import com.experiment.database.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;
    public void addUserAddress() {
    User user = new User("Bob");
    em.persist(user);
    Address address1 = new Address("956");
    address1.setUser(user);
    em.persist(address1);

    Address address2 = new Address("925");
    address2.setUser(user);
    em.persist(address2);
    }
}
