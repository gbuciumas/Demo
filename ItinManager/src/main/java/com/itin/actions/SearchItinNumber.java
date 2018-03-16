package com.itin.actions;

import com.itin.entity.OrderEntity;
import com.itin.mapper.SearchItinNumberResponseMapper;
import com.itin.model.SearchItinNumberRequest;
import com.itin.model.SearchItinNumberResponse;
import com.itin.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchItinNumber implements ISearchItinNumber{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private SearchItinNumberResponseMapper mapper;

    @Override
    public SearchItinNumberResponse searchItinNumber(SearchItinNumberRequest request) {
        OrderEntity entity = orderRepository.findByOrderNumber(request.getOrderNumber());
        if (entity == null)
        {
            return null;
        }
        return mapper.map(entity);
    }
}
