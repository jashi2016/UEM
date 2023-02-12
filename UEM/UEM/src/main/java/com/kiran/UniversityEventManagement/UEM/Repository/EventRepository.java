package com.kiran.UniversityEventManagement.UEM.Repository;

import com.kiran.UniversityEventManagement.UEM.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
}
