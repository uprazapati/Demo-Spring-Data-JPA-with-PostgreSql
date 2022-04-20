package com.ujjwal.conferencedemo.repositories;

import com.ujjwal.conferencedemo.models.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketTypeJpaRepository extends JpaRepository<TicketType, String> {

    List<TicketType> findByIncludesWorkshopTrue();
}
