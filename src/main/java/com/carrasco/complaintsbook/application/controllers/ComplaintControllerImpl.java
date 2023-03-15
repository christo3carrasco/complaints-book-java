package com.carrasco.complaintsbook.application.controllers;

import com.carrasco.complaintsbook.domain.dto.ComplaintDTO;
import com.carrasco.complaintsbook.domain.entities.Complaint;
import com.carrasco.complaintsbook.domain.services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/complaints", produces = {"application/json"})
public class ComplaintControllerImpl implements ComplaintController {
    @Autowired
    private ComplaintService complaintService;

    @Override
    public Complaint postComplaint(ComplaintDTO complaintDTO) {
        Complaint complaint = new Complaint();
        complaint.setPlace(complaintDTO.getPlace());
        complaint.setType(complaintDTO.getType());
        complaint.setComment(complaintDTO.getComment());
        complaint.setUserId(complaintDTO.getUserId());
        return complaintService.createComplaint(complaint);
    }

    @Override
    public List<Complaint> getComplaint() {
        return complaintService.readComplaint();
    }

    @Override
    public Optional<Complaint> getComplaint(int id) {
        return complaintService.readComplaintId(id);
    }

    @Override
    public Complaint putComplaint(int id, ComplaintDTO complaintDTO) {
        return complaintService.updateComplaint(id, complaintDTO);
    }

    @Override
    public void deleteComplaint(int id) {
        complaintService.deleteComplaint(id);
    }

    @Override
    public List<Complaint> getComplaintUser(int id) {
        return complaintService.readComplaintUser(id);
    }
}
