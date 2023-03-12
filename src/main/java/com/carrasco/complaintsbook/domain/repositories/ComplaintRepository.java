package com.carrasco.complaintsbook.domain.repositories;

import com.carrasco.complaintsbook.domain.entities.Complaint;

import java.util.List;

public interface ComplaintRepository {
    Complaint createComplaint(Complaint complaint);

    List<Complaint> readComplaint();

    void deleteComplaint(int id);

    List<Complaint> readComplaintId(int id);

    List<Complaint> readComplaintUser(int id);
}
