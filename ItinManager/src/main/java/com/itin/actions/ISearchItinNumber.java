package com.itin.actions;

import com.itin.model.SearchItinNumberRequest;
import com.itin.model.SearchItinNumberResponse;

public interface ISearchItinNumber {

    SearchItinNumberResponse searchItinNumber(SearchItinNumberRequest request);
}
