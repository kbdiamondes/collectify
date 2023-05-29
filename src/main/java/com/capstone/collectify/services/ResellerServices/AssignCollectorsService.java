package com.capstone.collectify.services.ResellerServices;

import com.capstone.collectify.models.ResellerModule.AssignCollectors;
import org.springframework.http.ResponseEntity;

public interface AssignCollectorsService{
    void createAssignCollectors(AssignCollectors assignCollectors);

    Iterable<AssignCollectors> getAssignCollectors();

    ResponseEntity deleteAssignCollectors(int id);

    ResponseEntity updateAssignCollectors(int id, AssignCollectors assignCollectors);
}