package com.ujjwal.conferencedemo.repositories;

import com.ujjwal.conferencedemo.models.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SessionRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private SessionJPARepository jpaRepository;

    public Session create(Session session) {
        return (Session) jpaRepository.saveAndFlush(session);
    }

    public Session update(Session session) {
        return (Session) jpaRepository.saveAndFlush(session);
    }

    public void delete(Long id) {

        jpaRepository.deleteById(id);
    }

    public Session find(Long id) {

        return (Session) jpaRepository.getOne(id);
    }

    public List<Session> list() {

        return jpaRepository.findAll();
    }

    public List<Session> getSessionsThatHaveName(String name) {

        return jpaRepository.findBySessionNameContains(name);
    }
}
