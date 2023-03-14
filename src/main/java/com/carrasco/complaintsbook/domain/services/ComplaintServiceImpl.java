package com.carrasco.complaintsbook.domain.services;

import com.carrasco.complaintsbook.domain.dto.ComplaintDTO;
import com.carrasco.complaintsbook.domain.entities.Complaint;
import com.carrasco.complaintsbook.infrastructure.repositories.ComplaintRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Autowired
    private ComplaintRepositoryImpl complaintRepository;

    @Override
    public Complaint createComplaint(Complaint complaint) {
        return complaintRepository.createComplaint(complaint);
    }

    @Override
    public List<Complaint> readComplaint() {
        return complaintRepository.readComplaint();
    }

    @Override
    public Complaint updateComplaint(int id, ComplaintDTO complaintDTO) {
        Complaint updateComplaint = complaintRepository.readComplaintId(id).orElse(null);
        if (updateComplaint != null) {
            updateComplaint.setPlace(complaintDTO.getPlace());
            updateComplaint.setType(complaintDTO.getType());
            updateComplaint.setComment(complaintDTO.getComment());
            updateComplaint.setUserId(complaintDTO.getUserId());
        }
        return complaintRepository.createComplaint(updateComplaint);
    }

    @Override
    public void deleteComplaint(int id) {
        complaintRepository.deleteComplaint(id);
    }

    @Override
    public Optional<Complaint> readComplaintId(int id) {
        return complaintRepository.readComplaintId(id);
    }

    @Override
    public List<Complaint> readComplaintUser(int id) {
        return complaintRepository.readComplaintUser(id);
    }
}
