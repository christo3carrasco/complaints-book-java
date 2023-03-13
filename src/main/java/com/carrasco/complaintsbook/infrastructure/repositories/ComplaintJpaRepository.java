package com.carrasco.complaintsbook.infrastructure.repositories;

import com.carrasco.complaintsbook.domain.entities.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintJpaRepository extends JpaRepository<Complaint, Integer> {
    List<Complaint> findByUserId(int userId);
}
