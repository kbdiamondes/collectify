package com.capstone.collectify.repositories.ResellerRepositories;

import com.capstone.collectify.models.ResellerModule.AssignCollectors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignCollectorsRepository extends CrudRepository<AssignCollectors,Object> {
}