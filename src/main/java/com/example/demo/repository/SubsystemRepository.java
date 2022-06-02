package com.example.demo.repository;

import com.example.demo.entity.Subsystem;
import com.example.demo.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubsystemRepository extends JpaRepository<Subsystem, String> {

}
