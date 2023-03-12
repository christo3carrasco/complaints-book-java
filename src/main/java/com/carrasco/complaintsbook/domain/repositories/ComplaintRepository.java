package com.carrasco.complaintsbook.domain.repositories;

import com.carrasco.complaintsbook.domain.entities.Complaint;

import java.util.List;
import java.util.Optional;

public interface ComplaintRepository {
    Complaint createComplaint(Complaint complaint);

    List<Complaint> readComplaint();

    void deleteComplaint(int id);

    Optional<Complaint> readComplaintId(int id);

    List<Complaint> readComplaintUser(int id);
}
