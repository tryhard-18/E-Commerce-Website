package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Concerns;
import com.dailycodebuffer.ecommerce.website.repository.ConcernsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcernsServiceImpl implements ConcernsService{

    @Autowired
    private ConcernsRepository concernsRepository;

    @Override
    public void saveConcern(Concerns concern) {
        concernsRepository.save(concern);
    }
}
