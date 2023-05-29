package com.capstone.collectify.services.ResellerServices;

import com.capstone.collectify.models.ResellerModule.MyCollectors;
import com.capstone.collectify.repositories.ResellerRepositories.MyCollectorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MyCollectorsServiceImpl implements MyCollectorsService {
    @Autowired
    private MyCollectorsRepository myCollectorsRepository;

    // Create My Collectors
    public void createMyCollectors(MyCollectors myCollectors){
        myCollectorsRepository.save(myCollectors);
    }
    // Get all Collector
    public Iterable<MyCollectors> getMyCollectors(){
        return myCollectorsRepository.findAll();
    }
    // delete Collectors
    public ResponseEntity deleteMyCollectors(int id){
        myCollectorsRepository.deleteById(id);
        return new ResponseEntity<>("MyCollectors Deleted successfully", HttpStatus.OK);


    }
    public ResponseEntity updateMyCollectors(int id, MyCollectors myCollectors){
        MyCollectors myCollectorsForUpdate = myCollectorsRepository.findById(id).get();
        myCollectorsForUpdate.setCollectionStatus(myCollectors.getCollectionStatus());
        myCollectorsForUpdate.setRequiredCollectibles(myCollectors.getRequiredCollectibles());
        myCollectorsRepository.save(myCollectorsForUpdate);
        return new ResponseEntity("MyCollectors updated successfully", HttpStatus.OK);

    }
}
