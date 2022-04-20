package com.ujjwal.conferencedemo.repositories;

import com.ujjwal.conferencedemo.models.Session;

import java.util.List;

public interface SessionCustomJpaRepository {
    List<Session> customSessions();
}
