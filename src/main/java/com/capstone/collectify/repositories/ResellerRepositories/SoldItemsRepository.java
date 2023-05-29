package com.capstone.collectify.repositories.ResellerRepositories;

import com.capstone.collectify.models.ResellerModule.SoldItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldItemsRepository extends CrudRepository<SoldItems,Object> {
}

