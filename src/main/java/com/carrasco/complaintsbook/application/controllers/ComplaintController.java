package com.carrasco.complaintsbook.application.controllers;

import com.carrasco.complaintsbook.domain.dto.ComplaintDTO;
import com.carrasco.complaintsbook.domain.entities.Complaint;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ComplaintController {
    @PostMapping(consumes = {"application/json"})
    Complaint postComplaint(@RequestBody ComplaintDTO complaintDTO);

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    List<Complaint> getComplaint();

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "/{id}")
    Optional<Complaint> getComplaint(@PathVariable(value = "id") int id);

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "/{id}", consumes = {"application/json"})
    Complaint putComplaint(@PathVariable(value = "id") int id, @RequestBody ComplaintDTO complaintDTO);

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(value = "/{id}")
    void deleteComplaint(@PathVariable(value = "id") int id);

    @GetMapping(value = "/users/{id}")
    List<Complaint> getComplaintUser(@PathVariable(value = "id") int id);
}
