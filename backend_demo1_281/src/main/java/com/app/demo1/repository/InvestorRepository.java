package com.app.demo1.repository;


import com.app.demo1.model.Investor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class InvestorRepository extends SimpleJpaRepository<Investor, String> {
    private final EntityManager em;
    public InvestorRepository(EntityManager em) {
        super(Investor.class, em);
        this.em = em;
    }
    @Override
    public List<Investor> findAll() {
        return em.createNativeQuery("Select * from \"demo1_858\".\"Investor\"", Investor.class).getResultList();
    }
}