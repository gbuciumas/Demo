package com.itin.mapper;

import com.itin.entity.OrderEntity;
import com.itin.model.SearchItinNumberResponse;
import org.springframework.stereotype.Component;

@Component
public class SearchItinNumberResponseMapper {

    public SearchItinNumberResponse map(OrderEntity entity) {
        return new SearchItinNumberResponse(entity.getOrderNumber(), entity.getOrderStatus());
    }
}
