package com.capstone.collectify.services.ResellerServices;

import com.capstone.collectify.models.ResellerModule.SendCollectors;
import org.springframework.http.ResponseEntity;

public interface SendCollectorsService{
    void createSendCollectors(SendCollectors sendCollectors);
    Iterable<SendCollectors> getSendCollectors();
    ResponseEntity deleteSendCollectors(Long id);
    ResponseEntity updateSendCollectors(Long id, SendCollectors sendCollectors);
}