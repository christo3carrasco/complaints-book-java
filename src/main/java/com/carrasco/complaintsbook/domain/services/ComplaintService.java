package com.carrasco.complaintsbook.domain.services;

import com.carrasco.complaintsbook.domain.dto.ComplaintDTO;
import com.carrasco.complaintsbook.domain.entities.Complaint;

import java.util.List;
import java.util.Optional;

public interface ComplaintService {
    Complaint createComplaint(Complaint complaint);

    List<Complaint> readComplaint();

    Complaint updateComplaint(int id, ComplaintDTO complaintDTO);

    void deleteComplaint(int id);

    Optional<Complaint> readComplaintId(int id);

    List<Complaint> readComplaintUser(int id);
}
