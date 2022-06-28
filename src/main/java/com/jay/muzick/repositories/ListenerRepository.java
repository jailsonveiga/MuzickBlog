package com.jay.muzick.repositories;

import com.jay.muzick.models.Listener;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListenerRepository extends JpaRepository<Listener, Long> {
        List<Listener> findAllByAge(Integer age);

//        @Query("Select * FROM listener WHERE name LIKE '%?1%'")
//        List<Listener> findAllByPartialName(String query);
}
