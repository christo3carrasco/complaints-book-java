package com.carrasco.complaintsbook.infrastructure.repositories;

import com.carrasco.complaintsbook.domain.entities.Complaint;
import com.carrasco.complaintsbook.domain.repositories.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ComplaintRepositoryImpl implements ComplaintRepository {
    @Autowired
    ComplaintJpaRepository db;

    @Override
    public Complaint createComplaint(Complaint complaint) {
        return db.save(complaint);
    }

    @Override
    public List<Complaint> readComplaint() {
        return db.findAll();
    }

    @Override
    public void deleteComplaint(int id) {
        db.deleteById(id);
    }

    @Override
    public Optional<Complaint> readComplaintId(int id) {
        return db.findById(id);
    }

    @Override
    public List<Complaint> readComplaintUser(int id) {
        return db.findByUserId(id);
    }
}
