package com.capstone.collectify.services.ResellerServices;

import com.capstone.collectify.models.ResellerModule.SoldItems;
import org.springframework.http.ResponseEntity;

public interface SoldItemsService {
    void createSoldItems(SoldItems soldItems);

    Iterable<SoldItems> getSoldItems();

    ResponseEntity deleteSoldItems(int id);

    ResponseEntity updateSoldItems(int id, SoldItems soldItems);
}

