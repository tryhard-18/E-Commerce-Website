package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Cart;
import com.dailycodebuffer.ecommerce.website.entity.UserCart;
import com.dailycodebuffer.ecommerce.website.repository.UserCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCartServiceImpl implements UserCartService {

    @Autowired
    private UserCartRepository userCartRepository;

    @Override
    public void saveProduct(UserCart cart) {
        userCartRepository.save(cart);
    }

    @Override
    public List<UserCart> findByUserId(Long sno) {
        return userCartRepository.findByUserId(sno);
    }

    @Override
    public void deleteItemById(Long sno) {
        userCartRepository.deleteById(sno);
    }

    @Override
    public UserCart findById(Long sno) {
        return userCartRepository.findById(sno).get();
    }

    @Override
    public void saveRealMe7i(UserCart cart) {
        userCartRepository.save(cart);
    }

    @Override
    public void savePredator(UserCart cart) {
        userCartRepository.save(cart);
    }

}
