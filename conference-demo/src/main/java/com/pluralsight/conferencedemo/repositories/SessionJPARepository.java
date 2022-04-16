package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionJPARepository extends JpaRepository<Session, Long> {

    List<Session> findBySessionNameContains(String name);

    List<Session> findBySessionLengthNot(Integer sessionLength);

    List<Session> findBySessionNameNotLike(String name);

    List<Session> findBySessionLengthLessThan(Integer sessionLength);
}
