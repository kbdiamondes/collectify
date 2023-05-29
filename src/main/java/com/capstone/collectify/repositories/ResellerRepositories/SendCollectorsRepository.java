package com.capstone.collectify.repositories.ResellerRepositories;

import com.capstone.collectify.models.ResellerModule.SendCollectors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SendCollectorsRepository extends CrudRepository<SendCollectors,Object> {
}
