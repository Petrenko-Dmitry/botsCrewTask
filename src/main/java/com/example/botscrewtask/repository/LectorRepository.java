package com.example.botscrewtask.repository;

import com.example.botscrewtask.entity.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectorRepository extends JpaRepository<Lector, Long> {

    @Query(value = "SELECT l.name FROM lector l where l.name regexp :template", nativeQuery = true)
    List<String> findByNameContainingIgnoreCase(@Param("template") String template);
}
