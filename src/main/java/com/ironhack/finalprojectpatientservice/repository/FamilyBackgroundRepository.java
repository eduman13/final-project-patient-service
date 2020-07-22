package com.ironhack.finalprojectpatientservice.repository;

import com.ironhack.finalprojectpatientservice.model.FamilyBackground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyBackgroundRepository extends JpaRepository<FamilyBackground, Long> {
}
