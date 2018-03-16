package com.itin.controller;

import com.itin.actions.ISearchItinNumber;
import com.itin.model.SearchItinNumberRequest;
import com.itin.model.SearchItinNumberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ItinManagerController {
	@Autowired
    private ISearchItinNumber searchItinNumberAction;

	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public ResponseEntity<SearchItinNumberResponse> searchItin(@RequestBody @Valid SearchItinNumberRequest itin) {
	    SearchItinNumberResponse response = searchItinNumberAction.searchItinNumber(itin);
	    if (response == null)
        {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<SearchItinNumberResponse>(response, HttpStatus.OK);
    }

}
