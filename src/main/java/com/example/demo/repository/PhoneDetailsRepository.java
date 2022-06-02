package com.example.demo.repository;

import com.example.demo.entity.PhoneDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneDetailsRepository extends JpaRepository<PhoneDetails, Long> {
}
