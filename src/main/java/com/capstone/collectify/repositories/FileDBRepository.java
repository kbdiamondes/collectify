package com.capstone.collectify.repositories;

import com.capstone.collectify.models.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}