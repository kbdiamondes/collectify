package com.capstone.collectify.repositories.ResellerRepositories;

import com.capstone.collectify.models.ResellerModule.MyCollectors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyCollectorsRepository extends CrudRepository<MyCollectors,Object> {

}
