package com.capstone.collectify.controllers.ResellersControllers;

import com.capstone.collectify.models.ResellerModule.MyCollectors;
import com.capstone.collectify.services.ResellerServices.MyCollectorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MyCollectorsController {
    @Autowired
    MyCollectorsService myCollectorsService;

    @RequestMapping(value="/myCollectors", method = RequestMethod.POST)
    public ResponseEntity<Object> createMyCollectors(@RequestBody MyCollectors myCollectors) {
        myCollectorsService.createMyCollectors(myCollectors);
        return new ResponseEntity<>("MyCollectors created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value="/myCollectors", method = RequestMethod.GET)
    public ResponseEntity<Object> getMyCollectors() {
        return new ResponseEntity<>(myCollectorsService.getMyCollectors(), HttpStatus.OK);
    }

    @RequestMapping(value = "/myCollectors/{myCollectorsid}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteMyCollectors(@PathVariable int myCollectorsid) {
        return myCollectorsService.deleteMyCollectors(myCollectorsid);
    }

    @RequestMapping(value="/myCollectors/{myCollectorsid}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateMyCollectors(@PathVariable int myCollectorsid, @RequestBody MyCollectors myCollectors) {
        return myCollectorsService.updateMyCollectors(myCollectorsid, myCollectors);
    }
}
